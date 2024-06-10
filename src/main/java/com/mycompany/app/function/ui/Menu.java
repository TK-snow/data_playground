package com.mycompany.app.function.ui;

import java.util.Scanner;

public class Menu {

    
    public static String status = "start";
    public static Scanner input = new Scanner(System.in);
    

    public static int Start(){
        int choice = 0 ;
        
        System.out.println("------------------------------------------");
        System.out.println("Welcome to Data Playground!");
        System.out.println("In this program you will allow to study and play with various data structure!");
        System.out.println("please select data structure you want to start study!");
        System.out.println("------------------------------------------");
        System.out.println("1. Start");
        System.out.println("2. Exit");
        System.out.println("------------------------------------------");
        System.out.println("Please enter your choice in number above!");

        choice = input.nextInt();

        if(choice == 2){
            input.close();
        }
        else{
            status = "type";
        }


        return choice;
    }

    public static int data_choose(){
        int choice = 0 ;

        System.out.println("------------------------------------------");
        System.out.println("Type of Data Structure!!");
        System.out.println("In this we will talking about 'Non-primitive Data Structures' ");
        System.out.println("Which it can be categorized into two type of Data Structures ");
        System.out.println("Please choose data structure type you want!");
        System.out.println("------------------------------------------");
        System.out.println("1. Linear Data Structor");
        System.out.println("2. Non Linear Data Structure");
        System.out.println("3. Exit");
        System.out.println("------------------------------------------");
        System.out.println("Please enter your choice in number above!");

        choice = input.nextInt();

        return choice ;

    }
}
