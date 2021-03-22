package by.jrr.start.services;

import by.jrr.start.User;

public class UserLoginService {

    boolean login(User user, String password){
        if(user.getPassword().equals(password)){
            if((user.getTryToLogin() < 3) && (user.getIsBlocked()) == false){
                user.refreshTryToLogin();
            }
            return true;
        }else{
            if(user.getIsBlocked() == false){
                user.cutTryToLogin();
            }
            else if (user.getTryToLogin() == 0){
                user.blockUser();
            }
            return false;
        }
    }
}
