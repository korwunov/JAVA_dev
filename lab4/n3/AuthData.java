package ru.mirea.lab4.n3;

public enum AuthData {
    User1("abcd"),
    User2("qwerty"),
    User3("java_dev"),
    User4("jdkjre"),
    User5("12345678");
    private String password;

    AuthData(String pass) {
        this.password = pass;
    }

    public String getPassword(){
        return this.password;
    }
}
