package com.springwork.homework25;

import com.springwork.homework25.exception.CheckException;
import com.springwork.homework25.exception.EqualsCheckException;
import com.springwork.homework25.exception.SpellingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/enterSystem")
public class EnterController {
    private final EnterSystemInterface enterSystemInterface;

    @Autowired
    public EnterController(EnterSystemInterface enterSystemInterface) {
        this.enterSystemInterface = enterSystemInterface;
    }

//    edit login
    @PostMapping("/login")
    public String login(@RequestParam String login) {
        final String logSystem;
        try {
            logSystem = enterSystemInterface.login(login);
        } catch (CheckException e) {
            return "WrongLoginException";
        } catch (SpellingException e) {
            return "WrongSpelling";
        }
        return logSystem;
    }

//    edit password
    @PostMapping("/password")
    public String password(@RequestParam String password, @RequestParam String confirmPassword) {
        final String passSystem;
        try {
            passSystem = enterSystemInterface.password(password, confirmPassword);
        } catch (CheckException e) {
            return "WrongPasswordException";
        } catch (EqualsCheckException e) {
            return "They are not equal";
        } catch (SpellingException e) {
            return "WrongSpelling";
        }
        return passSystem;
    }
}




