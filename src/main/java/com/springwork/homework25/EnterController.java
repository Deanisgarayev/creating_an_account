package com.springwork.homework25;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

@RestController
@RequestMapping("/enterSystem")
public class EnterController {
    private final EnterSystemInterface enterSystemInterface;

    @Autowired
    public EnterController(EnterSystemInterface enterSystemInterface) {
        this.enterSystemInterface = enterSystemInterface;
    }

    @GetMapping("/login")
    public String login(@RequestParam String log) {
        final String logSystem;
        try {
            logSystem = EnterSystemInterface.login(log);
        } catch (WrongAmountOfLogin e) {
            System.out.println("WrongLoginException");
        }
       return logSystem;
    }

    @GetMapping("/password")
    public String password(@RequestParam String pass) {
        final String passSystem;
        try {
            passSystem = EnterSystemInterface.password(pass);
        } catch (WrongAmountOfPassword e) {
            System.out.println("WrongLoginException");
        }
        return passSystem;
    }

    @GetMapping("/confirmPassword")
    public String confirmPassword(@RequestParam String conf) {
        final String confSystem;
        try {
            if (conf.equals(pass)) {
                System.out.println("done");
            } else {
                throw new CheckException(unequalPasswords);
            }
            confirmPassword()= EnterSystemInterface.confirmpassword(conf);
        } catch (unequalPasswords e) {
            System.out.println("WrongLoginException");
        }
        return confSystem;
    }
        }


