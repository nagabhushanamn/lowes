package com.example.demo.asserts;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.hamcrest.core.CombinableMatcher;
import org.junit.Test;

public class HamcrestAssertTests {

	@Test
	public void testAssertThatBothContainsString() {
		assertThat("albumen", both(containsString("a")).and(containsString("b")));
	}

	@Test
	public void testAssertThatHasItems() {
		assertThat(Arrays.asList("one", "two", "three"), hasItems("one", "three"));
	}

	@Test
	public void testAssertThatEveryItemContainsString() {
		assertThat(Arrays.asList(new String[] { "fun", "ban", "net" }), everyItem(containsString("n")));
	}

	@Test
	public void testAssertThatHamcrestCoreMatchers() {
		assertThat("good", allOf(equalTo("good"), startsWith("good")));
		assertThat("good", not(allOf(equalTo("bad"), equalTo("good"))));
		assertThat("good", anyOf(equalTo("bad"), equalTo("good")));
		assertThat(7, not(CombinableMatcher.<Integer>either(equalTo(5)).or(equalTo(4))));
		assertThat(new Object(), not(sameInstance(new Object())));
	}

}
