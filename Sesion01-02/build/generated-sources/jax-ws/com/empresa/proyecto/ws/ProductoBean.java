
package com.empresa.proyecto.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para productoBean complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="productoBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idproducto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productoBean", propOrder = {
    "idproducto",
    "nombProducto",
    "precio"
})
public class ProductoBean {

    protected int idproducto;
    protected String nombProducto;
    protected double precio;

    /**
     * Obtiene el valor de la propiedad idproducto.
     * 
     */
    public int getIdproducto() {
        return idproducto;
    }

    /**
     * Define el valor de la propiedad idproducto.
     * 
     */
    public void setIdproducto(int value) {
        this.idproducto = value;
    }

    /**
     * Obtiene el valor de la propiedad nombProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombProducto() {
        return nombProducto;
    }

    /**
     * Define el valor de la propiedad nombProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombProducto(String value) {
        this.nombProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     */
    public void setPrecio(double value) {
        this.precio = value;
    }

}
