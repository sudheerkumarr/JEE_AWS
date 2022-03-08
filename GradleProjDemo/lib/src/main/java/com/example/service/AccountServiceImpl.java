package com.example.service;

import com.example.bean.Account;
import com.example.repository.AccountRepositoryImpl;
import com.example.repository.IAccountRepository;

public class AccountServiceImpl implements IAccountService{
	
	IAccountRepository accountRepo= new AccountRepositoryImpl();

	@Override
	public Account addAccount(Account account) {
		return accountRepo.addAccount(account);
		
	}

	@Override
	public Account deleteAccount(Account account) {
		return accountRepo.deleteAccount(account);
	}

	@Override
	public Account updateAccount(Account account) {
		return accountRepo.updateAccount(account);
	}

	@Override
	public Account getAccountById(int id) {
		return accountRepo.getAccountById(id);
	}

}
