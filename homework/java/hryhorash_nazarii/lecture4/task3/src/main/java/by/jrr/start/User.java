package by.jrr.start;

public class User {
    private String login;
    private String password;
    private boolean isBlocked;
    private int tryToLogin;

    public User(String login, String password){
        this.login = login;
        this.password = password;
        this.isBlocked = false;
        this.tryToLogin = 3;
    }

    public void refreshTryToLogin(){
        this.tryToLogin = 3;
    }

    public void cutTryToLogin(){
        this.tryToLogin -= 1;
    }

    public void blockUser() {
        this.isBlocked = true;
    }

    public String getPassword(){
        return this.password;
    }

    public int getTryToLogin(){
        return this.tryToLogin;
    }

    public boolean getIsBlocked() {
        return this.isBlocked;
    }
}
