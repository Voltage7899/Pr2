package com.company;

import java.awt.print.Book;

public class Main {
public static void main(String [] args)
{
    Author author=new Author("King","king@mail.com",'m');
    author.setEmail("king155@,ail.com");
    System.out.println(author.toString());
}
}
