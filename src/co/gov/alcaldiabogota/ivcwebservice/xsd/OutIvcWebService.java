/**
 * OutIvcWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:48:01 BST)
 */
package co.gov.alcaldiabogota.ivcwebservice.xsd;


/**
 *  OutIvcWebService bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class OutIvcWebService implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = OutIvcWebService
       Namespace URI = http://ivcWebService.alcaldiabogota.gov.co/xsd
       Namespace Prefix = ns2
     */

    /**
     * field for CodigoResp
     */
    protected java.lang.String localCodigoResp;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCodigoRespTracker = false;

    /**
     * field for Establecimientos
     * This was an Array!
     */
    protected co.gov.alcaldiabogota.ivcwebservice.xsd.Establecimiento[] localEstablecimientos;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEstablecimientosTracker = false;

    /**
     * field for IdResp
     */
    protected java.lang.String localIdResp;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIdRespTracker = false;

    /**
     * field for Mensaje
     */
    protected java.lang.String localMensaje;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMensajeTracker = false;

    /**
     * field for TraceIvcWebService
     */
    protected java.lang.String localTraceIvcWebService;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTraceIvcWebServiceTracker = false;

    public boolean isCodigoRespSpecified() {
        return localCodigoRespTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCodigoResp() {
        return localCodigoResp;
    }

    /**
     * Auto generated setter method
     * @param param CodigoResp
     */
    public void setCodigoResp(java.lang.String param) {
        localCodigoRespTracker = true;

        this.localCodigoResp = param;
    }

    public boolean isEstablecimientosSpecified() {
        return localEstablecimientosTracker;
    }

    /**
     * Auto generated getter method
     * @return co.gov.alcaldiabogota.ivcwebservice.xsd.Establecimiento[]
     */
    public co.gov.alcaldiabogota.ivcwebservice.xsd.Establecimiento[] getEstablecimientos() {
        return localEstablecimientos;
    }

    /**
     * validate the array for Establecimientos
     */
    protected void validateEstablecimientos(
        co.gov.alcaldiabogota.ivcwebservice.xsd.Establecimiento[] param) {
    }

    /**
     * Auto generated setter method
     * @param param Establecimientos
     */
    public void setEstablecimientos(
        co.gov.alcaldiabogota.ivcwebservice.xsd.Establecimiento[] param) {
        validateEstablecimientos(param);

        localEstablecimientosTracker = true;

        this.localEstablecimientos = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param co.gov.alcaldiabogota.ivcwebservice.xsd.Establecimiento
     */
    public void addEstablecimientos(
        co.gov.alcaldiabogota.ivcwebservice.xsd.Establecimiento param) {
        if (localEstablecimientos == null) {
            localEstablecimientos = new co.gov.alcaldiabogota.ivcwebservice.xsd.Establecimiento[] {
                    
                };
        }

        //update the setting tracker
        localEstablecimientosTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localEstablecimientos);
        list.add(param);
        this.localEstablecimientos = (co.gov.alcaldiabogota.ivcwebservice.xsd.Establecimiento[]) list.toArray(new co.gov.alcaldiabogota.ivcwebservice.xsd.Establecimiento[list.size()]);
    }

    public boolean isIdRespSpecified() {
        return localIdRespTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getIdResp() {
        return localIdResp;
    }

    /**
     * Auto generated setter method
     * @param param IdResp
     */
    public void setIdResp(java.lang.String param) {
        localIdRespTracker = true;

        this.localIdResp = param;
    }

    public boolean isMensajeSpecified() {
        return localMensajeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMensaje() {
        return localMensaje;
    }

    /**
     * Auto generated setter method
     * @param param Mensaje
     */
    public void setMensaje(java.lang.String param) {
        localMensajeTracker = true;

        this.localMensaje = param;
    }

    public boolean isTraceIvcWebServiceSpecified() {
        return localTraceIvcWebServiceTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTraceIvcWebService() {
        return localTraceIvcWebService;
    }

    /**
     * Auto generated setter method
     * @param param TraceIvcWebService
     */
    public void setTraceIvcWebService(java.lang.String param) {
        localTraceIvcWebServiceTracker = true;

        this.localTraceIvcWebService = param;
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
                    namespacePrefix + ":OutIvcWebService", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "OutIvcWebService", xmlWriter);
            }
        }

        if (localCodigoRespTracker) {
            namespace = "http://ivcWebService.alcaldiabogota.gov.co/xsd";
            writeStartElement(null, namespace, "codigoResp", xmlWriter);

            if (localCodigoResp == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localCodigoResp);
            }

            xmlWriter.writeEndElement();
        }

        if (localEstablecimientosTracker) {
            if (localEstablecimientos != null) {
                for (int i = 0; i < localEstablecimientos.length; i++) {
                    if (localEstablecimientos[i] != null) {
                        localEstablecimientos[i].serialize(new javax.xml.namespace.QName(
                                "http://ivcWebService.alcaldiabogota.gov.co/xsd",
                                "establecimientos"), xmlWriter);
                    } else {
                        writeStartElement(null,
                            "http://ivcWebService.alcaldiabogota.gov.co/xsd",
                            "establecimientos", xmlWriter);

                        // write the nil attribute
                        writeAttribute("xsi",
                            "http://www.w3.org/2001/XMLSchema-instance", "nil",
                            "1", xmlWriter);
                        xmlWriter.writeEndElement();
                    }
                }
            } else {
                writeStartElement(null,
                    "http://ivcWebService.alcaldiabogota.gov.co/xsd",
                    "establecimientos", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            }
        }

        if (localIdRespTracker) {
            namespace = "http://ivcWebService.alcaldiabogota.gov.co/xsd";
            writeStartElement(null, namespace, "idResp", xmlWriter);

            if (localIdResp == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localIdResp);
            }

            xmlWriter.writeEndElement();
        }

        if (localMensajeTracker) {
            namespace = "http://ivcWebService.alcaldiabogota.gov.co/xsd";
            writeStartElement(null, namespace, "mensaje", xmlWriter);

            if (localMensaje == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localMensaje);
            }

            xmlWriter.writeEndElement();
        }

        if (localTraceIvcWebServiceTracker) {
            namespace = "http://ivcWebService.alcaldiabogota.gov.co/xsd";
            writeStartElement(null, namespace, "traceIvcWebService", xmlWriter);

            if (localTraceIvcWebService == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localTraceIvcWebService);
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
        public static OutIvcWebService parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            OutIvcWebService object = new OutIvcWebService();

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

                        if (!"OutIvcWebService".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (OutIvcWebService) co.gov.alcaldiabogota.ivcwebservice.xsd.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                java.util.ArrayList list2 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ivcWebService.alcaldiabogota.gov.co/xsd",
                            "codigoResp").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "codigoResp").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setCodigoResp(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "establecimientos").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "establecimientos").equals(
                            reader.getName())) {
                    // Process the array and step past its final element's end.
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        list2.add(null);
                        reader.next();
                    } else {
                        list2.add(co.gov.alcaldiabogota.ivcwebservice.xsd.Establecimiento.Factory.parse(
                                reader));
                    }

                    //loop until we find a start element that is not part of this array
                    boolean loopDone2 = false;

                    while (!loopDone2) {
                        // We should be at the end element, but make sure
                        while (!reader.isEndElement())
                            reader.next();

                        // Step out of this element
                        reader.next();

                        // Step to next element event.
                        while (!reader.isStartElement() &&
                                !reader.isEndElement())
                            reader.next();

                        if (reader.isEndElement()) {
                            //two continuous end elements means we are exiting the xml structure
                            loopDone2 = true;
                        } else {
                            if (new javax.xml.namespace.QName(
                                        "http://ivcWebService.alcaldiabogota.gov.co/xsd",
                                        "establecimientos").equals(
                                        reader.getName())) {
                                nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                        "nil");

                                if ("true".equals(nillableValue) ||
                                        "1".equals(nillableValue)) {
                                    list2.add(null);
                                    reader.next();
                                } else {
                                    list2.add(co.gov.alcaldiabogota.ivcwebservice.xsd.Establecimiento.Factory.parse(
                                            reader));
                                }
                            } else {
                                loopDone2 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setEstablecimientos((co.gov.alcaldiabogota.ivcwebservice.xsd.Establecimiento[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            co.gov.alcaldiabogota.ivcwebservice.xsd.Establecimiento.class,
                            list2));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ivcWebService.alcaldiabogota.gov.co/xsd",
                            "idResp").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "idResp").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setIdResp(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "mensaje").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "mensaje").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setMensaje(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "traceIvcWebService").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("", "traceIvcWebService").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setTraceIvcWebService(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
