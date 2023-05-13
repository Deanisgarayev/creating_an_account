package com.springwork.homework25;

public interface EnterSystemInterface {
    String login(String log) throws CheckException;

    String password(String pass);

    String confirmPassword(String conf);
}
