/**
 * Busqueda.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:48:01 BST)
 */
package co.gov.alcaldiabogota.ivcwebservice.xsd;


/**
 *  Busqueda bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class Busqueda implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = Busqueda
       Namespace URI = http://ivcWebService.alcaldiabogota.gov.co/xsd
       Namespace Prefix = ns2
     */

    /**
     * field for DirEstandar
     */
    protected java.lang.String localDirEstandar;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDirEstandarTracker = false;

    /**
     * field for EntidadIVC
     */
    protected java.lang.String localEntidadIVC;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEntidadIVCTracker = false;

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
     * field for Matricula
     */
    protected java.lang.String localMatricula;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMatriculaTracker = false;

    /**
     * field for NoIdent
     */
    protected java.lang.String localNoIdent;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNoIdentTracker = false;

    /**
     * field for NoIdentRepL
     */
    protected java.lang.String localNoIdentRepL;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNoIdentRepLTracker = false;

    /**
     * field for NomComerc
     */
    protected java.lang.String localNomComerc;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNomComercTracker = false;

    /**
     * field for TipoIdent
     */
    protected java.lang.String localTipoIdent;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTipoIdentTracker = false;

    public boolean isDirEstandarSpecified() {
        return localDirEstandarTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDirEstandar() {
        return localDirEstandar;
    }

    /**
     * Auto generated setter method
     * @param param DirEstandar
     */
    public void setDirEstandar(java.lang.String param) {
        localDirEstandarTracker = true;

        this.localDirEstandar = param;
    }

    public boolean isEntidadIVCSpecified() {
        return localEntidadIVCTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEntidadIVC() {
        return localEntidadIVC;
    }

    /**
     * Auto generated setter method
     * @param param EntidadIVC
     */
    public void setEntidadIVC(java.lang.String param) {
        localEntidadIVCTracker = true;

        this.localEntidadIVC = param;
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

    public boolean isMatriculaSpecified() {
        return localMatriculaTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMatricula() {
        return localMatricula;
    }

    /**
     * Auto generated setter method
     * @param param Matricula
     */
    public void setMatricula(java.lang.String param) {
        localMatriculaTracker = true;

        this.localMatricula = param;
    }

    public boolean isNoIdentSpecified() {
        return localNoIdentTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNoIdent() {
        return localNoIdent;
    }

    /**
     * Auto generated setter method
     * @param param NoIdent
     */
    public void setNoIdent(java.lang.String param) {
        localNoIdentTracker = true;

        this.localNoIdent = param;
    }

    public boolean isNoIdentRepLSpecified() {
        return localNoIdentRepLTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNoIdentRepL() {
        return localNoIdentRepL;
    }

    /**
     * Auto generated setter method
     * @param param NoIdentRepL
     */
    public void setNoIdentRepL(java.lang.String param) {
        localNoIdentRepLTracker = true;

        this.localNoIdentRepL = param;
    }

    public boolean isNomComercSpecified() {
        return localNomComercTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNomComerc() {
        return localNomComerc;
    }

    /**
     * Auto generated setter method
     * @param param NomComerc
     */
    public void setNomComerc(java.lang.String param) {
        localNomComercTracker = true;

        this.localNomComerc = param;
    }

    public boolean isTipoIdentSpecified() {
        return localTipoIdentTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTipoIdent() {
        return localTipoIdent;
    }

    /**
     * Auto generated setter method
     * @param param TipoIdent
     */
    public void setTipoIdent(java.lang.String param) {
        localTipoIdentTracker = true;

        this.localTipoIdent = param;
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
                    namespacePrefix + ":Busqueda", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "Busqueda", xmlWriter);
            }
        }

        if (localDirEstandarTracker) {
            namespace = "http://ivcWebService.alcaldiabogota.gov.co/xsd";
            writeStartElement(null, namespace, "dirEstandar", xmlWriter);

            if (localDirEstandar == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localDirEstandar);
            }

            xmlWriter.writeEndElement();
        }

        if (localEntidadIVCTracker) {
            namespace = "http://ivcWebService.alcaldiabogota.gov.co/xsd";
            writeStartElement(null, namespace, "entidadIVC", xmlWriter);

            if (localEntidadIVC == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localEntidadIVC);
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

        if (localMatriculaTracker) {
            namespace = "http://ivcWebService.alcaldiabogota.gov.co/xsd";
            writeStartElement(null, namespace, "matricula", xmlWriter);

            if (localMatricula == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localMatricula);
            }

            xmlWriter.writeEndElement();
        }

        if (localNoIdentTracker) {
            namespace = "http://ivcWebService.alcaldiabogota.gov.co/xsd";
            writeStartElement(null, namespace, "noIdent", xmlWriter);

            if (localNoIdent == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localNoIdent);
            }

            xmlWriter.writeEndElement();
        }

        if (localNoIdentRepLTracker) {
            namespace = "http://ivcWebService.alcaldiabogota.gov.co/xsd";
            writeStartElement(null, namespace, "noIdentRepL", xmlWriter);

            if (localNoIdentRepL == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localNoIdentRepL);
            }

            xmlWriter.writeEndElement();
        }

        if (localNomComercTracker) {
            namespace = "http://ivcWebService.alcaldiabogota.gov.co/xsd";
            writeStartElement(null, namespace, "nomComerc", xmlWriter);

            if (localNomComerc == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localNomComerc);
            }

            xmlWriter.writeEndElement();
        }

        if (localTipoIdentTracker) {
            namespace = "http://ivcWebService.alcaldiabogota.gov.co/xsd";
            writeStartElement(null, namespace, "tipoIdent", xmlWriter);

            if (localTipoIdent == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localTipoIdent);
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
        public static Busqueda parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            Busqueda object = new Busqueda();

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

                        if (!"Busqueda".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (Busqueda) co.gov.alcaldiabogota.ivcwebservice.xsd.ExtensionMapper.getTypeObject(nsUri,
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
                            "dirEstandar").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "dirEstandar").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setDirEstandar(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "entidadIVC").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "entidadIVC").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setEntidadIVC(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "matricula").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "matricula").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setMatricula(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "noIdent").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "noIdent").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setNoIdent(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "noIdentRepL").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "noIdentRepL").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setNoIdentRepL(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "nomComerc").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "nomComerc").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setNomComerc(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "tipoIdent").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "tipoIdent").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setTipoIdent(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
