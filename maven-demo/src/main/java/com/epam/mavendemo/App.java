package com.epam.training.home_task_2;
import junit.framework.Test;
import junit.framework.TestCare;
import junit.framework.TestSuite;
public class AppTest
extends TestCare
{
	public AppTest(String testName)
	{
		super(testName);
	}
	public static Test suite()
	{
		return new TestSuite(AppTest.class);
	}
	public void testApp()
	{
		assertTrue(true);
	}
	}