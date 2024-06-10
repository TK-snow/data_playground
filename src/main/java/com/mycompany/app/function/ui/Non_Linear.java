package com.mycompany.app.function.ui;

import java.io.IOException;

public class Non_Linear extends Menu {
    public static int data_choose(){
        int choice = 0;

        System.out.println("------------------------------------------");
        System.out.println("Non-Linear Data Structures");
        System.out.println("In this data structure type, element are arranged in non linear.");
        System.out.println("this data structure type can put into each catagories ");
        System.out.println("Please choose type of data that compettible with java you want to play with!");
        System.out.println("------------------------------------------");
        System.out.println("1. Hash Map");
        System.out.println("2. Hash Set");
        System.out.println("3. Tree Set");
        System.out.println("4. Tree Map");
        System.out.println("5. Graph");
        System.out.println("6. Tree");
        System.out.println("7. Exit");
        System.out.println("------------------------------------------");
        System.out.println("Please enter your choice in number above!");
        choice = input.nextInt();

        return choice;
    }

    public static void hashmap_detail() throws IOException{
        System.out.println("------------------------------------------");
        System.out.println("Hash Map");
        System.out.println("A HashMap is a data structure in Java that provides a way to store and retrieve key-value pairs.");
        System.out.println("It is part of the Java Collections Framework.");
        System.out.println("It  is implemented based on the hash table data structure.");
        System.out.println("------------------------------------------");

    }

    public static void hashset_detail() throws IOException{
        System.out.println("------------------------------------------");
        System.out.println("Hash Set");
        System.out.println("HashSet is a data structure in Java that implements the Set interface.");
        System.out.println("It is stores elements in a hash table.");
        System.out.println("Each element in the HashSet is unique.");
        System.out.println("------------------------------------------");
    }
    
    public static void treeset_detail() throws IOException{
        System.out.println("------------------------------------------");
        System.out.println("Tree Set");
        System.out.println("TreeSet is an implementation of the SortedSet interface in Java.");
        System.out.println("It is uses a self-balancing binary search tree called a red-black tree to store elements in sorted order.");
        System.out.println("TreeSet does not allow duplicate elements.");
        System.out.println("It ensures that each element in the set is unique.");
        System.out.println("It values are sorting by default without need to do anything.");
        System.out.println("------------------------------------------");
    }

    public static void treemap_detail() throws IOException{
        System.out.println("------------------------------------------");
        System.out.println("Tree Map");
        System.out.println("TreeMap is a class in Java that implements the Map interface.");
        System.out.println("provides a sorted key-value mapping based on the natural order of the keys or a custom comparator.");
        System.out.println("It values are sorting by default without need to do anything.");
        System.out.println("------------------------------------------");
    }

    public static void graph_detail() throws IOException{
        System.out.println("------------------------------------------");
        System.out.println("Graph");
        System.out.println("Graphs are data structure that represents a collection of interconnected nodes or vertices.");
        System.out.println("They are composed of vertices and edges, where vertices represent entities.");
        System.out.println("Edges represent the relationships between those entities.");
        System.out.println("------------------------------------------");
    }

    public static void tree_detail() throws IOException{
        System.out.println("------------------------------------------");
        System.out.println("Tree");
        System.out.println("A tree is a widely used data structure in computer science that represents a hierarchical structure.");
        System.out.println("It consists of nodes connected by edges, where each node can have zero or more child nodes.");
        System.out.println("Tree data structures offer efficient insertion and deletion operations.");
        System.out.println("------------------------------------------");
    }
}
