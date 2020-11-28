package com.company;

public class Author {
    String name;
    String email;
    char gender;
    Author(String name,String email,char gender)
    {
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    String getName()
    {
        return name;
    }
    char getGender()
    {
        return gender;
    }
    String getEmail()
    {
        return email;
    }
    void setEmail(String email)
    {
        this.email=email;
    }
    public String toString()
    {
        return "Author  "+name+"is "+gender+"Has email name is"+email;
    }
}
