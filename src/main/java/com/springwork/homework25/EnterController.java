package com.springwork.homework25;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

        return log;
    }

    @GetMapping("/password")
    public String password(@RequestParam String pass) {
        return pass;
    }

    @GetMapping("/confirmPassword")
    public String confirmPassword(@RequestParam String conf) {
        return conf;
    }
        }


