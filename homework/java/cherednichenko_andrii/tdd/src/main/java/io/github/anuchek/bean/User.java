package io.github.anuchek.bean;

public class User {
    private String login;
    private String password;
    private int loginAttempts;
    private boolean blockesd;

    public User(String login, String password, int loginAttempts, boolean blockesd) {
        this.login = login;
        this.password = password;
        this.loginAttempts = loginAttempts;
        this.blockesd = blockesd;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", loginAttempts=" + loginAttempts +
                ", blockesd=" + blockesd +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (loginAttempts != user.loginAttempts) return false;
        if (blockesd != user.blockesd) return false;
        if (login != null ? !login.equals(user.login) : user.login != null) return false;
        return password != null ? password.equals(user.password) : user.password == null;
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + loginAttempts;
        result = 31 * result + (blockesd ? 1 : 0);
        return result;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLoginAttempts() {
        return loginAttempts;
    }

    public void setLoginAttempts(int loginAttempts) {
        this.loginAttempts = loginAttempts;
    }

    public boolean isBlockesd() {
        return blockesd;
    }

    public void setBlockesd(boolean blockesd) {
        this.blockesd = blockesd;
    }
}
