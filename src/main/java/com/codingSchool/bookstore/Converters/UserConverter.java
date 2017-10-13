package com.codingSchool.bookstore.Converters;

import com.codingSchool.bookstore.Domain.User;
import com.codingSchool.bookstore.Model.RegistrationForm;


public class UserConverter {

    public static User buildUserObject(RegistrationForm registrationForm) {
        User user = new User();
        user.setAfm(registrationForm.getAfm());
        user.setLastname(registrationForm.getLastname());
        user.setFirstname(registrationForm.getFirstname());
        user.setAddress(registrationForm.getAddress());
        user.setEmail(registrationForm.getEmail());
        user.setPassword(registrationForm.getPassword());
        user.getUserType(registrationForm.getUserType());

        return user;
    }
}
