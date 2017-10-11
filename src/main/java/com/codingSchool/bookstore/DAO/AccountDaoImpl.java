package com.codingSchool.bookstore.DAO;

import com.codingSchool.bookstore.Domain.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;


@Repository
public class AccountDaoImpl implements AccountDao {

    private static Map<String, User> userRepository;

    private static Map<String, User> loggedInUsers;

    static {
        loggedInUsers = new HashMap<String, User>();
        userRepository = new HashMap<String, User>();
        userRepository.put(getCredentials("janedoe", "test"),
                new User("test", "pass", "Jane", "Doe", "jane@mail.com"));

    }

    @Override
    public User login(String username, String password) throws Exception {
        if (userRepository.containsKey(getCredentials(username, password))) {
            User user = userRepository.get(getCredentials(username, password));
            loggedInUsers.put(username, user);
            return user;
        }
        throw new Exception("User Not Found");
    }


    @Override
    public void logout(String username) throws Exception {

        if (loggedInUsers.containsKey(username)) {
            loggedInUsers.remove(username);
        } else {
            throw new Exception("User Not Found");
        }
    }


    @Override
    public void register(User user) throws Exception {

        if (userRepository.containsKey(user.getUsername())) {
            throw new Exception("User already exists!");
        }

        userRepository.put(getCredentials(user.getUsername(), user.getPassword()), user);
    }


    private static String getCredentials(String username, String password) {
        return username + ":" + password;
    }
}