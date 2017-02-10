/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.alcaldiabogota.parameters;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesusrodriguezmiranda
 */
public final class PropertiesFile {
    
    private final static Logger LOGGER = Logger.getLogger(PropertiesFile.class.getName());
    InputStream input = null;

    public PropertiesFile() {
        this.ifExistPropertiesFile();
    }
    
    public void ifExistPropertiesFile() {
        
        /*try {
            input = new FileInputStream("config.properties");
        } catch (FileNotFoundException ex) {            
            //LOGGER.log(Level.SEVERE, null, ex);
            this.createPropertiesFile();
        }*/
        this.createPropertiesFile();
    }
    
    public void createPropertiesFile() {

        Properties prop = new Properties();
        OutputStream output = null;

        try {

            output = new FileOutputStream("config.properties");

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
