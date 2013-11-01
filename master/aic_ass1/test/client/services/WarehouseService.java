package client.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.3
 * Thu Nov 11 17:10:06 CET 2010
 * Generated source version: 2.2.3
 * 
 */
 
@WebService(targetNamespace = "http://infosys.tuwien.ac.at/aic10/ass1/dto/shipping", name = "WarehouseService")
@XmlSeeAlso({ObjectFactory.class})
public interface WarehouseService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "check_availability", targetNamespace = "http://infosys.tuwien.ac.at/aic10/ass1/dto/shipping", className = "client.services.CheckAvailability")
    @ResponseWrapper(localName = "check_availabilityResponse", targetNamespace = "http://infosys.tuwien.ac.at/aic10/ass1/dto/shipping", className = "client.services.CheckAvailabilityResponse")
    @WebMethod(operationName = "check_availability")
    public client.services.DeliveryStatus checkAvailability(
        @WebParam(name = "product", targetNamespace = "")
        client.services.Product product,
        @WebParam(name = "amount", targetNamespace = "")
        int amount
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "order", targetNamespace = "http://infosys.tuwien.ac.at/aic10/ass1/dto/shipping", className = "client.services.Order")
    @ResponseWrapper(localName = "orderResponse", targetNamespace = "http://infosys.tuwien.ac.at/aic10/ass1/dto/shipping", className = "client.services.OrderResponse")
    @WebMethod
    public java.math.BigDecimal order(
        @WebParam(name = "p", targetNamespace = "")
        client.services.Product p,
        @WebParam(name = "amount", targetNamespace = "")
        int amount
    ) throws UnknownProductFault_Exception;
}
