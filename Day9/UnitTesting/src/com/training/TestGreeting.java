package com.training;

import static org.junit.Assert.assertThrows;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TestGreeting {
	
    Greeting objGreeting;
    @BeforeAll
    public static void init() {
    	System.out.println("Before all.....");
    }
    @BeforeEach
    public void setup(TestInfo info) {
      System.out.println("Before each...."+ info.getTestMethod().get().getName());
      objGreeting= new Greeting(); 
     
    }
    
    
	@Test
	@DisplayName(value = "To Test the Method returns string length less than 10")
	void testForGetMessageLength() {
		 
		int actual= objGreeting.getMessage().length();
		int expected =10;
		
		assertEquals(expected,actual);
	}

	@Test
	@DisplayName(value = "To Test the Method returns grade")
	void testForAssignGrade() {
		
		String actual= objGreeting.assignGrade(40);
		String expected="b";
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	@DisplayName(value= "To Test the Method returns")
	void testParsemethod() {
	  assertThrows(NumberFormatException.class, 
			     () -> objGreeting.parse("fifty")); 
		
	}
	
//	@Test
//	@Disabled("will wait bu to be fixed..")
//	void testBestbook() {
//		fail("not yet completed...");
//	}
	
    
	@ParameterizedTest
	@ValueSource(ints = {0,1,3})
	void testGetBestBook(int idxpos) {
		LocalDate currentDate= LocalDate.now();
		
		assumeTrue(currentDate.getDayOfWeek().equals(DayOfWeek.FRIDAY));
		assertNotNull(objGreeting.getBestBook(idxpos));
	}
	
	@AfterEach
	void tearDown() {
		System.out.println("After all called....");
	}
	@AfterAll
	public static void destroy() {
		System.out.println("after all........");
	}
}
