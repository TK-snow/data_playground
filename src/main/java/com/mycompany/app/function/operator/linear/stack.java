package com.mycompany.app.function.operator.linear;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

import com.mycompany.app.function.operator.operator;

public class stack extends operator {

    public static void stack_operation() {

        ArrayList<Integer> item = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();

        item.add(12);
        item.add(18);
        item.add(25);
        item.add(19);
        item.add(22);

        Collections.sort(item);

        for(Integer i : item){
            stack.push(i);
        }

        while (true) {
            int choice;

            if(stack.empty()){
                System.out.println("This stack is empty(no value in stack).");
            }
            else{
                System.out.println("This stack is not empty!");
                System.out.println("Value that can be use(Last) : " + stack.peek());
            }
            System.out.println(" ");
            System.out.println("Because it non dynamic array, the way to manupilate is straight foward!");
            System.out.println("Choose how to manupilate this stack!");
            System.out.println("1. Add Value");
            System.out.println("2. Use Value");
            System.out.println("3. Sort Value");
            System.out.println("4. Exit");
            System.out.println("------------------------------------------");
            System.out.println("Please enter your choice in number above!");
            choice = input.nextInt();

            if(choice == 1){
                int new_value;

                System.out.print("Enter number that you want to add in this stack : ");
                new_value = input.nextInt();
                add_stack(new_value, stack);
            }
            else if(choice == 2){
                if(stack.empty()){
                    System.out.println("This stack can't be use because it empty!!");
                }
                else{
                    use_stack(stack);
                }

            }
            else if(choice == 3){
                if(stack.empty()){
                    System.out.println("This stack can't be sort because it empty!!");
                }
                else{
                    sort_stack(stack);
                }
            }
            else if(choice == 4){
                break;
            }

        }


        
    }

    private static void add_stack(int value,Stack<Integer> stack){
        Stack<Integer> Number = new Stack<Integer>();

        Number = stack;
        Number.push(value);

        System.out.print("Change succesful!");
        System.out.println("Value that can be use(Last) now : " + Number.peek());
        wait_and_enter();
        
    }

    private static void use_stack(Stack<Integer> stack){
        Stack<Integer> Number = new Stack<Integer>();
        int tmp;

        Number = stack;
        tmp = Number.pop();

        System.out.print("Use stack succesful!");
        System.out.println("Value on temp that will be use : " + tmp);
        System.out.println("Value that can be use(Last) now : " + Number.peek());
        wait_and_enter();


    }

    private static void sort_stack(Stack<Integer> stack){
        ArrayList<Integer> item = new ArrayList<Integer>();
        Stack<Integer> Number = new Stack<Integer>();
        Number = stack;

        while (!Number.empty()) {
            item.add(Number.pop());
        }
        Collections.sort(item);
        for(Integer i : item){
            Number.push(i);
        }

        System.out.print("Sort stack succesful!");
        System.out.println("Value that can be use(Last) now : " + Number.peek());
        wait_and_enter();


    }

}
