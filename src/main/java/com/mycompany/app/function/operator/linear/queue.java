package com.mycompany.app.function.operator.linear;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

import com.mycompany.app.function.operator.operator;

public class queue extends operator {
    public static void queue_operation() {

        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> item = new ArrayList<Integer>();

        item.add(12);
        item.add(18);
        item.add(25);
        item.add(19);
        item.add(22);

        Collections.sort(item);

        for(Integer i : item){
            queue.offer(i); 
        }

        while (true) {
            int choice;

            if(queue.isEmpty()){
                System.out.println("This queue is empty(no value in queue).");
            }
            else{
                System.out.println("This queue is not empty!");
                System.out.println("Value that can be use(Last) : " + queue.element());
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
                add_stack(new_value, queue);
            }
            else if(choice == 2){
                if(queue.isEmpty()){
                    System.out.println("This stack can't be use because it empty!!");
                }
                else{
                    use_stack(queue);
                }

            }
            else if(choice == 3){
                if(queue.isEmpty()){
                    System.out.println("This stack can't be sort because it empty!!");
                }
                else{
                    sort_stack(queue);
                }
            }
            else if(choice == 4){
                break;
            }

        }


        
    }

    private static void add_stack(int value,Queue<Integer> queue){
        Queue<Integer> Number = new LinkedList<>();

        Number = queue;
        Number.offer(value);

        System.out.print("Change succesful!");
        System.out.println("Value that can be use(First) now : " + Number.peek());
        wait_and_enter();
        
    }

    private static void use_stack(Queue<Integer> queue){
        Queue<Integer> Number = new LinkedList<>();
        int tmp;

        Number = queue;
        tmp = Number.remove();

        System.out.print("Use stack succesful!");
        System.out.println("Value on temp that will be use : " + tmp);
        System.out.println("Value that can be use(First) now : " + Number.peek());
        wait_and_enter();


    }

    private static void sort_stack(Queue<Integer> queue){
        ArrayList<Integer> item = new ArrayList<Integer>();
        Queue<Integer> Number = new LinkedList<>();
        Number = queue;

        while (!Number.isEmpty()) {
            item.add(Number.remove());
        }
        Collections.sort(item);
        for(Integer i : item){
            Number.offer(i);
        }

        System.out.print("Sort queue succesful!");
        System.out.println("Value that can be use(First) now : " + Number.peek());
        wait_and_enter();


    }
}
