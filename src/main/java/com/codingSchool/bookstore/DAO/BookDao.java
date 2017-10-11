package com.codingSchool.bookstore.DAO;

import com.codingSchool.bookstore.Domain.Book;

import java.util.List;

public interface BookDao {

    List<Book> finByTitle(String title);

    List<Book> findAll();

}
