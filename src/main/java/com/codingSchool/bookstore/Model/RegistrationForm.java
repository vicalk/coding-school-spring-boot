package com.codingSchool.bookstore.Model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class RegistrationForm {

    private static final String AFM_PATTERN = "^[0-9]*$";

    private static final String PASSWORD_PATTERN = "^[a-zA-Z0-9@#$%^&]*$";

    private static final String CHARACTERS_PATTERN = "^[a-zA-Z ]*$";

    private static final String EMAIL_PATTERN = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{1,63}$";

    private static final int PASSWORD_MINSIZE = 6;

    private static final int AFM_SIZE = 9;


    @Pattern(regexp = AFM_PATTERN, message = "{register.afm.invalid}")
    @Size(min = AFM_SIZE, max = AFM_SIZE, message = "{register.afm.size}")
    private int afm;

    @Pattern(regexp = CHARACTERS_PATTERN, message = "{register.lastname.invalid}")
    private String lastname;

    @Pattern(regexp = CHARACTERS_PATTERN, message = "{register.firstname.invalid}")
    private String firstname;

    @Pattern(regexp = CHARACTERS_PATTERN, message = "{register.address.invalid}")
    private String address;

    @NotNull(message = "{register.email.null}")
    @Pattern(regexp = EMAIL_PATTERN, message = "{register.email.invalid}")
    private String email;

    @NotNull(message = "{register.password.null}")
    @Pattern(regexp = PASSWORD_PATTERN, message = "{register.password.invalid}")
    @Size(min = PASSWORD_MINSIZE, message = "{register.password.size}")
    private String password;

    public int getAfm() {
        return afm;
    }

    public void setAfm(int afm) {
        this.afm = afm;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
