package com.bank.mts.service;

import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.argThat;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.hamcrest.Matcher;
import org.junit.Test;

public class MockLearn {

	@Test
	public void sampleSpec() {

		List mockedList = mock(List.class);

		// // verify

		// mockedList.add("vegbiryani");
		// mockedList.clear();
		//
		// verify(mockedList).add("vegbiryani");
		// verify(mockedList).clear();

		// --------------------------------------

		// when

		// when(mockedList.get(0)).thenReturn("biryani");
		// when(mockedList.get(1)).thenThrow(new RuntimeException());

		// System.out.println(mockedList.get(0));
		// System.out.println(mockedList.get(1));

		// --------------------------------------

		// Argument matchers

		// when(mockedList.get(anyInt())).thenReturn("element");
		// System.out.println(mockedList.get(99));

		// -----------------------------------------

		// times

		// mockedList.add("one");
		//
		// mockedList.add("two");
		// mockedList.add("two");
		//
		// mockedList.add("three");
		// mockedList.add("three");
		// mockedList.add("three");
		//
		// verify(mockedList).add("one");
		// verify(mockedList, times(1)).add("one");
		//
		// verify(mockedList, times(2)).add("two");
		//
		// // verify(mockedList, times(3)).add("three");
		// verify(mockedList, atLeastOnce()).add("three");
		//
		// verify(mockedList, never()).add("four");

		// ----------------------------------

		// Testing void methods

		doThrow(new RuntimeException()).when(mockedList).clear();

		mockedList.clear();

		verify(mockedList).clear();

	}

}
