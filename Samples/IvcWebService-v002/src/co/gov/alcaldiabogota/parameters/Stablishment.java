package co.gov.alcaldiabogota.parameters;

import co.gov.alcaldiabogota.IvcWebService;
import co.gov.alcaldiabogota.ivcwebservice.InIvcWebService;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesusrodriguezmiranda
 */
public class Stablishment {
    
    private final static Logger LOGGER = Logger.getLogger(IvcWebService.class.getName());

    public Stablishment() {
    }
    
    public Map Stablishment(Optional<InIvcWebService> inIvcWebService) {
        return this.setStablishmentParameters(inIvcWebService);               
    }

    public Map setStablishmentParameters(Optional<InIvcWebService> inIvcWebService) {
        
        /*
        Removing null checks with Optional to Java 8
        */        
        Map<String, String> parameters = new HashMap<>();
        
        if ( inIvcWebService.isPresent() ) {
            
            LOGGER.log(Level.INFO, "Stablishment: {0}\n Object: {1}", new Object[]{inIvcWebService.get().getStablishment().getBusiness_name(), String.valueOf(inIvcWebService)});
            
            // List of parameters to object Stablishment    
            parameters.put("upz", inIvcWebService.get().getStablishment().getUpz() );
            parameters.put("lastname_owner", inIvcWebService.get().getStablishment().getLastname_owner());
            parameters.put("lastname_legal_representative", inIvcWebService.get().getStablishment().getLastname_legal_representative());
            parameters.put("ciiu1", inIvcWebService.get().getStablishment().getCiiu1());
            parameters.put("ciiu2", inIvcWebService.get().getStablishment().getCiiu2());
            parameters.put("ciiu3", inIvcWebService.get().getStablishment().getCiiu3());
            parameters.put("address_commercial", inIvcWebService.get().getStablishment().getAddress_commercial());
            parameters.put("address_standard", inIvcWebService.get().getStablishment().getAddress_standard());
            parameters.put("address_notification", inIvcWebService.get().getStablishment().getAddress_notification());
            parameters.put("date_end_commercial_registration", inIvcWebService.get().getStablishment().getDate_end_commercial_registration());
            parameters.put("date_commercial_registration", inIvcWebService.get().getStablishment().getDate_commercial_registration());
            parameters.put("formal", inIvcWebService.get().getStablishment().getFormal());
            parameters.put("digit_verification_establishment", inIvcWebService.get().getStablishment().getDigit_verification_establishment());
            parameters.put("digit_verification_owner", inIvcWebService.get().getStablishment().getDigit_verification_owner());
            parameters.put("digit_verification_legal_representative", inIvcWebService.get().getStablishment().getDigit_verification_legal_representative());
            parameters.put("locality", inIvcWebService.get().getStablishment().getLocality());
            parameters.put("email", inIvcWebService.get().getStablishment().getEmail());
            parameters.put("commercial_registration", inIvcWebService.get().getStablishment().getCommercial_registration());
            parameters.put("commercial_registration_owner", inIvcWebService.get().getStablishment().getCommercial_registration_owner());
            parameters.put("number_identification_establishment", inIvcWebService.get().getStablishment().getNumber_identification_establishment());
            parameters.put("number_identification_owner", inIvcWebService.get().getStablishment().getNumber_identification_owner());
            parameters.put("number_identificacion_legal_representative", inIvcWebService.get().getStablishment().getNumber_identificacion_legal_representative());
            parameters.put("name_commercial", inIvcWebService.get().getStablishment().getName_commercial());
            parameters.put("name_owner", inIvcWebService.get().getStablishment().getName_owner());
            parameters.put("name_legal_representative", inIvcWebService.get().getStablishment().getName_legal_representative());
            parameters.put("observation", inIvcWebService.get().getStablishment().getObservation());
            parameters.put("observation_history", inIvcWebService.get().getStablishment().getObservation_history());
            parameters.put("page_web", inIvcWebService.get().getStablishment().getPage_web());
            parameters.put("business_name", inIvcWebService.get().getStablishment().getBusiness_name());
            parameters.put("phone", inIvcWebService.get().getStablishment().getPhone());
            parameters.put("type_history", inIvcWebService.get().getStablishment().getType_history());
            parameters.put("type_identification_establishment", inIvcWebService.get().getStablishment().getType_identification_establishment());
            parameters.put("type_identification_owner", inIvcWebService.get().getStablishment().getType_identification_owner());
            parameters.put("type_identification_legal_representative", inIvcWebService.get().getStablishment().getType_identification_legal_representative());
        } else {
            parameters = null;            
            LOGGER.log(Level.INFO, "Stablishment: {0}\n Object: {1}", new Object[]{"NULL", String.valueOf(inIvcWebService)});
        }       
                
        return parameters;

    }

}
