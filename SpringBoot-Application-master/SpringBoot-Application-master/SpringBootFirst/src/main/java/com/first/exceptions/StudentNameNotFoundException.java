package com.first.exceptions;

public class StudentNameNotFoundException extends Exception{
    public StudentNameNotFoundException(String mesg){
        super(mesg);
    }
}
