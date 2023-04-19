package com.karl.sonarqube.service;

import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl {

	private static final String S1 = "Testing is very interesting!";
	private static final String S = "A method which returns an object.......";

	public String getMessage() {
		return S1;
	}
	public Object getObject() {
		return S;
	}

}


