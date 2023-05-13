package com.springwork.homework25;

import org.springframework.stereotype.Service;

@Service
public class EnterSystem implements EnterSystemInterface {
    @Override
    public String login(String log) throws CheckException {
        CheckException checkException = new CheckException("WrongLoginException");
        throw checkException;
        return log;
    }

    @Override
    public String password(String pass) {
        return pass;
    }

    @Override
    public String confirmPassword(String conf) {
        return conf;
    }
}
