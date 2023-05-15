package com.springwork.homework25;

import org.springframework.stereotype.Service;

@Service
public class EnterSystem extends IDSystem {
    @Override
    public String enterSystem(IDSystem.getlogin(), IDSystem password, IDSystem confirmPssword) {
        if (getLogin().length() >= 20) {
            throw new CheckException("WrongLoginException");
        }
        return login;
        if (password.length() > 20) {
            throw new CheckException("WrongPasswordException");
        }
        return pass;
        if (conf.equals(pass)) {
            return"done";
        } else {
            throw new CheckException("WrongPasswordsException");
        }
        return conf;
    }

}

