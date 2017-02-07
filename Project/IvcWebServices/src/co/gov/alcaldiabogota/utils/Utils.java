/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.alcaldiabogota.utils;

import co.gov.alcaldiabogota.IvcWebServices;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesusrodriguezmiranda
 */
public class Utils {
     private final static Logger LOGGER = Logger.getLogger(IvcWebServices.class.getName());

    public static boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean isTableName(String entityId, String tableName) {
        Map<String, String> entities = new HashMap<>();
        entities.put("1", "Ambiente");
        entities.put("2", "Salud");
        entities.put("3", "Gobierno");
        entities.put("4", "Bomberos");
        
        Boolean is = false;      
      

        for (Map.Entry<String, String> entity : entities.entrySet()) {
            
            
            if (isNumeric(entityId) && ((entity.getValue() == null ? tableName == null : entity.getValue().toLowerCase().equals(tableName.toLowerCase())) 
                    && (entity.getKey() == null ? entityId == null : entity.getKey().equals(entityId)))) {
                LOGGER.log(Level.INFO, "Key: {0}, Value: {1}", new Object[]{entity.getKey(), entity.getValue()});
                is = true;
            }
              
        }

        return is;
    }

}
