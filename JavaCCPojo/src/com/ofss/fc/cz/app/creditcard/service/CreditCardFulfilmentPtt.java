
package com.ofss.fc.cz.app.creditcard.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import com.ofss.fc.cz.app.creditcard.service.request.AddCreditCardRequest;
import com.ofss.fc.cz.app.creditcard.service.request.CreateCreditCardRequest;
import com.ofss.fc.cz.app.creditcard.service.response.CreditCardResponse;
import com.oracle.ofss.obp.cz.header.ServiceHeader;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CreditCardFulfilment_ptt", targetNamespace = "http://service.creditcard.app.cz.fc.ofss.com")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.ofss.fc.cz.app.creditcard.service.request.ObjectFactory.class,
    com.ofss.fc.cz.app.creditcard.service.response.ObjectFactory.class,
    com.oracle.ofss.obp.cz.header.ObjectFactory.class,
    com.oracle.ofss.obp.cz.status.ObjectFactory.class
})
public interface CreditCardFulfilmentPtt {


    /**
     * 
     * @param serviceHeaderPayload
     * @param requestPayload
     * @return
     *     returns com.ofss.fc.cz.app.creditcard.service.response.CreditCardResponse
     * @throws CreateCreditCardfaultMessage
     */
    @WebMethod(action = "http://service.creditcard.app.cz.fc.ofss.com")
    @WebResult(name = "creditCardResponse", targetNamespace = "http://response.service.creditcard.app.cz.fc.ofss.com", partName = "ResponsePayload")
    public CreditCardResponse createCreditCardAccount(
        @WebParam(name = "createCreditCardRequest", targetNamespace = "http://request.service.creditcard.app.cz.fc.ofss.com", partName = "RequestPayload")
        CreateCreditCardRequest requestPayload,
        @WebParam(name = "serviceHeader", targetNamespace = "http://www.oracle.com/ofss/obp/cz/header/", header = true, mode = WebParam.Mode.INOUT, partName = "serviceHeaderPayload")
        Holder<ServiceHeader> serviceHeaderPayload)
        throws CreateCreditCardfaultMessage
    ;

    /**
     * 
     * @param serviceHeaderPayload
     * @param requestPayload
     * @return
     *     returns com.ofss.fc.cz.app.creditcard.service.response.CreditCardResponse
     * @throws CreateCreditCardfaultMessage
     */
    @WebMethod(action = "http://service.creditcard.app.cz.fc.ofss.com")
    @WebResult(name = "creditCardResponse", targetNamespace = "http://response.service.creditcard.app.cz.fc.ofss.com", partName = "ResponsePayload")
    public CreditCardResponse createAdditionalCards(
        @WebParam(name = "addCreditCardRequest", targetNamespace = "http://request.service.creditcard.app.cz.fc.ofss.com", partName = "RequestPayload")
        AddCreditCardRequest requestPayload,
        @WebParam(name = "serviceHeader", targetNamespace = "http://www.oracle.com/ofss/obp/cz/header/", header = true, mode = WebParam.Mode.INOUT, partName = "serviceHeaderPayload")
        Holder<ServiceHeader> serviceHeaderPayload)
        throws CreateCreditCardfaultMessage
    ;

}
