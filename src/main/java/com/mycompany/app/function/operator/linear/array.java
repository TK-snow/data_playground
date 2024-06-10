package com.mycompany.app.function.operator.linear;

import java.io.IOException;

import com.mycompany.app.function.operator.operator;

public class array extends operator{

    public static void array_operation() throws IOException{

        int choice = 0;
        int array_test[] = {1,2,3,4,5};

        System.out.println("Array in non dynamic structure so we will fixed size of this arrey");
        System.out.println("Size : " + array_test.length);
        
        System.out.println(" ");
        System.out.println("------------------------------------------");
        while (true) {
            System.out.print("Array Member : ");
            for(int i : array_test ){
                System.out.print(i + " ");
            }
            System.out.println(" ");
            System.out.println("Because it non dynamic array, the way to manupilate is straight foward!");
            System.out.println("Choose how to manupilate this array!");
            System.out.println("1. Change Value");
            System.out.println("2. Exit");
            System.out.println("------------------------------------------");
            System.out.println("Please enter your choice in number above!");
            choice = input.nextInt();

            if(choice == 2){
                break;
            }
            else if(choice == 1){
                int pointer;
                int new_value;

                System.out.print("Enter position you want to change : ");
                pointer = input.nextInt();
                if(pointer > 5){
                    System.out.print("Error! This array only have size at 5.");
                    wait_and_enter();
                }
                else{
                    System.out.print("Enter number that you want to change into : ");
                    new_value = input.nextInt();
                    change_value(pointer, array_test, new_value);
                }
            }

        }

    }
    private static void change_value(int pointer, int array[],int new_value){
        int array_value[] = array;
        pointer--;

        array_value[pointer] = new_value;

        System.out.print("Change succesful!");
        System.out.print("Result : ");
        for(int i : array_value ){
            System.out.print(i + " ");
        }
        wait_and_enter();
    }
}
