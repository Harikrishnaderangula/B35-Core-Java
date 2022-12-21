package junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ExecutorForLifeCycleMethod implements LifeCycleMethodDemo {

	@Test
	//Declares a custom display name for the test class or test method
	@DisplayName("Fast Method")
	void fast() {
		System.out.println("First Test case");
	}

}
