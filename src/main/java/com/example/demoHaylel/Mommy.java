package com.example.demoHaylel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// name1,name, fatima, name5, age, status, getAge, muslim, fatima



public class Mommy {

    public String name1;
    public List <String> name = new ArrayList <String>();
//private String name;
    public int fatima;
    public Object name5 = new Object();
    public int age;
    public String status;

    public Mommy() {

      }
     public Mommy(String name1, int age, String status ){

     this.name1 = name1;
     this.age = age;
     this.status = status;

         }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public int getAge(int  calculateAge) {
    System.out.println("How you calculate age? ");
        int homeAge = 20;
        calculateAge = homeAge + 14;
       System.out.println(calculateAge);
        return calculateAge;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static List<String> muslim(){
         List<String> name = new ArrayList<String>();
             name.add("merima");
             name.add(22,"fatima");
             name.add(33, "kidjah");

           return name;


     }
     public int fatima(int age) {

         Scanner input = new Scanner(System.in);
         // String oldWoman = new Object();
         System.out.println("Enter fatima`s age: ");
         age = input.nextInt();
      String cool = null;

            if (age >= 99) {
          System.out.println("She good to count as a mommy ");

         }
          else{
              System.out.println(cool);
         }

        return fatima;
     }


}
