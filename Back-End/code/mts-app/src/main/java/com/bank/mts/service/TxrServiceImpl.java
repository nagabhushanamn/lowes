package com.bank.mts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.mts.model.Account;
import com.bank.mts.repository.AccountRepository;

@Service("txrService")
public class TxrServiceImpl implements TxrService {

	private AccountRepository accountRepo;

	@Autowired
	public TxrServiceImpl(AccountRepository accountRepo) {
		this.accountRepo = accountRepo;
	}

	@Override
	public String doTxr(double amount, String fromAccNum, String toAccNum) {

		Account fromAccount = accountRepo.findOne(fromAccNum);
		Account toAccount = accountRepo.findOne(toAccNum);

		if (fromAccount.getBalance() >= amount) {
			fromAccount.setBalance(fromAccount.getBalance() - amount);
			toAccount.setBalance(toAccount.getBalance() + amount);
			accountRepo.save(fromAccount);
			accountRepo.save(toAccount);
		} else {
			throw new AccountBalanceException("no enough balance");
		}

		return "Txr Success";

	}

}
