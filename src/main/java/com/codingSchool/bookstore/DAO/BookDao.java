package com.codingSchool.bookstore.DAO;

import java.util.List;

public interface BookDao {

    List<Book> finByTitle(String title);

    List<Book> findAll();

}
