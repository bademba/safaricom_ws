
package safaricomws.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TestWS", targetNamespace = "http://ws.psd.safaricom.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TestWS {


    /**
     * 
     * @param nationalId
     * @param yourName
     * @param mobileNo
     * @param hiddenKey
     * @return
     *     returns safaricomws.client.TransactionResult
     */
    @WebMethod
    @WebResult(name = "registration", targetNamespace = "")
    @RequestWrapper(localName = "register", targetNamespace = "http://ws.psd.safaricom.com/", className = "safaricomws.client.Register")
    @ResponseWrapper(localName = "registerResponse", targetNamespace = "http://ws.psd.safaricom.com/", className = "safaricomws.client.RegisterResponse")
    @Action(input = "http://ws.psd.safaricom.com/TestWS/registerRequest", output = "http://ws.psd.safaricom.com/TestWS/registerResponse")
    public TransactionResult register(
        @WebParam(name = "your_name", targetNamespace = "")
        String yourName,
        @WebParam(name = "national_id", targetNamespace = "")
        String nationalId,
        @WebParam(name = "mobile_no", targetNamespace = "")
        String mobileNo,
        @WebParam(name = "hiddenKey", targetNamespace = "")
        String hiddenKey);

    /**
     * 
     * @param name
     * @return
     *     returns safaricomws.client.TransactionResult
     */
    @WebMethod
    @WebResult(name = "getKey", targetNamespace = "")
    @RequestWrapper(localName = "getKey", targetNamespace = "http://ws.psd.safaricom.com/", className = "safaricomws.client.GetKey")
    @ResponseWrapper(localName = "getKeyResponse", targetNamespace = "http://ws.psd.safaricom.com/", className = "safaricomws.client.GetKeyResponse")
    @Action(input = "http://ws.psd.safaricom.com/TestWS/getKeyRequest", output = "http://ws.psd.safaricom.com/TestWS/getKeyResponse")
    public TransactionResult getKey(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param name
     * @return
     *     returns safaricomws.client.TransactionResult
     */
    @WebMethod
    @WebResult(name = "G2Result", targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://ws.psd.safaricom.com/", className = "safaricomws.client.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://ws.psd.safaricom.com/", className = "safaricomws.client.HelloResponse")
    @Action(input = "http://ws.psd.safaricom.com/TestWS/helloRequest", output = "http://ws.psd.safaricom.com/TestWS/helloResponse")
    public TransactionResult hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
