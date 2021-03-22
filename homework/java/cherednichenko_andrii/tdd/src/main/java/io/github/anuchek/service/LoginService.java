package io.github.anuchek.service;

import io.github.anuchek.bean.User;

public class LoginService {

    public boolean checkUserPassword(User user, String userInput) {
        return user.getPassword().equals(userInput);
    }

    public void reduceLoginAttempts(User user) {
        user.setLoginAttempts(user.getLoginAttempts() - 1);
    }

    public boolean login(User user, String userInput) {
        reduceLoginAttempts(user);
        return checkUserPassword(user, userInput);
    }
}
