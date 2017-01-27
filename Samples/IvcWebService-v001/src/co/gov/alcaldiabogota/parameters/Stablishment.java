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

        if (inIvcWebService.isPresent()) {
            
            LOGGER.log(Level.INFO, "Stablishment: {0}\n Object: {1}", new Object[]{inIvcWebService.get().getEstablecimiento().getRazonSocial(), String.valueOf(inIvcWebService)});

            // List of parameters to object Stablishment        
            parameters.put("upz", inIvcWebService.get().getEstablecimiento().getUPZ());
            parameters.put("lastname_owner", inIvcWebService.get().getEstablecimiento().getApellidosProp());
            parameters.put("lastname_legal_representative", inIvcWebService.get().getEstablecimiento().getApellidosRepL());
            parameters.put("ciiu1", inIvcWebService.get().getEstablecimiento().getCiiu1());
            parameters.put("ciiu2", inIvcWebService.get().getEstablecimiento().getCiiu2());
            parameters.put("ciiu3", inIvcWebService.get().getEstablecimiento().getCiiu3());
            parameters.put("address_commercial", inIvcWebService.get().getEstablecimiento().getDirComerc());
            parameters.put("address_standard", inIvcWebService.get().getEstablecimiento().getDirEstandar());
            parameters.put("address_notification", inIvcWebService.get().getEstablecimiento().getDirNotif());
            parameters.put("date_end_commercial_registration", inIvcWebService.get().getEstablecimiento().getFechaFinMatric());
            parameters.put("date_commercial_registration", inIvcWebService.get().getEstablecimiento().getFechaMatric());
            parameters.put("formal", inIvcWebService.get().getEstablecimiento().getFormal());
            parameters.put("digit_verification_establishment", inIvcWebService.get().getEstablecimiento().getIdentDV());
            parameters.put("digit_verification_owner", inIvcWebService.get().getEstablecimiento().getIdentDVProp());
            parameters.put("digit_verification_legal_representative", inIvcWebService.get().getEstablecimiento().getIdentDVRepL());
            parameters.put("locality", inIvcWebService.get().getEstablecimiento().getLocalidad());
            parameters.put("email", inIvcWebService.get().getEstablecimiento().getMail());
            parameters.put("commercial_registration", inIvcWebService.get().getEstablecimiento().getMatricula());
            parameters.put("commercial_registration_owner", inIvcWebService.get().getEstablecimiento().getMatriculaProp());
            parameters.put("number_identification_establishment", inIvcWebService.get().getEstablecimiento().getNoIdent());
            parameters.put("number_identification_owner", inIvcWebService.get().getEstablecimiento().getNoIdentProp());
            parameters.put("number_identificacion_legal_representative", inIvcWebService.get().getEstablecimiento().getNoIdentRepL());
            parameters.put("name_commercial", inIvcWebService.get().getEstablecimiento().getNomComerc());
            parameters.put("name_owner", inIvcWebService.get().getEstablecimiento().getNombresProp());
            parameters.put("name_legal_representative", inIvcWebService.get().getEstablecimiento().getNombresRepL());
            parameters.put("observation", inIvcWebService.get().getEstablecimiento().getObservac());
            parameters.put("observation_history", inIvcWebService.get().getEstablecimiento().getObservacHist());
            parameters.put("page_web", inIvcWebService.get().getEstablecimiento().getPagweb());
            parameters.put("business_name", inIvcWebService.get().getEstablecimiento().getRazonSocial());
            parameters.put("phone", inIvcWebService.get().getEstablecimiento().getTels());
            parameters.put("type_history", inIvcWebService.get().getEstablecimiento().getTipoHistorico());
            parameters.put("type_identification_establishment", inIvcWebService.get().getEstablecimiento().getTipoIdent());
            parameters.put("type_identification_owner", inIvcWebService.get().getEstablecimiento().getTipoIdentProp());
            parameters.put("type_identification_legal_representative", inIvcWebService.get().getEstablecimiento().getTipoIdentRepL());

        } else {
            parameters = null;
            LOGGER.log(Level.INFO, "Stablishment: {0}\n Object: {1}", new Object[]{"NULL", String.valueOf(inIvcWebService)});
        }

        return parameters;

    }

}
