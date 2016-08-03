package com.Super;

public class Bike extends Vehicle{  
    int speed;  
    Bike(int speed){  
      this.speed=speed;  
      System.out.println(speed);  
    }  
    public static void main(String args[]){  
     Bike b=new Bike(110);  
    }
}
  




