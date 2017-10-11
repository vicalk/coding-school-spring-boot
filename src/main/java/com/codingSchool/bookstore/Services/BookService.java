package com.codingSchool.bookstore.Services;

import com.codingSchool.bookstore.Domain.Book;
import org.springframework.data.domain.Page;

import java.util.List;

public interface BookService {

    List<Book> findByAuthor(String author);

    List<Book> finByTitle(String title);

    List<Book> findByAuthorAndYear(String author, String year);

    List<Book> findAll();

    void save(Book book);
}
