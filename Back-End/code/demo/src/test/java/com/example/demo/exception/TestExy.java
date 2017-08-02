package com.example.demo.exception;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestExy {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test(expected = IndexOutOfBoundsException.class)
	public void empty() {
		new ArrayList<Object>().get(0);
	}

	@Test
	public void testExceptionMessage() {
		try {
			new ArrayList<Object>().get(0);
			// fail("Expected an IndexOutOfBoundsException to be thrown");
		} catch (IndexOutOfBoundsException anIndexOutOfBoundsException) {
			assertThat(anIndexOutOfBoundsException.getMessage(), is("Index: 0, Size: 0"));
		}
	}

	@Test
	public void shouldTestExceptionMessage() {
		List<Object> list = new ArrayList<Object>();
		thrown.expect(IndexOutOfBoundsException.class);
		thrown.expectMessage("Index: 0, Size: 0");
		list.get(0); // execution will never get past this line
	}
}
