package org.example;

public class WrongRandomPasswordGenerator implements PasswordGenerator{
    @Override
    public String generatePassword() {
        return "aa";
    }
}
