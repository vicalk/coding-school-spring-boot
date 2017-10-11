package com.codingSchool.bookstore.Converters;

import com.codingSchool.bookstore.Domain.User;
import com.codingSchool.bookstore.Model.RegistrationForm;


public class UserConverter {

    public static User buildUserObject(RegistrationForm registrationForm) {
        User user = new User();
        user.setUsername(registrationForm.getUsername());
        user.setPassword(registrationForm.getPassword());
        user.setEmail(registrationForm.getEmail());
        user.setFirstname(registrationForm.getFirstname());
        user.setLastname(registrationForm.getLastname());
        return user;
    }
}
