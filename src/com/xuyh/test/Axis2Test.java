package com.xuyh.test;

import com.xuyh.client.axis2test.TestserviceLocator;
import com.xuyh.client.axis2test.TestserviceSoap11BindingStub;
import com.xuyh.client.dao.xsd.User;

public class Axis2Test {

	public static void main(String[] args) throws Throwable {
		TestserviceLocator service = new TestserviceLocator();
		TestserviceSoap11BindingStub stub = new TestserviceSoap11BindingStub();
		stub = (TestserviceSoap11BindingStub) service.getPort(stub.getClass());
		User[] users = stub.getUsers("");
		for(User user:users){
			System.out.println(user.toString());
		}
	}

}
