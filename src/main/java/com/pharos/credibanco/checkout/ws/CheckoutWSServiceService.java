
package com.pharos.credibanco.checkout.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

import com.credibanco.daniel.constantes.Constantes;



/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CheckoutWSServiceService", targetNamespace = "http://ws.checkout.credibanco.pharos.com/", wsdlLocation = Constantes.CREDIBANCO_URL_WSDL)
public class CheckoutWSServiceService
    extends Service
{

    private final static URL CHECKOUTWSSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException CHECKOUTWSSERVICESERVICE_EXCEPTION;
    private final static QName CHECKOUTWSSERVICESERVICE_QNAME = new QName("http://ws.checkout.credibanco.pharos.com/", "CheckoutWSServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL(Constantes.CREDIBANCO_URL_WSDL);
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CHECKOUTWSSERVICESERVICE_WSDL_LOCATION = url;
        CHECKOUTWSSERVICESERVICE_EXCEPTION = e;
    }

    public CheckoutWSServiceService() {
        super(__getWsdlLocation(), CHECKOUTWSSERVICESERVICE_QNAME);
    }

    public CheckoutWSServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CHECKOUTWSSERVICESERVICE_QNAME, features);
    }

    public CheckoutWSServiceService(URL wsdlLocation) {
        super(wsdlLocation, CHECKOUTWSSERVICESERVICE_QNAME);
    }

    public CheckoutWSServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CHECKOUTWSSERVICESERVICE_QNAME, features);
    }

    public CheckoutWSServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CheckoutWSServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CheckoutWSService
     */
    @WebEndpoint(name = "CheckoutWSServicePort")
    public CheckoutWSService getCheckoutWSServicePort() {
        return super.getPort(new QName("http://ws.checkout.credibanco.pharos.com/", "CheckoutWSServicePort"), CheckoutWSService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CheckoutWSService
     */
    @WebEndpoint(name = "CheckoutWSServicePort")
    public CheckoutWSService getCheckoutWSServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.checkout.credibanco.pharos.com/", "CheckoutWSServicePort"), CheckoutWSService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CHECKOUTWSSERVICESERVICE_EXCEPTION!= null) {
            throw CHECKOUTWSSERVICESERVICE_EXCEPTION;
        }
        return CHECKOUTWSSERVICESERVICE_WSDL_LOCATION;
    }

}
