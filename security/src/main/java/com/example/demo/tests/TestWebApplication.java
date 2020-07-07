package com.example.demo.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.demo.hello.Hello;

public class TestWebApplication {
	
	@Test
	public void testHello() {
		Hello user = new Hello();
		String expected = "Successful";
		String actual = user.hello();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testAdmin() {
		Hello user = new Hello();
		String expected = "Admin";
		String actual = user.admin();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testUser() {
		Hello user = new Hello();
		String expected = "User";
		String actual = user.user();
		assertEquals(expected, actual);
	}
	
}
