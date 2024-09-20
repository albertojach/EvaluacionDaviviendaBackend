
package com.example.consumingwebservice.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetByNameResult" type="{http://tempuri.org}DataSet"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getByNameResult"
})
@XmlRootElement(name = "GetByNameResponse", namespace = "http://tempuri.org")
public class GetByNameResponse {

    @XmlElement(name = "GetByNameResult", namespace = "http://tempuri.org", required = true)
    protected DataSet getByNameResult;

    /**
     * Obtiene el valor de la propiedad getByNameResult.
     * 
     * @return
     *     possible object is
     *     {@link DataSet }
     *     
     */
    public DataSet getGetByNameResult() {
        return getByNameResult;
    }

    /**
     * Define el valor de la propiedad getByNameResult.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSet }
     *     
     */
    public void setGetByNameResult(DataSet value) {
        this.getByNameResult = value;
    }

}
