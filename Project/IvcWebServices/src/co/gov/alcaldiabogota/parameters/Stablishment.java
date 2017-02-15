package co.gov.alcaldiabogota.parameters;



import co.gov.alcaldiabogota.responses.ResponsesIVC;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.apache.axiom.om.OMElement;

/**
 *
 * @author jesusrodriguezmiranda
 */
public final class Stablishment {

    public Stablishment() {
    }

    public Stablishment(OMElement requestElement, ResponsesIVC ivc, Properties properties) {
        this.setStablishmentParameters(requestElement, ivc, properties);
    }

    public Map setStablishmentParameters(OMElement requestElement, ResponsesIVC ivc, Properties properties) {

        Map<String, String> parameters = new HashMap<>();

        if (requestElement != null) {            
            // List of parameters to object Stablishment
            parameters.put("upz", ivc.getRequestParam(requestElement, "upz", properties));
            parameters.put("lastname_owner", ivc.getRequestParam(requestElement, "lastname_owner", properties));
            parameters.put("lastname_legal_representative",  ivc.getRequestParam(requestElement, "lastname_legal_representative", properties));
            parameters.put("ciiu1", ivc.getRequestParam(requestElement, "ciiu1", properties));
            parameters.put("ciiu2", ivc.getRequestParam(requestElement, "ciiu2", properties));
            parameters.put("ciiu3", ivc.getRequestParam(requestElement, "ciiu3", properties));
            parameters.put("address_commercial", ivc.getRequestParam(requestElement, "address_commercial", properties));
            parameters.put("address_standard", ivc.getRequestParam(requestElement, "address_standard", properties));
            parameters.put("address_notification",  ivc.getRequestParam(requestElement, "address_notification", properties));
            parameters.put("date_end_commercial_registration",  ivc.getRequestParam(requestElement, "date_end_commercial_registration", properties));
            parameters.put("date_commercial_registration",  ivc.getRequestParam(requestElement, "date_commercial_registration", properties));
            parameters.put("formal",  ivc.getRequestParam(requestElement, "formal", properties));
            parameters.put("digit_verification_establishment",  ivc.getRequestParam(requestElement, "digit_verification_establishment", properties));
            parameters.put("digit_verification_owner",  ivc.getRequestParam(requestElement, "digit_verification_owner", properties));
            parameters.put("digit_verification_legal_representative",  ivc.getRequestParam(requestElement, "digit_verification_legal_representative", properties));
            parameters.put("locality",  ivc.getRequestParam(requestElement, "locality", properties));
            parameters.put("email",  ivc.getRequestParam(requestElement, "email", properties));
            parameters.put("commercial_registration",  ivc.getRequestParam(requestElement, "commercial_registration", properties));
            parameters.put("commercial_registration_owner",  ivc.getRequestParam(requestElement, "commercial_registration_owner", properties));
            parameters.put("number_identification_establishment",  ivc.getRequestParam(requestElement, "number_identification_establishment", properties));
            parameters.put("number_identification_owner",  ivc.getRequestParam(requestElement, "number_identification_owner", properties));
            parameters.put("number_identificacion_legal_representative",  ivc.getRequestParam(requestElement, "number_identificacion_legal_representative", properties));
            parameters.put("name_commercial",  ivc.getRequestParam(requestElement, "name_commercial", properties));
            parameters.put("name_owner",  ivc.getRequestParam(requestElement, "name_owner", properties));
            parameters.put("name_legal_representative",  ivc.getRequestParam(requestElement, "lastname_owner", properties));
            parameters.put("observation",  ivc.getRequestParam(requestElement, "observation", properties));
            parameters.put("observation_history",  ivc.getRequestParam(requestElement, "observation_history", properties));
            parameters.put("page_web",  ivc.getRequestParam(requestElement, "page_web", properties));
            parameters.put("business_name",  ivc.getRequestParam(requestElement, "business_name", properties));
            parameters.put("phone",  ivc.getRequestParam(requestElement, "phone", properties));
            parameters.put("type_history",  ivc.getRequestParam(requestElement, "type_history", properties));
            parameters.put("type_identification_establishment",  ivc.getRequestParam(requestElement, "type_identification_establishment", properties));
            parameters.put("type_identification_owner", ivc.getRequestParam(requestElement, "type_identification_owner", properties));
            parameters.put("type_identification_legal_representative", ivc.getRequestParam(requestElement, "type_identification_legal_representative", properties));
        } else {
            parameters = null;
            
        }
        return parameters;
    }

}
