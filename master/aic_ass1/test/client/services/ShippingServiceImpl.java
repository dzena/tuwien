
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package client.services;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.3
 * Thu Nov 11 17:09:49 CET 2010
 * Generated source version: 2.2.3
 * 
 */

@javax.jws.WebService(
                      serviceName = "ShippingService",
                      portName = "ShippingPT",
                      targetNamespace = "http://infosys.tuwien.ac.at/aic10/ass1/dto/shipping",
                      wsdlLocation = "http://localhost:9000/shippingservice?wsdl",
                      endpointInterface = "client.services.ShippingService")
                      
public class ShippingServiceImpl implements ShippingService {

    private static final Logger LOG = Logger.getLogger(ShippingServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see client.services.ShippingService#shipItems(java.util.List<client.services.Item>  items ,)client.services.Addresses  address )*
     */
    public java.lang.String shipItems(java.util.List<client.services.Item> items,client.services.Addresses address) throws UnknownAddressFault_Exception , UnknownProductFault_Exception    { 
        LOG.info("Executing operation shipItems");
        System.out.println(items);
        System.out.println(address);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new UnknownAddressFault_Exception("UnknownAddressFault...");
        //throw new UnknownProductFault_Exception("UnknownProductFault...");
    }

}
