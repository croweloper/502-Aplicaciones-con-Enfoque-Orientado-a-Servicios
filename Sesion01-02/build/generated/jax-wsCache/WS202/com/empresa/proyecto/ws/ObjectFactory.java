
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

    private final static QName _ListarProductos_QNAME = new QName("http://ws.proyecto.empresa.com/", "listarProductos");
    private final static QName _NuevoProducto_QNAME = new QName("http://ws.proyecto.empresa.com/", "nuevoProducto");
    private final static QName _NuevoProductoResponse_QNAME = new QName("http://ws.proyecto.empresa.com/", "nuevoProductoResponse");
    private final static QName _ListarProductosResponse_QNAME = new QName("http://ws.proyecto.empresa.com/", "listarProductosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.empresa.proyecto.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NuevoProductoResponse }
     * 
     */
    public NuevoProductoResponse createNuevoProductoResponse() {
        return new NuevoProductoResponse();
    }

    /**
     * Create an instance of {@link ListarProductosResponse }
     * 
     */
    public ListarProductosResponse createListarProductosResponse() {
        return new ListarProductosResponse();
    }

    /**
     * Create an instance of {@link NuevoProducto }
     * 
     */
    public NuevoProducto createNuevoProducto() {
        return new NuevoProducto();
    }

    /**
     * Create an instance of {@link ListarProductos }
     * 
     */
    public ListarProductos createListarProductos() {
        return new ListarProductos();
    }

    /**
     * Create an instance of {@link ProductoBean }
     * 
     */
    public ProductoBean createProductoBean() {
        return new ProductoBean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarProductos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.proyecto.empresa.com/", name = "listarProductos")
    public JAXBElement<ListarProductos> createListarProductos(ListarProductos value) {
        return new JAXBElement<ListarProductos>(_ListarProductos_QNAME, ListarProductos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NuevoProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.proyecto.empresa.com/", name = "nuevoProducto")
    public JAXBElement<NuevoProducto> createNuevoProducto(NuevoProducto value) {
        return new JAXBElement<NuevoProducto>(_NuevoProducto_QNAME, NuevoProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NuevoProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.proyecto.empresa.com/", name = "nuevoProductoResponse")
    public JAXBElement<NuevoProductoResponse> createNuevoProductoResponse(NuevoProductoResponse value) {
        return new JAXBElement<NuevoProductoResponse>(_NuevoProductoResponse_QNAME, NuevoProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarProductosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.proyecto.empresa.com/", name = "listarProductosResponse")
    public JAXBElement<ListarProductosResponse> createListarProductosResponse(ListarProductosResponse value) {
        return new JAXBElement<ListarProductosResponse>(_ListarProductosResponse_QNAME, ListarProductosResponse.class, null, value);
    }

}
