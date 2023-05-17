package com.springwork.homework25;

import org.springframework.stereotype.Service;

@Service
public  class EnterSystem implements EnterSystemInterface {
    @Override
    public String login(String login) {
        if (login.matches("^[a-zA-Z0-9_]*$")) {
        } else {
            throw new SpellingException("WrongSpelling");
        }
        if (login.length() > 20) {
            throw new CheckException("WrongLoginException");
        }
        return "done";
    }

    @Override
    public String password(String password, String confirmPassword) {
        if (password.matches("^[a-zA-Z0-9_]*$")) {
        } else {
            throw new SpellingException("WrongSpelling");
        }
        if (password.length() >= 20) {
            throw new CheckException("WrongPasswordException");
        }
        if (password.equals(confirmPassword)) {

        } else {
            throw new EqualsCheckException("They are not equal");
        }
        return "done";
    }
}
