/**
 * IvcWebServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */
package co.gov.alcaldiabogota.ivcwebservice;


/**
 *  IvcWebServiceMessageReceiverInOut message receiver
 */
public class IvcWebServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {
    public void invokeBusinessLogic(
        org.apache.axis2.context.MessageContext msgContext,
        org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault {
        try {
            // get the implementation class for the Web Service
            Object obj = getTheImplementationObject(msgContext);

            IvcWebServiceSkeletonInterface skel = (IvcWebServiceSkeletonInterface) obj;

            //Out Envelop
            org.apache.axiom.soap.SOAPEnvelope envelope = null;

            //Find the axisOperation that has been set by the Dispatch phase.
            org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext()
                                                                      .getAxisOperation();

            if (op == null) {
                throw new org.apache.axis2.AxisFault(
                    "Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
            }

            java.lang.String methodName;

            if ((op.getName() != null) &&
                    ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(
                            op.getName().getLocalPart())) != null)) {
                if ("inIvcWebService".equals(methodName)) {
                    co.gov.alcaldiabogota.ivcwebservice.InIvcWebServiceResponse inIvcWebServiceResponse7 =
                        null;
                    co.gov.alcaldiabogota.ivcwebservice.InIvcWebService wrappedParam =
                        (co.gov.alcaldiabogota.ivcwebservice.InIvcWebService) fromOM(msgContext.getEnvelope()
                                                                                               .getBody()
                                                                                               .getFirstElement(),
                            co.gov.alcaldiabogota.ivcwebservice.InIvcWebService.class);

                    inIvcWebServiceResponse7 = skel.inIvcWebService(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            inIvcWebServiceResponse7, false,
                            new javax.xml.namespace.QName(
                                "http://ivcWebService.alcaldiabogota.gov.co",
                                "inIvcWebServiceResponse"));
                } else {
                    throw new java.lang.RuntimeException("method not found");
                }

                newMsgContext.setEnvelope(envelope);
            }
        } catch (IvcWebServiceExceptionException e) {
            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,
                "IvcWebServiceException");

            org.apache.axis2.AxisFault f = createAxisFault(e);

            if (e.getFaultMessage() != null) {
                f.setDetail(toOM(e.getFaultMessage(), false));
            }

            throw f;
        }
        catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    //
    private org.apache.axiom.om.OMElement toOM(
        co.gov.alcaldiabogota.ivcwebservice.InIvcWebService param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(co.gov.alcaldiabogota.ivcwebservice.InIvcWebService.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        co.gov.alcaldiabogota.ivcwebservice.InIvcWebServiceResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(co.gov.alcaldiabogota.ivcwebservice.InIvcWebServiceResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        co.gov.alcaldiabogota.ivcwebservice.IvcWebServiceException param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(co.gov.alcaldiabogota.ivcwebservice.IvcWebServiceException.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        co.gov.alcaldiabogota.ivcwebservice.InIvcWebServiceResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    co.gov.alcaldiabogota.ivcwebservice.InIvcWebServiceResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private co.gov.alcaldiabogota.ivcwebservice.InIvcWebServiceResponse wrapinIvcWebService() {
        co.gov.alcaldiabogota.ivcwebservice.InIvcWebServiceResponse wrappedElement =
            new co.gov.alcaldiabogota.ivcwebservice.InIvcWebServiceResponse();

        return wrappedElement;
    }

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
        java.lang.Class type) throws org.apache.axis2.AxisFault {
        try {
            if (co.gov.alcaldiabogota.ivcwebservice.InIvcWebService.class.equals(
                        type)) {
                return co.gov.alcaldiabogota.ivcwebservice.InIvcWebService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (co.gov.alcaldiabogota.ivcwebservice.InIvcWebServiceResponse.class.equals(
                        type)) {
                return co.gov.alcaldiabogota.ivcwebservice.InIvcWebServiceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (co.gov.alcaldiabogota.ivcwebservice.IvcWebServiceException.class.equals(
                        type)) {
                return co.gov.alcaldiabogota.ivcwebservice.IvcWebServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }

    private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();

        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }
} //end of class
