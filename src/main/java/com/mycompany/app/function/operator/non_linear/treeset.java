package com.mycompany.app.function.operator.non_linear;

import java.util.TreeSet;

import com.mycompany.app.function.operator.operator;

public class treeset extends operator {
    public static void treeset_operation(){
        TreeSet<Integer> number = new TreeSet<>();

        number.add(10);
        number.add(25);
        number.add(5);
        number.add(4);
        number.add(40);



        while (true) {
            int choice;
            System.out.println("Number :" + number);
            System.out.println("Choose how to manupilate this Tree Set!");
            System.out.println("1. Add Number");
            System.out.println("2. Remove Number");
            System.out.println("3. Check Number");
            System.out.println("4. Check highest Number");
            System.out.println("5. Check lowest Number");
            System.out.println("6. Exit");
            System.out.println("------------------------------------------");
            System.out.println("Please enter your choice in number above!");
            choice = input.nextInt();
            input.nextLine();

            if(choice == 1){
                int new_number;
                
                System.out.print("Please enter new number : ");
                new_number = input.nextInt();
                input.nextLine();
                
                add_number(number, new_number);
            }
            else if (choice == 2) {
                int new_number;
                
                System.out.print("Please enter number you want to delete : ");
                new_number = input.nextInt();
                input.nextLine();
                
                remove_number(number, new_number);
            }
            else if(choice == 3){
                int new_number;
                
                System.out.print("Please enter number you want to check : ");
                new_number = input.nextInt();
                input.nextLine();
                
                check_number(number, new_number);
            }
            else if(choice == 4){
                highest(number);
            }
            else if(choice == 5){
                lowest(number);

            }
            else if(choice == 6){
                break;
            }
        }

    }

    private static void add_number(TreeSet<Integer> tree, int value){
        TreeSet<Integer> number = new TreeSet<>();
        number = tree;

        if(number.contains(value)){
            System.out.println("This set already contain this number!");
        }
        else{
            number.add(value);
            System.out.println("Add number successful!!");
            System.out.println("Result : " + number);
        }

        wait_and_enter();
    }

    private static void remove_number(TreeSet<Integer> tree, int value){
        TreeSet<Integer> number = new TreeSet<>();
        number = tree;

        if(!number.contains(value)){
            System.out.println("This set does not contain this number!");
        }
        else{
            number.remove(value);
            System.out.println("Remove number successful!!");
            System.out.println("Result : " + number);
        }

        wait_and_enter();
    }

    private static void check_number(TreeSet<Integer> tree, int value){
        TreeSet<Integer> number = new TreeSet<>();
        number = tree;

        if(number.contains(value)){
            System.out.println("This set already contain this number!");
        }
        else{
            System.out.println("This set does not contain this number!");
        }

        wait_and_enter();
    }

    private static void highest(TreeSet<Integer> tree){
        TreeSet<Integer> number = new TreeSet<>();
        number = tree;

        System.out.println("The highest number of this set is : " + number.getLast());

        wait_and_enter();
    }

    private static void lowest(TreeSet<Integer> tree){
        TreeSet<Integer> number = new TreeSet<>();
        number = tree;

        System.out.println("The lowest number of this set is : " + number.getFirst());

        wait_and_enter();
    }
    
}
