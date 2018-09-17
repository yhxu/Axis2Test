package com.xuyh.client.axis2test;

public class TestservicePortTypeProxy implements com.xuyh.client.axis2test.TestservicePortType {
  private String _endpoint = null;
  private com.xuyh.client.axis2test.TestservicePortType testservicePortType = null;
  
  public TestservicePortTypeProxy() {
    _initTestservicePortTypeProxy();
  }
  
  public TestservicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initTestservicePortTypeProxy();
  }
  
  private void _initTestservicePortTypeProxy() {
    try {
      testservicePortType = (new com.xuyh.client.axis2test.TestserviceLocator()).getTestserviceHttpSoap11Endpoint();
      if (testservicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)testservicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)testservicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (testservicePortType != null)
      ((javax.xml.rpc.Stub)testservicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.xuyh.client.axis2test.TestservicePortType getTestservicePortType() {
    if (testservicePortType == null)
      _initTestservicePortTypeProxy();
    return testservicePortType;
  }
  
  public com.xuyh.client.dao.xsd.User[] getUsers(java.lang.String args) throws java.rmi.RemoteException{
    if (testservicePortType == null)
      _initTestservicePortTypeProxy();
    return testservicePortType.getUsers(args);
  }
  
  
}