
package com.empresa.proyecto.ws1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.empresa.proyecto.ws1 package. 
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

    private final static QName _NuevoPaisResponse_QNAME = new QName("http://ws.proyecto.empresa.com/", "nuevoPaisResponse");
    private final static QName _Hello_QNAME = new QName("http://ws.proyecto.empresa.com/", "hello");
    private final static QName _ListarPaises_QNAME = new QName("http://ws.proyecto.empresa.com/", "listarPaises");
    private final static QName _HelloResponse_QNAME = new QName("http://ws.proyecto.empresa.com/", "helloResponse");
    private final static QName _NuevoPais_QNAME = new QName("http://ws.proyecto.empresa.com/", "nuevoPais");
    private final static QName _ListarPaisesResponse_QNAME = new QName("http://ws.proyecto.empresa.com/", "listarPaisesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.empresa.proyecto.ws1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarPaisesResponse }
     * 
     */
    public ListarPaisesResponse createListarPaisesResponse() {
        return new ListarPaisesResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link NuevoPais }
     * 
     */
    public NuevoPais createNuevoPais() {
        return new NuevoPais();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link ListarPaises }
     * 
     */
    public ListarPaises createListarPaises() {
        return new ListarPaises();
    }

    /**
     * Create an instance of {@link NuevoPaisResponse }
     * 
     */
    public NuevoPaisResponse createNuevoPaisResponse() {
        return new NuevoPaisResponse();
    }

    /**
     * Create an instance of {@link PaisBean }
     * 
     */
    public PaisBean createPaisBean() {
        return new PaisBean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NuevoPaisResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.proyecto.empresa.com/", name = "nuevoPaisResponse")
    public JAXBElement<NuevoPaisResponse> createNuevoPaisResponse(NuevoPaisResponse value) {
        return new JAXBElement<NuevoPaisResponse>(_NuevoPaisResponse_QNAME, NuevoPaisResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPaises }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.proyecto.empresa.com/", name = "listarPaises")
    public JAXBElement<ListarPaises> createListarPaises(ListarPaises value) {
        return new JAXBElement<ListarPaises>(_ListarPaises_QNAME, ListarPaises.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link NuevoPais }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.proyecto.empresa.com/", name = "nuevoPais")
    public JAXBElement<NuevoPais> createNuevoPais(NuevoPais value) {
        return new JAXBElement<NuevoPais>(_NuevoPais_QNAME, NuevoPais.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPaisesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.proyecto.empresa.com/", name = "listarPaisesResponse")
    public JAXBElement<ListarPaisesResponse> createListarPaisesResponse(ListarPaisesResponse value) {
        return new JAXBElement<ListarPaisesResponse>(_ListarPaisesResponse_QNAME, ListarPaisesResponse.class, null, value);
    }

}
