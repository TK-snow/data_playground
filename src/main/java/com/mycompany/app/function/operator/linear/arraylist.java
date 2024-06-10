package com.mycompany.app.function.operator.linear;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import com.mycompany.app.function.operator.operator;

public class arraylist extends operator {
    public static void arraylist_operation() throws IOException{

        ArrayList<Integer> Number = new ArrayList<Integer>();
        Number.add(1);
        Number.add(2);
        Number.add(3);
        Number.add(4);
        Number.add(5);

        int choice = 0;
        
        System.out.println(" ");
        
        while (true) {
            System.out.println("ArrayList Size : " + Number.size());
            System.out.print("ArrayList Member : ");
            for(int i : Number ){
                System.out.print(i + " ");
            }
            System.out.println(" ");
            System.out.println("Choose how to manupilate this array!");
            System.out.println("1. Change Value");
            System.out.println("2. Add Value");
            System.out.println("3. Insert Value");
            System.out.println("4. Delete Value");
            System.out.println("5. Sort");
            System.out.println("6. Exit");
            System.out.println("------------------------------------------");
            System.out.println("Please enter your choice in number above!");
            choice = input.nextInt();

            if(choice == 1){
                int pointer;
                int new_value;

                System.out.print("Enter position you want to change : ");
                pointer = input.nextInt();
                if(pointer > Number.size()){
                    System.out.print("Error! This arraylist only have size at" + Number.size() +".");
                    wait_and_enter();
                }
                else{
                    System.out.print("Enter number that you want to change into : ");
                    new_value = input.nextInt();
                    change_value(pointer, Number, new_value);
                }
            }
            else if (choice == 2) {
                int new_value;

                System.out.print("Enter number that you want to add in arraylist : ");
                new_value = input.nextInt();
                add_value(Number, new_value);

            }
            else if(choice == 3){
                int pointer;
                int new_value;

                System.out.print("Enter position you want to insert : ");
                pointer = input.nextInt();
                if(pointer > Number.size()){
                    System.out.print("Error! This arraylist only have size at" + Number.size() +"and you can't insert after size.");
                    wait_and_enter();
                }
                else{
                    System.out.print("Enter number that you want to insert : ");
                    new_value = input.nextInt();
                    insert_value(Number, new_value, pointer);
                }
            }
            else if (choice == 4) {
                int pointer;
                System.out.print("Enter number that you want to delete in arraylist : ");
                pointer = input.nextInt();
                if(pointer > Number.size()){
                    System.out.print("Error! This arraylist only have size at" + Number.size() +".");
                    wait_and_enter();
                }
                else{
                    delete_value(Number, pointer);
                }

            }
            else if(choice == 5){
                sort(Number);
                wait_and_enter();
            }
            else if(choice == 6){
                break;
            }

        }

    }

    private static void change_value(int pointer, ArrayList<Integer> array_list, int new_value){
        ArrayList<Integer> Number = new ArrayList<Integer>();
        Number = array_list ;
        pointer--;

        Number.set(pointer,new_value);

        System.out.print("Change succesful!");
        System.out.print("Result : ");
        for(int i : Number ){
            System.out.print(i + " ");
        }
        wait_and_enter();
    }

    private static void add_value(ArrayList<Integer> array_list, int new_value){
        ArrayList<Integer> Number = new ArrayList<Integer>();
        Number = array_list ;

        Number.add(new_value);

        System.out.print("Add succesful!");
        System.out.print("Result : ");
        for(int i : Number ){
            System.out.print(i + " ");
        }
        wait_and_enter();
    }

    private static void insert_value(ArrayList<Integer> array_list, int new_value,int pointer){
        ArrayList<Integer> Number = new ArrayList<Integer>();
        Number = array_list ;

        Number.add(new_value,pointer);

        System.out.print("Add succesful!");
        System.out.print("Result : ");
        for(int i : Number ){
            System.out.print(i + " ");
        }
        wait_and_enter();
    }

    private static void delete_value(ArrayList<Integer> array_list, int pointer){
        ArrayList<Integer> Number = new ArrayList<Integer>();
        Number = array_list ;
        pointer--;

        Number.remove(pointer);

        System.out.print("Add succesful!");
        System.out.print("Result : ");
        for(int i : Number ){
            System.out.print(i + " ");
        }
        wait_and_enter();

    }

    private static void sort(ArrayList<Integer> array_list){
        ArrayList<Integer> Number = new ArrayList<Integer>();
        Number = array_list ;

        Collections.sort(Number);
        System.out.println("Sort success full!");
        System.out.print("Result : ");
        for(int i : Number ){
            System.out.print(i + " ");
        }
        wait_and_enter();
    }
}
