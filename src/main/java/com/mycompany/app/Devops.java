package com.mycompany.app;

/**
 * Hello world!
 */
public class Devops
{

    private final String message = "Hello World!";
    private final String message2 = "Hello World!";

    public Devops() {}

    public static void main(String[] args) {
        System.out.println(new Devops().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
