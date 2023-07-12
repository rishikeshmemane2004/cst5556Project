package day3Jul23;

import java.util.Objects;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

class Student
{
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	 
	@Override
	public boolean equals(Object obj) {
		Student student = (Student) obj;
		return this.id == student.id && Objects.equals(this.name, student.name);

	}
	
	
}


public class SoftAssertionDemo {

	@Test
	public void verifySoftAssertion1() {
		//first step
		SoftAssert sa = new SoftAssert();

		// second step
		int a = 13, b = 15;
		sa.assertEquals(a, b,"a != b");
		
		String s1 = "Amit", s2 = "Amit";
		sa.assertEquals(s1, s2, "s1!=s2");
		
		float f1 = 12.3589f, f2 = 12.35f;
		sa.assertEquals(f1, f2,"f1!=f2");
		
		String s = "Cyber";
		sa.assertNull(s,"s is not null");
		
		byte c=3, d=3;
		sa.assertNotEquals(c, d,"c is equal to d");
		
		
		Student stud1 = new Student(1,"Siddesh");
		Student stud2 = new Student(1,"Siddesh1");
		sa.assertSame(stud1, stud2,"Stud1 != Stud2");
		 
		
		// third step
		sa.assertAll("Few SOFT Assertions are failed"); //report to testng 		

	/* Assert commonly used methods: 
	 * assertEquals
	 * assertNotEquals
	 * assertSame
	 * assertNotSame
	 * assertTrue
	 * assertFalse
	 * fail
	 * isNull
	 * isNotNull
	 */
		
	}
	
	
	
	
	
}
