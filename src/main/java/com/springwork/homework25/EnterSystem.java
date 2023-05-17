package com.springwork.homework25;

import org.springframework.stereotype.Service;

@Service
public  class EnterSystem implements EnterSystemInterface {
    @Override
    public String login(String login) {
        if (login.length() > 20) {
            throw new CheckException("WrongLoginException");
        }
        return "done";
    }

    @Override
    public String password(String password) {
        if (password.length() >= 20) {
            throw new CheckException("WrongPasswordException");
        }
        return "done";
    }

//    @Override
//    public String confirmPassword(String conf, String pass) {
//            if (conf.equals(pass)) {
//                return"done";
//            } else {
//                throw new CheckException("WrongPasswordsException");
//            }
//            return conf;
//        }
//    }
}
