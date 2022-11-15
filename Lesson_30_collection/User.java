package Lessons.Lesson_30_collection;

public class User {
    String userName;
    String login;
    String pass;

    public User(String userName, String login, String pass) {
        this.userName = userName;
        this.login = login;
        this.pass = pass;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
