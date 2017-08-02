package com.bank.mts.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SampleTest {

	@Test
	public void txrSuccess() {
		assertThat("Txr Success", is("Txr Success"));
	}

}
