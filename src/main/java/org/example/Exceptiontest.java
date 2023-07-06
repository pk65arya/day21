package org.example;

public class Exceptiontest extends Exception {
    private String message="Please check your name.";
    public Exceptiontest(String message){
        super(message);
       // this.message=message;
    }
}
