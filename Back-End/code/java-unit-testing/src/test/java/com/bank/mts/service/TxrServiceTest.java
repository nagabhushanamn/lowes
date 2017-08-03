package com.bank.mts.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;

import com.bank.mts.repository.AccountRepository;

public class TxrServiceTest {

	private AccountRepository accountRepositoryMock;
	private TxrService txrService;

	@Before
	public void setUp() {
		accountRepositoryMock = mock(AccountRepository.class);
		txrService = new TxrServiceImpl(accountRepositoryMock);
	}

	@Test
	public void txrSuccess() {
		// Tod-do
		assertThat(txrService.doTxr(0, "1", "2"), is("Txr Success"));
	}

}
