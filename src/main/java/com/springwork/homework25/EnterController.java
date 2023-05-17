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
    public String login(@RequestParam String login) {
        final String logSystem;
        try {
            logSystem = enterSystemInterface.login(login);
        } catch (CheckException e) {
            return "WrongLoginException";
        }
        return logSystem;
    }

    @GetMapping("/password")
    public String password(@RequestParam String password) {
        final String passSystem;
        try {
            passSystem = enterSystemInterface.password(password);
        } catch (CheckException e) {
            return "WrongPasswordException";
        }
        return passSystem;
    }

//    @GetMapping("/confirmPassword")
//    public String confirmPassword(@RequestParam String conf, @RequestParam String pass) {
//        final String confSystem;
//        try {
//            confSystem = enterSystemInterface.confirmPassword(conf);
//        } catch (CheckException e) {
//
//            return "WrongPasswordException";
//        }
//        return confSystem;
//        }
    }



