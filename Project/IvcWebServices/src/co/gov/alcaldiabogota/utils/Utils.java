package co.gov.alcaldiabogota.utils;

import co.gov.alcaldiabogota.IvcWebServices;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

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

        Boolean is = false;
        Boolean isEntity = false;
        Boolean isAction = false;

        Entities entitiesObject = new Entities();
        Actions actionsObject = new Actions();

        Map<String, String> entities = entitiesObject.Entities();
        Map<String, String> actions = actionsObject.Actions();

        for (Map.Entry<String, String> action : actions.entrySet()) {

            if (action.getValue().toLowerCase().equals(tableName.toLowerCase())) {
                LOGGER.log(Level.INFO, "Key: {0}, Value: {1}", new Object[]{action.getKey(), action.getValue()});
                isEntity = true;
            }

        }
        for (Map.Entry<String, String> entity : entities.entrySet()) {
            is = false;
            if (entity.getKey().equals(entityId)) {
                LOGGER.log(Level.INFO, "Key: {0}, Value: {1}", new Object[]{entity.getKey(), entity.getValue()});
                isAction = true;
            }

        }

        if (isEntity && isAction) {
            is = true;
        }

        return is;
    }

    public static String getCharacterDataFromElement(Element e) {
        Node child = e.getFirstChild();
        if (child instanceof CharacterData) {
            CharacterData cd = (CharacterData) child;
            return cd.getData();
        }
        return "?";
    }

}
