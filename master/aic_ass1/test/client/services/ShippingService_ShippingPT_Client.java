
package client.services;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
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

public final class ShippingService_ShippingPT_Client {

    private static final QName SERVICE_NAME = new QName("http://infosys.tuwien.ac.at/aic10/ass1/dto/shipping", "ShippingService");

    private ShippingService_ShippingPT_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = ShippingService_Service.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        ShippingService_Service ss = new ShippingService_Service(wsdlURL, SERVICE_NAME);
        ShippingService port = ss.getShippingPT();  
        
        {
        System.out.println("Invoking shipItems...");
        java.util.List<client.services.Item> _shipItems_items = null;
        client.services.Addresses _shipItems_address = null;
        try {
            java.lang.String _shipItems__return = port.shipItems(_shipItems_items, _shipItems_address);
            System.out.println("shipItems.result=" + _shipItems__return);

        } catch (UnknownAddressFault_Exception e) { 
            System.out.println("Expected exception: UnknownAddressFault has occurred.");
            System.out.println(e.toString());
        } catch (UnknownProductFault_Exception e) { 
            System.out.println("Expected exception: UnknownProductFault has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
