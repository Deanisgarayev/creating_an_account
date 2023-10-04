package com.springwork.homework25;

import com.springwork.homework25.exception.CheckException;
import com.springwork.homework25.exception.EqualsCheckException;
import com.springwork.homework25.exception.SpellingException;
import org.springframework.stereotype.Service;

@Service
public class EnterSystem implements EnterSystemInterface {

//    edits login without punctuation marks  and no more than twenty characters
    @Override
    public String login(String login) {
        if (!login.matches("^[a-zA-Z0-9_]*$")) {
            throw new SpellingException("WrongSpelling");
        }
        if (login.length() > 20) {
            throw new CheckException("WrongLoginException");
        }
        return "done";
    }

//    edits password without punctuation marks and no more than twenty characters
    @Override
    public String password(String password, String confirmPassword) {
        if (!password.matches("^[a-zA-Z0-9_]*$")) {
            throw new SpellingException("WrongSpelling");
        }
        if (password.length() >= 20) {
            throw new CheckException("WrongPasswordException");
        }
        if (!password.equals(confirmPassword)) {
            throw new EqualsCheckException("They are not equal");
        }
        return "done";
    }
}
