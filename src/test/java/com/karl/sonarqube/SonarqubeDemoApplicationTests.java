package com.karl.sonarqube;

import com.karl.sonarqube.controller.MessageController;
import com.karl.sonarqube.service.MessageServiceImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SonarqubeDemoApplicationTests {

	@Autowired
	private MessageController controller;

	@Autowired
	private MessageServiceImpl messageService;
	
	@Test
	void contextLoads() {
		Assert.assertTrue(true);
	}

	@Test
	void testGetMessage() {
		String message = controller.getMessage();
		Assertions.assertNotNull(message);
	}

	@Test
	void testGetMessageService() {
		Object o = messageService.getObject();
		Assertions.assertNotNull(o);
	}
}