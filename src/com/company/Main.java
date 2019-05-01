package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        String name = "Alex";
        int age = 48;
        int temp = 25;

        if(age > 20 && age < 40) {
            if (temp > 30 || temp < 20) {
                System.out.println("Не выходит гулять");
            } else {
                System.out.println("Идет к другу");
            }
        }
        if(age < 20) {
            if (temp > 0 || temp < 28) {
                System.out.println("Не выходит гулять");
            } else {
                System.out.println("Идет к другу");
            }
        }
        if(age > 45) {
            if (temp > -10 || temp < 25) {
                System.out.println("Не выходит гулять");
            } else {
                System.out.println("Идет к другу");
            }
        }


//           if (age == 20 )
//           { System.out.println  ("Alex doesnt go out");}
//           else  { System.out.println ("Alex goes to friends");}


    }
}
