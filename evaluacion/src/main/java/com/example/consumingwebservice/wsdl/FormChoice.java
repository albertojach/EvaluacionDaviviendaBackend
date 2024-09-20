
package com.example.consumingwebservice.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para formChoice.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="formChoice"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="qualified"/&gt;
 *     &lt;enumeration value="unqualified"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "formChoice")
@XmlEnum
public enum FormChoice {

    @XmlEnumValue("qualified")
    QUALIFIED("qualified"),
    @XmlEnumValue("unqualified")
    UNQUALIFIED("unqualified");
    private final String value;

    FormChoice(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FormChoice fromValue(String v) {
        for (FormChoice c: FormChoice.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
