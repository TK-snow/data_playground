package com.mycompany.app.function.operator.non_linear;


import java.util.ArrayList;

import com.mycompany.app.function.operator.operator;
import com.mycompany.app.function.operator.model.*;

public class graph extends operator {

    

    public static void graph_operation(){
        Graph<String> Employees = new Graph<String>();

        Employees.addEdge("Emily", "James", true);
        Employees.addEdge("Emily", "Vincent", true);
        Employees.addEdge("James", "Vincent", true);
        Employees.addEdge("James", "May", true);
        Employees.addEdge("James", "Sonny", true);
        Employees.addEdge("Vincent", "Sonny", true);
        Employees.addEdge("Vincent", "Toon", true);
        Employees.addEdge("Toon", "Emily", true);
        Employees.addEdge("Toon", "James", true);
        Employees.addEdge("May", "Toon", true);
        Employees.addEdge("May", "Vox", true);
        Employees.addEdge("Sonny", "Moon", true);
        Employees.addEdge("Sonny", "Emily", true);
        Employees.addEdge("Sonny", "Vox", true);

        while (true) {
            int choice;
            ArrayList<String> Employees_List = new ArrayList<String>();
            Employees_List = Employees.getVertex();

            System.out.print("Employess List : ");
            for(String i : Employees_List){
                System.out.print(i + " ");
            }
            System.out.println("");
            System.out.println("Choose how to manupilate this graph!");
            System.out.println("1. Add employees");
            System.out.println("2. Connect employees.");
            System.out.println("3. Remove employees connection.");
            System.out.println("4. Check employees connection.");
            System.out.println("5. Check all employees connection.");
            System.out.println("6. exit.");
            System.out.println("------------------------------------------");
            System.out.println("Please enter your choice in number above!");
            choice = input.nextInt();
            input.nextLine();

            if(choice == 1){
                String new_name;
                System.out.println("New Employees name : ");
                new_name = input.nextLine();

                add_employees(Employees, new_name);
            }
            else if(choice == 2){
                String name1;
                String name2;
                System.out.println("Enter base Employees name : ");
                name1 = input.nextLine();
                System.out.println("Enter Employees name that "+ Capital_Word(name1) + " has connection with : ");
                name2 = input.nextLine();

                add_employees_connection(Employees, name1, name2);

            }
            else if(choice == 3){

                String name1;
                String name2;
                System.out.println("Enter base Employees name : ");
                name1 = input.nextLine();
                System.out.println("Enter Employees name which no longer connect to "+ Capital_Word(name1));
                name2 = input.nextLine();

                remove_employees_connection(Employees, name1, name2);
                
            }
            else if(choice == 4){
                String name;

                System.out.println("Employees name that want to check connection : ");
                name = input.nextLine();

                check_employees_connection(Employees, name);
            }
            else if(choice == 5){
                check_all_employees_connection(Employees);
            }
            else if(choice == 6){
                break;
            }

        }

    }

    private static void add_employees(Graph<String> graph,String name){
        Graph<String> Employees = new Graph<String>();
        Employees = graph;

        name = Capital_Word(name);

        if(Employees.hasVertex(name)){
            System.out.println("This employees already exist!!");
        }
        else{
            Employees.addVertex(name);
            System.out.println("Add employees successful!!");
            ArrayList<String> Employees_List = new ArrayList<String>();
            Employees_List = Employees.getVertex();

            System.out.print("Employess List Result : ");
            for(String i : Employees_List){
                System.out.print(i + " ");
            }

        }
        wait_and_enter();
    }

    private static void add_employees_connection(Graph<String> graph,String name1, String name2){
        Graph<String> Employees = new Graph<String>();
        Employees = graph;

        name1 = Capital_Word(name1);
        name2 = Capital_Word(name2);

        if(!Employees.hasVertex(name1)){
            System.out.println("This employees don't exist!!");
        }
        else{
            if(!Employees.hasVertex(name2)){
                System.out.println("The second employees don't exist!!");
            }
            else{
                Employees.addEdge(name1, name2, true);
                System.out.println("Add relationship between Employees successful!");
                ArrayList<String> neighbours = new ArrayList<String>();
                neighbours = Employees.neighbours(name1);
                System.out.println("Final Relationship graph of " + name1);
                System.out.print(name1 + " : ");
                for(String i : neighbours){
                    System.out.print(i + " ");
                }
            }
        }

        wait_and_enter();
    }

    private static void remove_employees_connection(Graph<String> graph,String name1, String name2){
        Graph<String> Employees = new Graph<String>();
        Employees = graph;

        name1 = Capital_Word(name1);
        name2 = Capital_Word(name2);

        if(!Employees.hasEdge(name1, name2)){
            System.out.println("These two already don't have connection!");
        }
        else{
            Employees.removeEdge(name1, name2);
            System.out.println("Remove Successful!");
            ArrayList<String> neighbours = new ArrayList<String>();
            neighbours = Employees.neighbours(name1);
            System.out.println("Final Relationship graph of " + name1);
            System.out.print(name1 + " : ");
            for(String i : neighbours){
                System.out.print(i + " ");
            }
        }

        wait_and_enter();
    }

    private static void check_employees_connection(Graph<String> graph,String name){
        Graph<String> Employees = new Graph<String>();
        Employees = graph;

        name = Capital_Word(name);

        if(!Employees.hasVertex(name)){
            System.out.println("This employees does not exist!!");
        }
        else{
            ArrayList<String> neighbours = new ArrayList<String>();
            neighbours = Employees.neighbours(name);
            System.out.println("Final Relationship graph of " + name);
            System.out.print(name + " has connection with these employees : ");
            for(String i : neighbours){
                System.out.print(i + " ");
            }

        }

        wait_and_enter();
    }

    private static void check_all_employees_connection(Graph<String> graph){
        Graph<String> Employees = new Graph<String>();
        Employees = graph;

        System.out.println("The connection between employees of this company!");
        System.out.println(Employees.toString());
        wait_and_enter();
    }

}
