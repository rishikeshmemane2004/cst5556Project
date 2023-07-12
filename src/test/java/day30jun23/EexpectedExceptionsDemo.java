package day30jun23;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class EexpectedExceptionsDemo {

	@Test(expectedExceptions= {NoSuchElementException.class})
	public void test1()
	{
		System.out.println("ASDASDASD");
		throw new NoSuchElementException("Intentionally raising an excception");
	}
}
