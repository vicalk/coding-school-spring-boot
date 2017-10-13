package com.codingSchool.bookstore.DAO;

import com.google.common.collect.ImmutableList;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BookDaoImpl implements BookDao {
    private Map<String, Book> books;

    @PostConstruct
    void initBooksMap() {
        books = new HashMap<>();
        books.put("The Scarlet Letter", new Book("The Scarlet Letter", "1900", "Nathaniel Hawthorne"));
        books.put("The Brothers Karamazov", new Book("The Brothers Karamazov", "1910", "Fyodor Dostoevsky"));
    }

    @Override
    public List<Book> finByTitle(String title) {
        return ImmutableList.of(books.get(title));
    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(books.values());
    }
}
