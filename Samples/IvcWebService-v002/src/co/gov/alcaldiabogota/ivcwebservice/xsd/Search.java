/**
 * Search.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:48:01 BST)
 */
package co.gov.alcaldiabogota.ivcwebservice.xsd;


/**
 *  Search bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class Search implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = Search
       Namespace URI = http://ivcWebService.alcaldiabogota.gov.co/xsd
       Namespace Prefix = ns2
     */

    /**
     * field for Address_standard
     */
    protected java.lang.String localAddress_standard;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAddress_standardTracker = false;

    /**
     * field for Id_entity
     */
    protected java.lang.String localId_entity;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localId_entityTracker = false;

    /**
     * field for Formal
     */
    protected java.lang.String localFormal;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFormalTracker = false;

    /**
     * field for Commercial_registration
     */
    protected java.lang.String localCommercial_registration;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCommercial_registrationTracker = false;

    /**
     * field for Number_identification_establishment
     */
    protected java.lang.String localNumber_identification_establishment;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNumber_identification_establishmentTracker = false;

    /**
     * field for Number_identificacion_legal_representative
     */
    protected java.lang.String localNumber_identificacion_legal_representative;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNumber_identificacion_legal_representativeTracker = false;

    /**
     * field for Name_commercial
     */
    protected java.lang.String localName_commercial;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localName_commercialTracker = false;

    /**
     * field for Type_identification_establishment
     */
    protected java.lang.String localType_identification_establishment;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localType_identification_establishmentTracker = false;

    public boolean isAddress_standardSpecified() {
        return localAddress_standardTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getAddress_standard() {
        return localAddress_standard;
    }

    /**
     * Auto generated setter method
     * @param param Address_standard
     */
    public void setAddress_standard(java.lang.String param) {
        localAddress_standardTracker = true;

        this.localAddress_standard = param;
    }

    public boolean isId_entitySpecified() {
        return localId_entityTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getId_entity() {
        return localId_entity;
    }

    /**
     * Auto generated setter method
     * @param param Id_entity
     */
    public void setId_entity(java.lang.String param) {
        localId_entityTracker = true;

        this.localId_entity = param;
    }

    public boolean isFormalSpecified() {
        return localFormalTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getFormal() {
        return localFormal;
    }

    /**
     * Auto generated setter method
     * @param param Formal
     */
    public void setFormal(java.lang.String param) {
        localFormalTracker = true;

        this.localFormal = param;
    }

    public boolean isCommercial_registrationSpecified() {
        return localCommercial_registrationTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCommercial_registration() {
        return localCommercial_registration;
    }

    /**
     * Auto generated setter method
     * @param param Commercial_registration
     */
    public void setCommercial_registration(java.lang.String param) {
        localCommercial_registrationTracker = true;

        this.localCommercial_registration = param;
    }

    public boolean isNumber_identification_establishmentSpecified() {
        return localNumber_identification_establishmentTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNumber_identification_establishment() {
        return localNumber_identification_establishment;
    }

    /**
     * Auto generated setter method
     * @param param Number_identification_establishment
     */
    public void setNumber_identification_establishment(java.lang.String param) {
        localNumber_identification_establishmentTracker = true;

        this.localNumber_identification_establishment = param;
    }

    public boolean isNumber_identificacion_legal_representativeSpecified() {
        return localNumber_identificacion_legal_representativeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNumber_identificacion_legal_representative() {
        return localNumber_identificacion_legal_representative;
    }

    /**
     * Auto generated setter method
     * @param param Number_identificacion_legal_representative
     */
    public void setNumber_identificacion_legal_representative(
        java.lang.String param) {
        localNumber_identificacion_legal_representativeTracker = true;

        this.localNumber_identificacion_legal_representative = param;
    }

    public boolean isName_commercialSpecified() {
        return localName_commercialTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getName_commercial() {
        return localName_commercial;
    }

    /**
     * Auto generated setter method
     * @param param Name_commercial
     */
    public void setName_commercial(java.lang.String param) {
        localName_commercialTracker = true;

        this.localName_commercial = param;
    }

    public boolean isType_identification_establishmentSpecified() {
        return localType_identification_establishmentTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getType_identification_establishment() {
        return localType_identification_establishment;
    }

    /**
     * Auto generated setter method
     * @param param Type_identification_establishment
     */
    public void setType_identification_establishment(java.lang.String param) {
        localType_identification_establishmentTracker = true;

        this.localType_identification_establishment = param;
    }

    /**
     *
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName,
        final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {
        return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                this, parentQName));
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        java.lang.String prefix = null;
        java.lang.String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(),
            xmlWriter);

        if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "http://ivcWebService.alcaldiabogota.gov.co/xsd");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":Search", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "Search", xmlWriter);
            }
        }

        if (localAddress_standardTracker) {
            namespace = "http://ivcWebService.alcaldiabogota.gov.co/xsd";
            writeStartElement(null, namespace, "address_standard", xmlWriter);

            if (localAddress_standard == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localAddress_standard);
            }

            xmlWriter.writeEndElement();
        }

        if (localId_entityTracker) {
            namespace = "http://ivcWebService.alcaldiabogota.gov.co/xsd";
            writeStartElement(null, namespace, "id_entity", xmlWriter);

            if (localId_entity == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localId_entity);
            }

            xmlWriter.writeEndElement();
        }

        if (localFormalTracker) {
            namespace = "http://ivcWebService.alcaldiabogota.gov.co/xsd";
            writeStartElement(null, namespace, "formal", xmlWriter);

            if (localFormal == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localFormal);
            }

            xmlWriter.writeEndElement();
        }

        if (localCommercial_registrationTracker) {
            namespace = "http://ivcWebService.alcaldiabogota.gov.co/xsd";
            writeStartElement(null, namespace, "commercial_registration",
                xmlWriter);

            if (localCommercial_registration == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localCommercial_registration);
            }

            xmlWriter.writeEndElement();
        }

        if (localNumber_identification_establishmentTracker) {
            namespace = "http://ivcWebService.alcaldiabogota.gov.co/xsd";
            writeStartElement(null, namespace,
                "number_identification_establishment", xmlWriter);

            if (localNumber_identification_establishment == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localNumber_identification_establishment);
            }

            xmlWriter.writeEndElement();
        }

        if (localNumber_identificacion_legal_representativeTracker) {
            namespace = "http://ivcWebService.alcaldiabogota.gov.co/xsd";
            writeStartElement(null, namespace,
                "number_identificacion_legal_representative", xmlWriter);

            if (localNumber_identificacion_legal_representative == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localNumber_identificacion_legal_representative);
            }

            xmlWriter.writeEndElement();
        }

        if (localName_commercialTracker) {
            namespace = "http://ivcWebService.alcaldiabogota.gov.co/xsd";
            writeStartElement(null, namespace, "name_commercial", xmlWriter);

            if (localName_commercial == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localName_commercial);
            }

            xmlWriter.writeEndElement();
        }

        if (localType_identification_establishmentTracker) {
            namespace = "http://ivcWebService.alcaldiabogota.gov.co/xsd";
            writeStartElement(null, namespace,
                "type_identification_establishment", xmlWriter);

            if (localType_identification_establishment == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localType_identification_establishment);
            }

            xmlWriter.writeEndElement();
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://ivcWebService.alcaldiabogota.gov.co/xsd")) {
            return "ns2";
        }

        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix,
        java.lang.String namespace, java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix,
        java.lang.String namespace, java.lang.String attName,
        java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
        } else {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
            xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace,
        java.lang.String attName, java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace,
        java.lang.String attName, javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }

        java.lang.String attributeValue;

        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                attributeValue);
        }
    }

    /**
     *  method to handle Qnames
     */
    private void writeQName(javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();

        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix + ":" +
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }

                namespaceURI = qnames[i].getNamespaceURI();

                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);

                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":")
                                     .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qnames[i]));
                }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
        }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);

        if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);

                if ((uri == null) || (uri.length() == 0)) {
                    break;
                }

                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }

        return prefix;
    }

    /**
     *  Factory class that keeps the parse method
     */
    public static class Factory {
        private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         *                If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static Search parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            Search object = new Search();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();

                if (reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "type");

                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;

                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0,
                                    fullTypeName.indexOf(":"));
                        }

                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                    ":") + 1);

                        if (!"Search".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (Search) co.gov.alcaldiabogota.ivcwebservice.xsd.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ivcWebService.alcaldiabogota.gov.co/xsd",
                            "address_standard").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "address_standard").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setAddress_standard(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));
                    } else {
                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ivcWebService.alcaldiabogota.gov.co/xsd",
                            "id_entity").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "id_entity").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setId_entity(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));
                    } else {
                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ivcWebService.alcaldiabogota.gov.co/xsd",
                            "formal").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "formal").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setFormal(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));
                    } else {
                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ivcWebService.alcaldiabogota.gov.co/xsd",
                            "commercial_registration").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                            "commercial_registration").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setCommercial_registration(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));
                    } else {
                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ivcWebService.alcaldiabogota.gov.co/xsd",
                            "number_identification_establishment").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("",
                            "number_identification_establishment").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setNumber_identification_establishment(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));
                    } else {
                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ivcWebService.alcaldiabogota.gov.co/xsd",
                            "number_identificacion_legal_representative").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("",
                            "number_identificacion_legal_representative").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setNumber_identificacion_legal_representative(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));
                    } else {
                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ivcWebService.alcaldiabogota.gov.co/xsd",
                            "name_commercial").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "name_commercial").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setName_commercial(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));
                    } else {
                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ivcWebService.alcaldiabogota.gov.co/xsd",
                            "type_identification_establishment").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("",
                            "type_identification_establishment").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setType_identification_establishment(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));
                    } else {
                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()) {
                    // 2 - A start element we are not expecting indicates a trailing invalid property
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }
    } //end of factory class
}
