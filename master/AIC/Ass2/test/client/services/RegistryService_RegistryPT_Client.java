
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
 * Thu Nov 11 17:09:59 CET 2010
 * Generated source version: 2.2.3
 * 
 */

public final class RegistryService_RegistryPT_Client {

    private static final QName SERVICE_NAME = new QName("http://infosys.tuwien.ac.at/aic10/ass1/dto/registry", "RegistryService");

    private RegistryService_RegistryPT_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = RegistryService_Service.WSDL_LOCATION;
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
      
        RegistryService_Service ss = new RegistryService_Service(wsdlURL, SERVICE_NAME);
        RegistryService port = ss.getRegistryPT();  
        
        {
        System.out.println("Invoking getProductSupplier...");
        java.lang.String _getProductSupplier_product = "";
        try {
            client.services.EndpointReferenceType _getProductSupplier__return = port.getProductSupplier(_getProductSupplier_product);
            System.out.println("getProductSupplier.result=" + _getProductSupplier__return);

        } catch (UnknownProductFault_Exception e) { 
            System.out.println("Expected exception: UnknownProductFault has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
