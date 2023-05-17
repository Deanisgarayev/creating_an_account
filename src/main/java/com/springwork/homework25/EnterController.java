package com.springwork.homework25;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

@RestController
@RequestMapping("/totalSystem")
public class EnterController {
    private final EnterSystemInterface enterSystemInterface;

    @Autowired
    public EnterController(EnterSystemInterface enterSystemInterface) {
        this.enterSystemInterface = enterSystemInterface;
    }

    @GetMapping("/enterSysem")
    public void enterSystem(@RequestParam String log, @RequestParam String pass, @RequestParam String conf) {
        try {
            enterSystemInterface.enterSystem(log, pass, conf);
        } catch (CheckException e) {
            System.out.println("WrongLoginException");
        }
        System.out.println(log + " " + pass + " " + conf);

    }
}



