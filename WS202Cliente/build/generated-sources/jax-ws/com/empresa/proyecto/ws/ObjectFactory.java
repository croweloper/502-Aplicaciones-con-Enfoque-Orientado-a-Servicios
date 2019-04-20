
package com.empresa.proyecto.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.empresa.proyecto.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ObtenerCodigoResponse_QNAME = new QName("http://ws.proyecto.empresa.com/", "obtenerCodigoResponse");
    private final static QName _Hello_QNAME = new QName("http://ws.proyecto.empresa.com/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://ws.proyecto.empresa.com/", "helloResponse");
    private final static QName _ObtenerCodigo_QNAME = new QName("http://ws.proyecto.empresa.com/", "obtenerCodigo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.empresa.proyecto.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerCodigo }
     * 
     */
    public ObtenerCodigo createObtenerCodigo() {
        return new ObtenerCodigo();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link ObtenerCodigoResponse }
     * 
     */
    public ObtenerCodigoResponse createObtenerCodigoResponse() {
        return new ObtenerCodigoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerCodigoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.proyecto.empresa.com/", name = "obtenerCodigoResponse")
    public JAXBElement<ObtenerCodigoResponse> createObtenerCodigoResponse(ObtenerCodigoResponse value) {
        return new JAXBElement<ObtenerCodigoResponse>(_ObtenerCodigoResponse_QNAME, ObtenerCodigoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.proyecto.empresa.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.proyecto.empresa.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerCodigo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.proyecto.empresa.com/", name = "obtenerCodigo")
    public JAXBElement<ObtenerCodigo> createObtenerCodigo(ObtenerCodigo value) {
        return new JAXBElement<ObtenerCodigo>(_ObtenerCodigo_QNAME, ObtenerCodigo.class, null, value);
    }

}
