package com.example.demo.asserts;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitAssertTests {

	@Test
	public void testAssertArrayEquals() {
		byte[] expected = "trial".getBytes();
		byte[] actual = "trial".getBytes();
		assertArrayEquals("failure - byte arrays not same", expected, actual);
	}

	@Test
	public void testAssertEquality() {
		assertEquals("failure - strings are not equal", "text", "text");
		assertNotEquals("failure - strings are  equal", "text", "txet");
	}

	@Test
	public void testAssertBoolean() {
		assertFalse("failure - should be false", false);
		assertTrue("failure - should be true", true);
	}

	@Test
	public void testAssertNull() {
		assertNull("should be null", null);
		assertNotNull("should not be null", new Object());
	}

	@Test
	public void testAssertSame() {
		Object o1 = new Object();
		Object o2 = o1;
		assertSame("should  be same Object", o1, o2);
		assertNotSame("should not be same Object", new Object(), new Object());
	}

}
