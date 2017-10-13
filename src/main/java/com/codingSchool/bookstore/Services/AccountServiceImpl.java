package com.codingSchool.bookstore.Services;

import com.codingSchool.bookstore.DAO.AccountDao;
import com.codingSchool.bookstore.Domain.User;
import com.codingSchool.bookstore.Exceptions.InvalidCredentialsException;
import com.codingSchool.bookstore.Exceptions.LogoutException;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    private final static org.slf4j.Logger LOG = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Autowired
    private AccountDao accountDao;

    @Override
    public void login(String email, String password) throws AuthenticationException {

        try {
            accountDao.login(email, password);
        } catch (Exception e) {
            throw new InvalidCredentialsException("User not found!");
        }
    }

    @Override
    public void logout(String email) {
        try {
            accountDao.logout(email);
        } catch (Exception e) {
            throw new LogoutException("User not logged in!");
        }
    }

    @Override
    public void register(User user) throws Exception {
        accountDao.register(user);
        LOG.debug("User has been registered!");
    }

}
