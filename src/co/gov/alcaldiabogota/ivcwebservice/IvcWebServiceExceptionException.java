/**
 * IvcWebServiceExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */
package co.gov.alcaldiabogota.ivcwebservice;

public class IvcWebServiceExceptionException extends java.lang.Exception {
    private static final long serialVersionUID = 1485276333229L;
    private co.gov.alcaldiabogota.ivcwebservice.IvcWebServiceException faultMessage;

    public IvcWebServiceExceptionException() {
        super("IvcWebServiceExceptionException");
    }

    public IvcWebServiceExceptionException(java.lang.String s) {
        super(s);
    }

    public IvcWebServiceExceptionException(java.lang.String s,
        java.lang.Throwable ex) {
        super(s, ex);
    }

    public IvcWebServiceExceptionException(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        co.gov.alcaldiabogota.ivcwebservice.IvcWebServiceException msg) {
        faultMessage = msg;
    }

    public co.gov.alcaldiabogota.ivcwebservice.IvcWebServiceException getFaultMessage() {
        return faultMessage;
    }
}
