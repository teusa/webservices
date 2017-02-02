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
    Map<String, String> parameters = new HashMap<>();

    public Stablishment() {
    }
    
    public Map Stablishment(Optional<InIvcWebService> inIvcWebService) {
        return this.setStablishmentParameters(inIvcWebService);               
    }

    public Map setStablishmentParameters(Optional<InIvcWebService> inIvcWebService) {        
             
        //LOGGER.log(Level.INFO, "CURRENT Object: {0}", new Object[]{inIvcWebService.get().isStablishmentSpecified()});
        
        if ( inIvcWebService.isPresent() && inIvcWebService.get().isStablishmentSpecified() ) {
            
            LOGGER.log(Level.INFO, "Stablishment business name: {0}\n Stablishment commercial registration: {1}\n Stablishment upz: {2}\n Object: {2}", 
                    new Object[]{
                        inIvcWebService.get().getStablishment().getBusiness_name(), 
                        inIvcWebService.get().getStablishment().getCommercial_registration(),
                        inIvcWebService.get().getStablishment().getUpz(),
                        String.valueOf(inIvcWebService)
                    });
            
            // List of parameters to object Stablishment            
            setParameter("upz", inIvcWebService.get().getStablishment().getUpz());     
            setParameter("lastname_owner", inIvcWebService.get().getStablishment().getLastname_owner());
            setParameter("lastname_legal_representative", inIvcWebService.get().getStablishment().getLastname_legal_representative());
            setParameter("ciiu1", inIvcWebService.get().getStablishment().getCiiu1());
            setParameter("ciiu2", inIvcWebService.get().getStablishment().getCiiu2());
            setParameter("ciiu3", inIvcWebService.get().getStablishment().getCiiu3());
            setParameter("address_commercial", inIvcWebService.get().getStablishment().getAddress_commercial());
            setParameter("address_standard", inIvcWebService.get().getStablishment().getAddress_standard());
            setParameter("address_notification", inIvcWebService.get().getStablishment().getAddress_notification());
            setParameter("date_end_commercial_registration", inIvcWebService.get().getStablishment().getDate_end_commercial_registration());
            setParameter("date_commercial_registration", inIvcWebService.get().getStablishment().getDate_commercial_registration());
            setParameter("formal", inIvcWebService.get().getStablishment().getFormal());
            setParameter("digit_verification_establishment", inIvcWebService.get().getStablishment().getDigit_verification_establishment());
            setParameter("digit_verification_owner", inIvcWebService.get().getStablishment().getDigit_verification_owner());
            setParameter("digit_verification_legal_representative", inIvcWebService.get().getStablishment().getDigit_verification_legal_representative());
            setParameter("locality", inIvcWebService.get().getStablishment().getLocality());
            setParameter("email", inIvcWebService.get().getStablishment().getEmail());
            setParameter("commercial_registration", inIvcWebService.get().getStablishment().getCommercial_registration());
            setParameter("commercial_registration_owner", inIvcWebService.get().getStablishment().getCommercial_registration_owner());
            setParameter("number_identification_establishment", inIvcWebService.get().getStablishment().getNumber_identification_establishment());
            setParameter("number_identification_owner", inIvcWebService.get().getStablishment().getNumber_identification_owner());
            setParameter("number_identificacion_legal_representative", inIvcWebService.get().getStablishment().getNumber_identificacion_legal_representative());
            setParameter("name_commercial", inIvcWebService.get().getStablishment().getName_commercial());
            setParameter("name_owner", inIvcWebService.get().getStablishment().getName_owner());
            setParameter("name_legal_representative", inIvcWebService.get().getStablishment().getName_legal_representative());
            setParameter("observation", inIvcWebService.get().getStablishment().getObservation());
            setParameter("observation_history", inIvcWebService.get().getStablishment().getObservation_history());
            setParameter("page_web", inIvcWebService.get().getStablishment().getPage_web());
            setParameter("business_name", inIvcWebService.get().getStablishment().getBusiness_name());
            setParameter("phone", inIvcWebService.get().getStablishment().getPhone());
            setParameter("type_history", inIvcWebService.get().getStablishment().getType_history());
            setParameter("type_identification_establishment", inIvcWebService.get().getStablishment().getType_identification_establishment());
            setParameter("type_identification_owner", inIvcWebService.get().getStablishment().getType_identification_owner());
            setParameter("type_identification_legal_representative", inIvcWebService.get().getStablishment().getType_identification_legal_representative());
        } else {
            parameters = null;        
            LOGGER.log(Level.INFO, "Stablishment: {0}\n Object NAME: {1}", new Object[]{"NULL", inIvcWebService.getClass().getName()});
        }       
                
        return parameters;
    }
    
    public void setParameter(String key, String value) {          
        if (!value.isEmpty()) {
            parameters.put(key, value);
            //LOGGER.log(Level.INFO, "Parameter Key: {0}\n Parameter Value: {1}", new Object[]{key, value});
        }
    }

}
