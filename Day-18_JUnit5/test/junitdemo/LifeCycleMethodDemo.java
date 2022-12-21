package junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)

interface LifeCycleMethodDemo {

	@Test
	default void test() {
		System.out.println("Simple test method");
	}

	@Test
	@BeforeEach
	default void print() {
		System.out.println("BeforeEach Demo method");
	}
	@Test
	@AfterAll
	default void accept() {
		System.out.println("AfterAll Demo method");
	}
}
