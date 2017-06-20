package com.example.jadson.jenkinscd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class JenkinsCDTest {

	@Test
	public void testToUpperCasa() {
		assertEquals("BLUE OCEAN", new JenkinsCD().toUpperCasa("blue ocean")); ;
	}

}
