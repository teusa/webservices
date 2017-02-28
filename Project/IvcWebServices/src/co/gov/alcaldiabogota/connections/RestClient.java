package co.gov.alcaldiabogota.connections;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
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

    /**
     *
     * @param serverRest
     * @param parameters
     * @return response from connection server
     */
    public String requestRestServer(String serverRest, Map<String, String> parameters) throws IOException {
        try {
            if (Optional.ofNullable(parameters).isPresent()) {
                URL url = new URL(serverRest);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("POST");
                connection.setDoOutput(true);
                this.streamWriter(connection.getOutputStream(), parameters);
                this.bufferRead(connection, connection.getResponseCode(), connection.getInputStream(), serverRest);
                connection.disconnect();
                return connection.getResponseMessage();
            } else {
                URL url = new URL(serverRest);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setDoOutput(true);
                StringBuilder builder = new StringBuilder();
                builder.append(readBody(connection.getInputStream()).toString("UTF-8"));
                //LOGGER.log(Level.INFO, "Builder: {0}", new Object[]{builder});
                return builder.toString();
            }
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, null, ex);
            return "Error";
        }
    }

    /**
     * Writer to connection
     *
     * @param outputStream
     * @param parameters
     */
    private void streamWriter(OutputStream outputStream, Map<String, String> parameters) throws UnsupportedEncodingException, IOException {
        OutputStreamWriter wr = new OutputStreamWriter(outputStream);
        for (Map.Entry<String, String> parameter : parameters.entrySet()) {
            wr.write(URLEncoder.encode(parameter.getKey(), "UTF-8") + "=" + URLEncoder.encode(parameter.getValue(), "UTF-8"));
            wr.write("&");
        }
        wr.flush();
    }

    /**
     *.toString()
     * @param connection
     * @param responseCode
     * @param inputStream
     * @param serverRest
     * @throws IOException
     */
    private void bufferRead(HttpURLConnection connection, int responseCode, InputStream inputStream, String serverRest) throws IOException {
        StringBuilder headers = this.viewHeaders(connection);
        LOGGER.log(Level.INFO, "URL: {0}\n Headers: {1}\n", new Object[]{serverRest, headers});
        if (responseCode == HttpURLConnection.HTTP_OK) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                String line = reader.readLine();
                while (line != null) {
                    line = reader.readLine();
                }
            }
        }
    }

    /**
     *
     * @param connection
     * @return
     * @throws IOException
     */
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

    /**
     *
     * @param inputStream
     * @return
     */
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