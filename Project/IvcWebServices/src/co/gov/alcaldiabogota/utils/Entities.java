package co.gov.alcaldiabogota.utils;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jesusrodriguezmiranda
 */
public class Entities {

    public Entities() {
    }
    
    public Map Entities() {
        
        Map<String, String> entities = new HashMap<>();
        entities.put("1", "Ambiente");
        entities.put("2", "Salud");
        entities.put("3", "Gobierno");
        entities.put("4", "Bomberos");
        
        return entities;
        
    }
}
