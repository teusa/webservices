/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:48:01 BST)
 */
package co.gov.alcaldiabogota.ivcwebservice.xsd;


/**
 *  ExtensionMapper class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class ExtensionMapper {
    public static java.lang.Object getTypeObject(
        java.lang.String namespaceURI, java.lang.String typeName,
        javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
        if ("http://ivcWebService.alcaldiabogota.gov.co/xsd".equals(
                    namespaceURI) && "OutIvcWebService".equals(typeName)) {
            return co.gov.alcaldiabogota.ivcwebservice.xsd.OutIvcWebService.Factory.parse(reader);
        }

        if ("http://ivcWebService.alcaldiabogota.gov.co".equals(namespaceURI) &&
                "Exception".equals(typeName)) {
            return co.gov.alcaldiabogota.ivcwebservice.Exception.Factory.parse(reader);
        }

        if ("http://ivcWebService.alcaldiabogota.gov.co/xsd".equals(
                    namespaceURI) && "Search".equals(typeName)) {
            return co.gov.alcaldiabogota.ivcwebservice.xsd.Search.Factory.parse(reader);
        }

        if ("http://ivcWebService.alcaldiabogota.gov.co/xsd".equals(
                    namespaceURI) && "Stablishment".equals(typeName)) {
            return co.gov.alcaldiabogota.ivcwebservice.xsd.Stablishment.Factory.parse(reader);
        }

        if ("http://ivcWebService.alcaldiabogota.gov.co/xsd".equals(
                    namespaceURI) && "IvcWebServiceException".equals(typeName)) {
            return co.gov.alcaldiabogota.ivcwebservice.xsd.IvcWebServiceException.Factory.parse(reader);
        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type " +
            namespaceURI + " " + typeName);
    }
}
