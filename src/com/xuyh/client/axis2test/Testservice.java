/**
 * Testservice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xuyh.client.axis2test;

public interface Testservice extends javax.xml.rpc.Service {
    public java.lang.String getTestserviceHttpSoap11EndpointAddress();

    public com.xuyh.client.axis2test.TestservicePortType getTestserviceHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException;

    public com.xuyh.client.axis2test.TestservicePortType getTestserviceHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
