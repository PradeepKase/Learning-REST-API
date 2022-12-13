package com.masai.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.AccountException;
import com.masai.exception.InsufficientFundException;
import com.masai.model.Account;
import com.masai.model.AccountDTO;
import com.masai.repository.AccountRepo;

@Service
public class AccountserviceIMpl implements Accountservice{

	@Autowired
	private AccountRepo sRepo;

	@Override
	public Account openAccount(Account acc) throws AccountException {

		Account savedStudent= sRepo.save(acc);
		
		return savedStudent;
	}

	
	
	
	
	
	
	@Override
	public Account closeAccount(Integer accno) throws AccountException {
    Optional<Account> opt= sRepo.findById(accno);
		
		if(opt.isPresent()) {
			
			
			Account existingAccount= opt.get();
			sRepo.delete(existingAccount);
			
			return existingAccount;
			
			
		}else
			throw new AccountException("Account does not exist with Account :"+accno);
		
		
		
		
	}

	
	
	
	
	
	
	@Override
	public Account depositAmount(Integer accno, Integer amount) throws AccountException {
		Account existingAccount= sRepo.findById(accno)
				.orElseThrow(() -> new AccountException("Account does not exist with Account "+accno));
		
		existingAccount.setBalance(existingAccount.getBalance()+amount);
		
		return  sRepo.save(existingAccount);
	}

	
	
	
	@Override
	public Account withdrawAmount(int accno, Integer amount) throws AccountException, InsufficientFundException {
		
    Optional<Account> opt= sRepo.findById(accno);
		
		if(opt.isPresent()) {
			
			
			Account existingAccount= opt.get();
			
			if(existingAccount.getBalance()<amount) {
				throw new InsufficientFundException("Insufficient balance!!");
				
			}
			else {
			existingAccount.setBalance(existingAccount.getBalance()-amount);
				
				return existingAccount;
				
			}
			
		}
		else
			throw new AccountException("Account does not exist with Account :"+accno);
		
	}







	@Override
	public String transferAmount(AccountDTO dto) throws AccountException, InsufficientFundException {
		 Optional<Account> opt=sRepo.findById(dto.getSrcAccno());	
		 Optional<Account>opt2= sRepo.findById(dto.getDesAccno());
		 
		 if(opt.isPresent()&&opt2.isPresent()) {
			 Account src=opt.get();
			 Account des=opt2.get();
			 
			 if(src.getBalance()>=dto.getAmount()) {
				 
				 src.setBalance(src.getBalance()-dto.getAmount());
				 des.setBalance(des.getBalance()+dto.getAmount());
				 return "Trasection succesfull";
				 
			 }
			 else {
				 throw new InsufficientFundException("Insufficient balance");
			 }
			 
			 
			 
		 }
		 else if(!opt.isPresent()) {
			 throw new AccountException("Account does not exist with Account :"+dto.getSrcAccno());
		 }
		 else if(!opt2.isPresent()) {
			 throw new AccountException("Account does not exist with Account :"+dto.getDesAccno());
		 }
		 
		 else {
			 throw new AccountException("Accounts does not exist with Account");
		 }
	}
	
	
}
