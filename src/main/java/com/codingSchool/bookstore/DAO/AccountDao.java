package com.codingSchool.bookstore.DAO;

import com.codingSchool.bookstore.Domain.User;

public interface AccountDao {

    User login(String username, String password) throws Exception;

    void logout(String username) throws Exception;

    void register(User user) throws Exception;
}
