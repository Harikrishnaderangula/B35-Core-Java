package junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class FirstUnit5testDemo {

	@Test
	/* it signifies that this is a test method in to which
	 * we write our code to test*/
	void print() {
		System.out.println("First JUnit5 Demo");
	}
@Test
@Disabled
void display()
{
	fail("Fail to  Print");
}
}
