package com.codingSchool.bookstore.Services;

import com.codingSchool.bookstore.Domain.User;
import org.springframework.security.core.AuthenticationException;


public interface AccountService {

    void login(String email, String password) throws AuthenticationException;

    void logout(String login) throws Exception;

    void register(User user) throws Exception;
}
