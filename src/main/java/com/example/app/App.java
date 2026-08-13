package com.example.app;

public class App {
    public static void main(String[] args) {
        System.out.println(new App().greet());
    }

    public String greet() {
        return "Hello from your Maven-built Java project!";
    }
}
