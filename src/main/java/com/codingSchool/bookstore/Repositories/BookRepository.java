package com.codingSchool.bookstore.Repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


// Repositories should be used instead of DAOS when we add the JPA imlementation.
// We dont use BOTH- we either use a custom made dao ( we write the queries to the DB, we dont use ORM) or we
//use JPA repos instead where the queries are provided for us.
@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findAll();

    List<Book> findByTitle(String title);

    List<Book> findByAuthor(String author);

    List<Book> findByAuthorAndYear(String author, String year);

    List<Book> findByAuthorAndTitleAndYear(String author, String title, String year);

    Book save(Book book);

}
