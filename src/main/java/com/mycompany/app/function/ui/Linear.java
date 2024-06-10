package com.mycompany.app.function.ui;

import java.io.IOException;

public class Linear extends Menu {
    

    public static int data_choose(){
        int choice = 0;

        System.out.println("------------------------------------------");
        System.out.println("Linear Data Structures");
        System.out.println("In this data structure type, element are arranged in linear or sequencely");
        System.out.println("this data structure type can put into each catagories ");
        System.out.println("Please choose type of data that compettible with java you want to play with!");
        System.out.println("------------------------------------------");
        System.out.println("1. Array");
        System.out.println("2. ArrayList");
        System.out.println("3. Linked List");
        System.out.println("4. Stack");
        System.out.println("5. Queues");
        System.out.println("6. Exit");
        System.out.println("------------------------------------------");
        System.out.println("Please enter your choice in number above!");
        choice = input.nextInt();


        return choice;
    }

    public static void arrey_detail() throws IOException{
        System.out.println("------------------------------------------");
        System.out.println("Array");
        System.out.println("It is the most simple type of data structure that any program can use.");
        System.out.println("it use as many programming languese base of data storation.");
        System.out.println("It must be fixed in size and non dynamic data structure.");
        System.out.println("The structure example : ");
        System.out.println("Size - 5 ; Array [ 12, 15 , 16 ,17 , 25 , 26] ");
        System.out.println("------------------------------------------");

    }

    public static void arreylist_detail() throws IOException{
        System.out.println("------------------------------------------");
        System.out.println("ArrayList");
        System.out.println("It is dynamic data structure that allows for the storage and manipulation of elements. ");
        System.out.println("It is part of the Java Collections Framework and is implemented using an array internally.");
        System.out.println("It size can be expand as much as programmer want!");
        System.out.println("------------------------------------------");

    }

    public static void linkedlist_detail() throws IOException{
        System.out.println("------------------------------------------");
        System.out.println("LinkedList");
        System.out.println("The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.");
        System.out.println("The LinkedList stores its items in \"containers.\" The list has a link to the first container and each container has a link to the next container in the list.");
        System.out.println("To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.");
        System.out.println("------------------------------------------");

    }

    public static void stack_detail() throws IOException{
        System.out.println("------------------------------------------");
        System.out.println("Stack");
        System.out.println("The Last-In-First-Out (LIFO) principle dictates that the element that was most recently inserted is also the element that is removed first.");
        System.out.println("A stack is a linear data structure that follows this rule.");
        System.out.println("------------------------------------------");

    }

    public static void queue_detail() throws IOException{
        System.out.println("------------------------------------------");
        System.out.println("Queue");
        System.out.println("A queue is a linear data structure in Java that follows the First-In-First-Out (FIFO) principle.");
        System.out.println("It represents a collection of elements where elements are inserted at the rear and removed from the front.");
        System.out.println("------------------------------------------");

    }

}
