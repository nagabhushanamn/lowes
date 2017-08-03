package com.bank.mts.service;

import com.bank.mts.model.Account;
import com.bank.mts.repository.AccountRepository;

public class TxrServiceImpl implements TxrService {

	private AccountRepository accountRepository;

	public TxrServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	@Override
	public String doTxr(double amount, String fromAccNum, String toAccNum) {

		// Load FromAccount
		Account fromAccount = accountRepository.load(fromAccNum);
		// Load ToAccount
		Account toAccount = accountRepository.load(toAccNum);

		// debit & credit
		if (fromAccount.getBalance() >= amount) {
			fromAccount.setBalance(fromAccount.getBalance() - amount);
			toAccount.setBalance(toAccount.getBalance() - amount);
		} else {
			throw new AccountBalanceException("no enough balance");
		}

		// update ToAccount
		accountRepository.update(toAccount);
		// update FromAccount
		accountRepository.update(fromAccount);

		return "Txr Success";
	}

}
