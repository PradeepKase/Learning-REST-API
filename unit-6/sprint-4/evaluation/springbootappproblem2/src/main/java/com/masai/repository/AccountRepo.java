package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Account;

public interface AccountRepo extends JpaRepository <Account, Integer>{

}
