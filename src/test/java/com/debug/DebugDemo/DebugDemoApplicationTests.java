package com.debug.DebugDemo;

import com.debug.DebugDemo.Controller.Jacoco;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DebugDemoApplicationTests {

	@Test
	void contextLoads() {
	}


	@Test
	public void testMessageAmazeRec(){
		Jacoco jc = new Jacoco();
		Assertions.assertEquals("Hello AmazeRec!",jc.getMessage("AmazeRec"));
	}
}
