package by.jrr.start.services;

import by.jrr.start.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserLoginServiceTest {


    UserLoginService userLoginService;

    @Before
    public void setService() {
        this.userLoginService = new UserLoginService();
    }

    @Test
    public void loginTrue() {
        User user = new User("LOGIN", "PASSWORD");
        String input = "PASSWORD";

        boolean actualResult = userLoginService.login(user,input);

        Assert.assertTrue(actualResult);

    }

    @Test
    public void loginFalse() {
        User user = new User("LOGIN", "PASSWORD");
        String input = "incorrectPASSWORD";

        boolean actualResult = userLoginService.login(user,input);

        Assert.assertFalse(actualResult);

    }

    @Test
    public void blockUser() {
        User user = new User("LOGIN", "PASSWORD");
        String input = "incorrectPASSWORD";

        userLoginService.login(user,input);
        userLoginService.login(user,input);
        userLoginService.login(user,input);
        userLoginService.login(user,input);

        Assert.assertTrue(user.getIsBlocked());
    }
}