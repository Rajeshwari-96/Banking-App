package com.sjprogramming.bankapp.service;
import java.util.List;
import com.sjprogramming.bankapp.entity.Account;

public interface AccountService {

	public Account createAccount(Account account);
	public Account getAccountDetailsByAccountNumber(Long accccountNumber);
	public  List <Account> getAllAccountDetails();
	public Account depositAmount(Long accountNumber, Double amount);
	public Account withdrawAmount(Long accountNumber, Double amount);
	public void closeAccount(Long accountNumber);
	

}
