package com.casting;

public class UseAnimals { public static void main (String [] args) 
{
    Dog d = new Dog();      
    Animal a = (Animal)d;
    d.callme();
    a.callme();
    ((Dog) a).callme2();
}
}


