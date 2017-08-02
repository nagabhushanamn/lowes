package com.bank.mts.service;

public class AccountBalanceException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AccountBalanceException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}

}
