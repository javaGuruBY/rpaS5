package by.jrr.service;

import by.jrr.bean.User;

public class LoginService {
    public boolean checkUserService(User user, String userInput) {
        return user.getPassword().equals(userInput);
    }

    public void reduceLoginAttempts(User user) {
        user.setLoginAttempts(user.getLoginAttempts() - 1) ;
    }

    public boolean login(User user, String userInput) {
        reduceLoginAttempts(user);
        return checkUserService(user, userInput);
    }
}
