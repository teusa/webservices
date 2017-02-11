/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.alcaldiabogota.parameters;

import com.sun.corba.se.impl.orbutil.GetPropertyAction;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import static java.security.AccessController.doPrivileged;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author jesusrodriguezmiranda
 */
public final class PropertiesFile {

    private final static Logger LOGGER = Logger.getLogger(PropertiesFile.class.getName());
    
    String tempDir = System.getProperty("java.io.tmpdir");
    String propertiesFile = tempDir + "/config.properties";

    public PropertiesFile() throws IOException {
        this.ifExistPropertiesFile();
    }

    public void ifExistPropertiesFile() throws IOException {
        
        LOGGER.log(Level.INFO, "Temp: {0}", System.getProperty("java.io.tmpdir"));
        
        File file = new File(propertiesFile);
        if(!file.exists() && !file.isDirectory()) { 
            LOGGER.log(Level.INFO, "Path: {0}", file.getAbsolutePath());
            this.createPropertiesFile();
        } else {            
            LOGGER.log(Level.INFO, "Path: {0}", file.lastModified());
        }
        
        /*if (!file.isFile()) {
            LOGGER.log(Level.INFO, "INPUT: ");
            this.createPropertiesFile();
        }*/
    }

    public void createPropertiesFile() {

        Properties prop = new Properties();
        OutputStream output = null;

        try {

            output = new FileOutputStream(propertiesFile);

            // set the properties value
            prop.setProperty("SchemaIVC", "http://ivcWebServices.alcaldiabogota.gov.co/xsd");
            //prop.setProperty("RestApiFront", "http://172.31.18.14/apirest_ivc/backend/web/api/establishment");
            prop.setProperty("RestApiFront", "http://192.168.88.244/apirest_ivc/backend/web/api/establishment");
            prop.setProperty("MaxTotalConnections", "20");
            prop.setProperty("ConnectionTimeout", "20000");//mills

            prop.setProperty("SchemaHealthEntity", "http://tempuri.org/");
            prop.setProperty("WsdlURLHealthEntity", "http://dev.saludcapital.gov.co/sivigiladcpruebas/WebServiceVigiaDC.asmx?wsdl");
            prop.setProperty("LoginSoapHealthEntity", "pruebasIVC");
            prop.setProperty("PasswordSoapHealthEntity", "Usu123");

            // save properties to file
            prop.store(output, null);

        } catch (IOException io) {
            LOGGER.log(Level.SEVERE, null, io);
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    LOGGER.log(Level.SEVERE, null, e);
                }
            }

        }
    }

}
