/**
 * MathUtilityServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wtp;

public class MathUtilityServiceLocator extends org.apache.axis.client.Service implements wtp.MathUtilityService {

    public MathUtilityServiceLocator() {
    }


    public MathUtilityServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MathUtilityServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MathUtility
    private java.lang.String MathUtility_address = "http://localhost:8080/MathAxis/services/MathUtility";

    public java.lang.String getMathUtilityAddress() {
        return MathUtility_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MathUtilityWSDDServiceName = "MathUtility";

    public java.lang.String getMathUtilityWSDDServiceName() {
        return MathUtilityWSDDServiceName;
    }

    public void setMathUtilityWSDDServiceName(java.lang.String name) {
        MathUtilityWSDDServiceName = name;
    }

    public wtp.MathUtility getMathUtility() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MathUtility_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMathUtility(endpoint);
    }

    public wtp.MathUtility getMathUtility(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            wtp.MathUtilitySoapBindingStub _stub = new wtp.MathUtilitySoapBindingStub(portAddress, this);
            _stub.setPortName(getMathUtilityWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMathUtilityEndpointAddress(java.lang.String address) {
        MathUtility_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (wtp.MathUtility.class.isAssignableFrom(serviceEndpointInterface)) {
                wtp.MathUtilitySoapBindingStub _stub = new wtp.MathUtilitySoapBindingStub(new java.net.URL(MathUtility_address), this);
                _stub.setPortName(getMathUtilityWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("MathUtility".equals(inputPortName)) {
            return getMathUtility();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://wtp", "MathUtilityService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://wtp", "MathUtility"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MathUtility".equals(portName)) {
            setMathUtilityEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
