package by.jrr.service;

import by.jrr.bean.User;

public class LoginService {
    public boolean checkUserService(User user, String userInput) {
        return user.getPassword().equals(userInput);
    }
}
