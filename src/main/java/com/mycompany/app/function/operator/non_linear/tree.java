package com.mycompany.app.function.operator.non_linear;



import java.util.LinkedList;
import java.util.List;

import com.mycompany.app.function.operator.operator;
import com.mycompany.app.function.operator.model.Tree;

public class tree extends operator {


    public static void tree_operation(){

        //install data
        Tree<String> Head = new Tree<String>();
        Head = dataSet();

        while (true) {
            int choice;
            LinkedList<String> element = new LinkedList<String>();
            element = getNode(Head, element);
            int size = getDataSize(Head, 0);
            System.out.println("Tree data head name : " + (size + 1)/*+1 count header */);
            System.out.println("Size of this data " + getDataSize(Head, 1));
            System.out.println("Choose how to manupilate this tree data!!");
            System.out.println("1. Add position to team");
            System.out.println("2. Delete Position (warning position under it gone too!)");
            System.out.println("3. Get position directly under specific position");
            System.out.println("4. Get all data");
            System.out.println("5. Exist");
            System.out.println("------------------------------------------");
            System.out.println("Please enter your choice in number above!");
            choice = input.nextInt();
            input.nextLine();

            if(choice == 1){
                String new_position;
                String head_position ;

                System.out.println("Enter position you want to add : ");
                new_position = input.nextLine();
                System.out.println("This position is under : ");
                head_position = input.nextLine();

                if(!element.contains(Capital_Word(head_position))){
                    System.out.println("Position must under exists position only!");
                    wait_and_enter();
                }
                else{
                    AddData(Head, head_position, new_position);
                }
                    
            }
            else if(choice == 2){
                String position;

                System.out.println("Warning : Position under it will be remove too!");
                System.out.println("Enter position you want to remove: ");
                position = input.nextLine();

                if(!element.contains(position)){
                    System.out.println("Position must under exists position only!");
                    wait_and_enter();
                }
                else{
                    removeData(Head, position);
                }
            }
            else if(choice == 3){
                String position;
                System.out.println("Enter position you want to check branch: ");
                position = input.nextLine();

                if(!element.contains(position)){
                    System.out.println("Position must under exists position only!");
                    wait_and_enter();
                }
                else{
                    checkData(Head, position);
                }

            }
            else if(choice == 4){
                //getAllData(Head);
                getAllData(Head);
                wait_and_enter();
            }
            else if(choice == 5){
                break;
            }


        }

    }

    private static void AddData(Tree<String> data,String head_name,String new_position){

        List<Tree<String>> child = data.getChildren();
        Tree<String> new_data = new Tree<String>();
        new_position = Capital_Word(new_position);

        if (!child.isEmpty()) {
            
            for(Tree<String> i : child){
                if(i.getData().equals(head_name)){
                    new_data.setData(new_position);
                    i.addChild(new_data);
                    System.out.println("Add data successful!");
                    System.out.println("new data of this branch");
                    System.out.println( i.getData() + ": " + i.toString());
                    wait_and_enter();

                    break;
                }
                else{
                    AddData(i, head_name, new_position);
                }

            }
        }
        
    }

    private static void removeData(Tree<String> data,String position){

        List<Tree<String>> child = data.getChildren();
        Tree<String> new_data = new Tree<String>();
        int index = 0;

        if (!child.isEmpty()) {
            int child_num = data.getNumberOfChildren();
            while (index < child_num) {
                new_data = data.getChildAt(index);
                if(new_data.getData().equals(position)){
                    data.removeChildAt(index);
                    System.out.println("Position delete!!");
                    System.out.println("Please check result at option 4!");
                    wait_and_enter();
                    break;
                }
                else{
                    index++;
                    removeData(new_data, position);
                }
            }
            
        }
        
    }

    private static void checkData(Tree<String> data,String position){

        List<Tree<String>> child = data.getChildren();
        Tree<String> new_data = new Tree<String>();
        int index = 0;



        if(data.getData().equals(position)){
            if(!child.isEmpty()){
                System.out.println("This position have " + data.getNumberOfChildren() +" position under it");
                System.out.println(child.toString());
                wait_and_enter();
                
            }
            else{
                System.out.println("This position don't have any other position under it!!");
                wait_and_enter();
            }
        }else{
            int child_num = data.getNumberOfChildren();
            while (index < child_num) {
                new_data = data.getChildAt(index);
                index++;
                checkData(new_data, position);
            }
        }
        
    }

    private static void getAllData(Tree<String> data){

        List<Tree<String>> child = data.getChildren();

        if (!child.isEmpty()) {
            System.out.print(data.getData() + " : ");
            System.out.println(child.toString() + " ");
            for(Tree<String> i : child){
                getAllData(i);
            }
        }
    }

    //for add and remove
    private static LinkedList<String> getNode(Tree<String> data,LinkedList<String> element){

        List<Tree<String>> child = data.getChildren();

        element.add(data.getData());
        if (!child.isEmpty()) {
            for(Tree<String> i : child){
                getNode(i, element);
            }
        }

        return element;
    }

    private static int getDataSize(Tree<String> data,int size_start){
        int size_final = 0;

        List<Tree<String>> child = data.getChildren();

        size_final += data.getNumberOfChildren();

        if (!child.isEmpty()) {
            for(Tree<String> i : child){
                size_final += getDataSize(i, size_start);
            }
        }
        else{
            size_final = 0;
        }

        return size_final;

        
    }
}

