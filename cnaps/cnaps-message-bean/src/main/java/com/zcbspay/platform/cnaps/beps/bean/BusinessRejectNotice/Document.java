//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.21 at 04:56:21 PM CST 
//


package com.zcbspay.platform.cnaps.beps.bean.BusinessRejectNotice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BizRjctNtce" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.388.001.01}BizRjctNtceV01"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "Document", propOrder = {
//    "bizRjctNtce"
//})
@XmlRootElement(name = "Document") 
public class Document {

    @XmlElement(name = "BizRjctNtce", required = true)
    protected BizRjctNtceV01 bizRjctNtce;

    /**
     * Gets the value of the bizRjctNtce property.
     * 
     * @return
     *     possible object is
     *     {@link BizRjctNtceV01 }
     *     
     */
    public BizRjctNtceV01 getBizRjctNtce() {
        return bizRjctNtce;
    }

    /**
     * Sets the value of the bizRjctNtce property.
     * 
     * @param value
     *     allowed object is
     *     {@link BizRjctNtceV01 }
     *     
     */
    public void setBizRjctNtce(BizRjctNtceV01 value) {
        this.bizRjctNtce = value;
    }

}
