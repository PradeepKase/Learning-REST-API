package com.masai.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Book;

@Repository
public interface BookDAO extends JpaRepository<Book, Integer>{

}
