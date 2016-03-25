package test;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2016-03-06T17:19:43.004+05:30
 * Generated source version: 2.5.1
 * 
 */
@WebService(targetNamespace = "http://ws.cdyne.com/", name = "IP2GeoSoap")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface IP2GeoSoap {

    /**
     * Use a License Key of 0 for Testing
     */
    @WebResult(name = "ResolveIPResponse", targetNamespace = "http://ws.cdyne.com/", partName = "parameters")
    @WebMethod(operationName = "ResolveIP", action = "http://ws.cdyne.com/ResolveIP")
    public ResolveIPResponse resolveIP(
        @WebParam(partName = "parameters", name = "ResolveIP", targetNamespace = "http://ws.cdyne.com/")
        ResolveIP parameters
    );
}
