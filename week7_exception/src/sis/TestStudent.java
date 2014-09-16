package sis;

import junit.framework.TestCase;

public class TestStudent extends TestCase{
	
	public void testStudent(){
		Student student = new Student("Tomas");
		assertEquals("Tomas", student.getName());
	}
}
