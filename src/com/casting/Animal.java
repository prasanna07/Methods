package com.casting;

public class Animal { 
 
    public void callme()
    {
        System.out.println("In callme of Animal");
    }
}


class Dog extends Animal 
{ 
    public void callme()
    {
        System.out.println("In callme of Dog");
    }

    public void callme2()
    {
        System.out.println("In callme2 of Dog");
    }

}
