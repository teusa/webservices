package co.gov.alcaldiabogota.connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
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
                    wr.write(URLEncoder.encode(parameter.getKey(), "UTF-8") + "=" + URLEncoder.encode(parameter.getValue(), "UTF-8"));
                    wr.write("&");
                }
                wr.flush();

                if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                    try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                        String line = reader.readLine();
                        while (line != null) {
                            line = reader.readLine();
                        }
                    }
                }

                String headers = "";
                Map<String, List<String>> mapHeaders = connection.getHeaderFields();
                for (Map.Entry<String, List<String>> entry : mapHeaders.entrySet()) {
                    headers += entry.getKey() + " = " + entry.getValue() + "\n";
                }

                LOGGER.log(Level.INFO, "URL: {0}\n Response code: {1}\n Headers: {2}", new Object[]{serverRest, String.valueOf(connection.getResponseCode()), headers});
                connection.disconnect();
                
                return connection.getResponseMessage();

            } else {
                return "";
            }

        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, null, ex);
            return "Error";
        }
    }

}