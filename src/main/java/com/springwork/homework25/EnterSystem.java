package com.springwork.homework25;

import org.springframework.stereotype.Service;

@Service
public class EnterSystem implements EnterSystemInterface {
    @Override
    public void enterSystem (String log, String pass, String conf)  {
        if (log.length() >= 20) {
            throw new CheckException ("WrongLoginException");
            }
        System.out.println(log);
        if (pass.length() > 20) {
            throw new CheckException ("WrongPasswordException");
        }
        System.out.println(pass);
        if (conf.equals(pass)) {
            System.out.println("done");
        } else {
            new CheckException ("WrongConfirmPasswordException");
        }
        System.out.println(conf);
    }
}

