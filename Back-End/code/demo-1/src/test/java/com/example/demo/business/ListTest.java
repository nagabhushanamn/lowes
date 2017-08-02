package com.example.demo.business;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void letMockSize() {
		List list = mock(List.class);
		when(list.size()).thenReturn(10);
		assertEquals(10, list.size());
	}

	@Test
	public void letMockWithMultipleReturnValues() {
		List list = mock(List.class);
		when(list.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, list.size());
		assertEquals(20, list.size());
		assertEquals(20, list.size());
		assertEquals(20, list.size());
		assertEquals(20, list.size());
	}

	@Test
	public void letMockWithListGet() {
		List list = mock(List.class);
		when(list.get(0)).thenReturn("biryani");
		assertEquals("biryani", list.get(0));
		assertNull(list.get(1));
	}

	@Test
	public void letMockGetWithAny() {
		List list = mock(List.class);
		when(list.get(anyInt())).thenReturn("lowes");
		assertEquals("lowes", list.get(0));
		assertNotNull(list.get(1));
	}
	

}
