package com.mycompany.app.function.operator.linear;

import java.util.Collections;
import java.util.LinkedList;

import com.mycompany.app.function.operator.operator;

public class linkedlist extends operator {

    public static void linkedlist_operation(){
        LinkedList<Integer> Number = new LinkedList<Integer>();

        Number.add(10);
        Number.add(12);
        Number.add(15);
        Number.add(17);
        Number.add(20);
        Number.add(2);

        Collections.sort(Number);

        int choice = 0;
        
        System.out.println(" ");

        
        while (true) {

            System.out.println("LinkedList Size : " + Number.size());
            System.out.print("LinkedList Member : ");
            for(int i : Number ){
                System.out.print(i + " ");
            }
            System.out.println(" ");
            System.out.println("Choose how to manupilate this LinkedList!");
            System.out.println("1. Change Value");
            System.out.println("2. Add Value");
            System.out.println("3. Insert Value");
            System.out.println("4. Add Value to Start");
            System.out.println("5. Delete Value");
            System.out.println("6. Delete First Value");
            System.out.println("7. Delete Last Value");
            System.out.println("8. Sort");
            System.out.println("9. Exit");
            System.out.println("------------------------------------------");
            System.out.println("Please enter your choice in number above!");
            choice = input.nextInt();

            if(choice == 1){
                int pointer;
                int new_value;

                System.out.print("Enter position you want to change : ");
                pointer = input.nextInt();
                if(pointer > Number.size()){
                    System.out.print("Error! This LinkedList only have size at" + Number.size() +".");
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

                System.out.print("Enter number that you want to add in LinkedList : ");
                new_value = input.nextInt();
                add_value(Number, new_value);

            }
            else if(choice == 3){
                int pointer;
                int new_value;

                System.out.print("Enter position you want to insert : ");
                pointer = input.nextInt();
                if(pointer > Number.size()){
                    System.out.print("Error! This LinkedList only have size at" + Number.size() +"and you can't insert after size.");
                    wait_and_enter();
                }
                else{
                    System.out.print("Enter number that you want to insert : ");
                    new_value = input.nextInt();
                    insert_value(pointer,Number,new_value);
                }
            }
            else if(choice == 4){
                int new_value;

                System.out.print("Enter number that you want to add in LinkedList : ");
                new_value = input.nextInt();
                add_first_value(Number, new_value);
            }
            else if (choice == 5) {
                int pointer;
                System.out.print("Enter number that you want to delete in LinkedList  : ");
                pointer = input.nextInt();
                if(pointer > Number.size()){
                    System.out.print("Error! This LinkedList  only have size at" + Number.size() +".");
                    wait_and_enter();
                }
                else{
                    remove_value(pointer,Number);
                }

            }
            else if(choice == 6){
                remove_first_value(Number);
            }
            else if(choice == 7){
                remove_last_value(Number);
            }
            else if(choice == 8){
                sort(Number);
                wait_and_enter();
            }
            else if(choice == 9){
                break;
            }

        }
    }

    private static void change_value(int pointer, LinkedList<Integer> list, int new_value){
        LinkedList<Integer> Number = new LinkedList<Integer>();
        Number = list ;
        pointer--;

        Number.set(pointer,new_value);

        System.out.print("Change succesful!");
        System.out.print("Result : ");
        for(int i : Number ){
            System.out.print(i + " ");
        }
        wait_and_enter();
    }

    private static void add_value(LinkedList<Integer> list, int new_value){
        LinkedList<Integer> Number = new LinkedList<Integer>();
        Number = list ;

        Number.addLast(new_value);

        System.out.print("Change succesful!");
        System.out.print("Result : ");
        for(int i : Number ){
            System.out.print(i + " ");
        }
        wait_and_enter();
    }

    private static void insert_value(int pointer, LinkedList<Integer> list, int new_value){
        LinkedList<Integer> Number = new LinkedList<Integer>();
        Number = list ;
        pointer--;

        Number.add(pointer,new_value);
        

        System.out.print("Change succesful!");
        System.out.print("Result : ");
        for(int i : Number ){
            System.out.print(i + " ");
        }
        wait_and_enter();


    }

    private static void add_first_value(LinkedList<Integer> list, int new_value){
        LinkedList<Integer> Number = new LinkedList<Integer>();
        Number = list ;

        Number.addFirst(new_value);

        System.out.print("Change succesful!");
        System.out.print("Result : ");
        for(int i : Number ){
            System.out.print(i + " ");
        }
        wait_and_enter();
    }

    private static void remove_value(int pointer, LinkedList<Integer> list){
        LinkedList<Integer> Number = new LinkedList<Integer>();
        Number = list ;
        pointer--;

        Number.remove(pointer);

        System.out.print("Change succesful!");
        System.out.print("Result : ");
        for(int i : Number ){
            System.out.print(i + " ");
        }
        wait_and_enter();
    }

    private static void remove_first_value(LinkedList<Integer> list){
        LinkedList<Integer> Number = new LinkedList<Integer>();
        Number = list ;

        Number.removeFirst();

        System.out.print("Change succesful!");
        System.out.print("Result : ");
        for(int i : Number ){
            System.out.print(i + " ");
        }
        wait_and_enter();
    }

    private static void remove_last_value(LinkedList<Integer> list){
        LinkedList<Integer> Number = new LinkedList<Integer>();
        Number = list ;

        Number.removeLast();

        System.out.print("Change succesful!");
        System.out.print("Result : ");
        for(int i : Number ){
            System.out.print(i + " ");
        }
        wait_and_enter();
    }

    private static void sort(LinkedList<Integer> list){
        LinkedList<Integer> Number = new LinkedList<Integer>();
        Number = list ;

        Collections.sort(Number);
        System.out.println("Sort success full!");
        System.out.print("Result : ");
        for(int i : Number ){
            System.out.print(i + " ");
        }
        wait_and_enter();
    }
}
