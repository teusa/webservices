package co.gov.alcaldiabogota.connection;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesusrodriguezmiranda
 */
public class RestClient {

    private final static Logger LOGGER = Logger.getLogger(RestClient.class.getName());

    public RestClient() {
    }

    public String requestRestServer(String serverRest, Map<String, String> parameters) {
        try {

            Optional paramOptional = Optional.ofNullable(parameters);

            if (paramOptional.isPresent()) {

                URL url = new URL(serverRest);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                connection.setDoOutput(true);
                OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());

                for (Map.Entry<String, String> parameter : parameters.entrySet()) {
                    //LOGGER.log(Level.INFO, "JSON: {0}\n", new Object[]{URLEncoder.encode(parameter.getKey(), "UTF-8") + "=" + URLEncoder.encode(parameter.getValue(), "UTF-8")});
                    wr.write(URLEncoder.encode(parameter.getKey(), "UTF-8") + "=" + URLEncoder.encode(parameter.getValue(), "UTF-8"));
                    wr.write("&");
                }
                wr.flush();
                
                StringBuilder headers = viewHeaders(connection);
                //LOGGER.log(Level.INFO, "URL: {0}\n Headers: {1}\n", new Object[]{serverRest, headers});                
                
                if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                    try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                        String line = reader.readLine();
                        while (line != null) {
                            line = reader.readLine();
                        }
                    }
                }
                
                connection.disconnect();

                return connection.getResponseMessage();

            } else {
                return "No object establishment defined";
            }

        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, null, ex);
            return "Error";
        }
    }
    
    private StringBuilder viewHeaders(HttpURLConnection connection) throws IOException {        
        StringBuilder builder = new StringBuilder();        
        builder.append(connection.getResponseCode())
                .append(" ")
                .append(connection.getResponseMessage())
                .append("\n");
        Map<String, List<String>> map = connection.getHeaderFields();        
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() == null) {
                continue;
            }
            builder.append(entry.getKey())
                    .append(": ");
            List<String> headerValues = entry.getValue();
            Iterator<String> it = headerValues.iterator();
            if (it.hasNext()) {
                builder.append(it.next());

                while (it.hasNext()) {
                    builder.append(", ")
                            .append(it.next());
                }
            }
            builder.append("\n");
        }

        builder.append(readBody(connection.getInputStream()).toString("UTF-8"));
        
        return builder;
    }
    
    private ByteArrayOutputStream readBody(InputStream inputStream) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) != -1) {
                baos.write(buffer, 0, length);
            }
            return baos;
        } catch (IOException ex) {
            LOGGER.log(Level.INFO, null, ex);
            return null;
        }
    }

}
