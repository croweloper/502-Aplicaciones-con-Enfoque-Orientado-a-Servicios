
package com.empresa.proyecto.ws1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paisBean complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paisBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPais" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paisBean", propOrder = {
    "idPais",
    "nombPais"
})
public class PaisBean {

    protected int idPais;
    protected String nombPais;

    /**
     * Obtiene el valor de la propiedad idPais.
     * 
     */
    public int getIdPais() {
        return idPais;
    }

    /**
     * Define el valor de la propiedad idPais.
     * 
     */
    public void setIdPais(int value) {
        this.idPais = value;
    }

    /**
     * Obtiene el valor de la propiedad nombPais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombPais() {
        return nombPais;
    }

    /**
     * Define el valor de la propiedad nombPais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombPais(String value) {
        this.nombPais = value;
    }

}
