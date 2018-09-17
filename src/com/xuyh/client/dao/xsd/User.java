/**
 * User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xuyh.client.dao.xsd;

public class User  implements java.io.Serializable {
    private java.lang.Integer userAge;

    private java.lang.String userName;

    private java.lang.String userPass;

    public User() {
    }

    public User(
           java.lang.Integer userAge,
           java.lang.String userName,
           java.lang.String userPass) {
           this.userAge = userAge;
           this.userName = userName;
           this.userPass = userPass;
    }


    @Override
	public String toString() {
		return "User [userAge=" + userAge + ", userName=" + userName
				+ ", userPass=" + userPass + "]";
	}

	/**
     * Gets the userAge value for this User.
     * 
     * @return userAge
     */
    public java.lang.Integer getUserAge() {
        return userAge;
    }


    /**
     * Sets the userAge value for this User.
     * 
     * @param userAge
     */
    public void setUserAge(java.lang.Integer userAge) {
        this.userAge = userAge;
    }


    /**
     * Gets the userName value for this User.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this User.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the userPass value for this User.
     * 
     * @return userPass
     */
    public java.lang.String getUserPass() {
        return userPass;
    }


    /**
     * Sets the userPass value for this User.
     * 
     * @param userPass
     */
    public void setUserPass(java.lang.String userPass) {
        this.userPass = userPass;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userAge==null && other.getUserAge()==null) || 
             (this.userAge!=null &&
              this.userAge.equals(other.getUserAge()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.userPass==null && other.getUserPass()==null) || 
             (this.userPass!=null &&
              this.userPass.equals(other.getUserPass())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getUserAge() != null) {
            _hashCode += getUserAge().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getUserPass() != null) {
            _hashCode += getUserPass().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(User.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dao.servers.xuyh.com/xsd", "User"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dao.servers.xuyh.com/xsd", "userAge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dao.servers.xuyh.com/xsd", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dao.servers.xuyh.com/xsd", "userPass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
