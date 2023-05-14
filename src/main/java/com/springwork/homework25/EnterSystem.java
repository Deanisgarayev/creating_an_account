package com.springwork.homework25;

import org.springframework.stereotype.Service;

@Service
public class EnterSystem implements EnterSystemInterface {
    @Override
    public String login(String log)  {
        if (log.length() < 20) {
            CheckException wrongAmountOfLogin = new CheckException ("WrongLoginException");
            return "WrongLoginException";
            }
        return log;
    }

    @Override
    public String password(String pass) {
        if (pass.length() > 20) {
            CheckException WrongAmountOfPassword = new CheckException ("WrongPasswordException");
        }
        return pass;
    }

    @Override
    public String confirmPassword(String conf) {
        if (conf != pass) {
            CheckException unequalPasswords = new CheckException ("WrongConfirmPasswordException");
        }
        return conf;
    }
}
