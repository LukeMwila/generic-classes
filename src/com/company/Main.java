package com.company;

class Login<T>{
    private T name;
    private T password;

    public Login(T name, T password){
        this.name = name;
        this.password = password;
    }

}
public class Main {

    public static void main(String[] args) {


        Login<String> login = new Login<>("Paul", "password");
        System.out.println(login.getName());
    }
}
