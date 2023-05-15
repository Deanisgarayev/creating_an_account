package com.springwork.homework25;

import org.springframework.stereotype.Service;

@Service
public abstract class EnterSystem implements EnterSystemInterface {
    @Override
    public String login(String log) {
        if (log.length() >= 20) {
            throw new CheckException("WrongLoginException");
        }
        return log;
    }

    @Override
    public String password(String pass) {
        if (pass.length() > 20) {
            throw new CheckException("WrongPasswordException");
        }
        return pass;
    }

    @Override
    public String confirmPassword(String conf, String pass) {
            if (conf.equals(pass)) {
                return"done";
            } else {
                throw new CheckException("WrongPasswordsException");
            }
            return conf;
        }
    }

