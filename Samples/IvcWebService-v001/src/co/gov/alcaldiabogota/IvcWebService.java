package co.gov.alcaldiabogota;

import co.gov.alcaldiabogota.connection.RestClient;
import co.gov.alcaldiabogota.ivcwebservice.InIvcWebService;
import co.gov.alcaldiabogota.ivcwebservice.InIvcWebServiceResponse;
import co.gov.alcaldiabogota.ivcwebservice.IvcWebServiceExceptionException;
import co.gov.alcaldiabogota.ivcwebservice.IvcWebServiceSkeletonInterface;
import co.gov.alcaldiabogota.ivcwebservice.xsd.OutIvcWebService;
import co.gov.alcaldiabogota.parameters.Stablishment;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesusrodriguezmiranda
 */
public class IvcWebService implements IvcWebServiceSkeletonInterface {

    //private static final String SERVER_REST = "http://192.168.88.244/apirest_ivc/backend/web/api/establishment";
    private static final String SERVER_REST = "http://54.149.120.9/apirest_ivc/backend/web/api/establishment";
    private final static Logger LOGGER = Logger.getLogger(IvcWebService.class.getName());
    
    @Override
    public InIvcWebServiceResponse inIvcWebService(InIvcWebService inIvcWebService0) throws IvcWebServiceExceptionException {
        try {
            
            /*
            Removing null checks with Optional to Java 8
            */
            Optional<InIvcWebService> inIvcWebService = Optional.ofNullable(inIvcWebService0);
                        
            OutIvcWebService outIvcWebService = new OutIvcWebService();            
            
            InIvcWebServiceResponse inIvcWebServiceResponse = new InIvcWebServiceResponse();           
            
            Stablishment parametersStablishment = new Stablishment();            
            RestClient request = new RestClient();            
            String responseRequest = request.requestRestServer(SERVER_REST, parametersStablishment.setStablishmentParameters(inIvcWebService));
            
            LOGGER.log(Level.INFO, "Version: {0}\n REST: {1}\n Response: {2}", new Object[]{"v001-Valores de los parametros en Español", SERVER_REST, responseRequest});
            
            outIvcWebService.setMensaje("Result: " + responseRequest);            
            inIvcWebServiceResponse.set_return(outIvcWebService);
            
            if ( inIvcWebService.isPresent() ) {            
                return inIvcWebServiceResponse;            
            } else {
                return null;
            }
            
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
