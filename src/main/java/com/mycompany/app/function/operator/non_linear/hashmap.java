package com.mycompany.app.function.operator.non_linear;

import java.util.HashMap;
import java.util.Random;

import com.mycompany.app.function.operator.operator;

public class hashmap extends operator {
    public static void hashmap_operation(){
        HashMap<Integer, String> Member = new HashMap<>();
        Random rand = new Random();
        int random;
        int choice;
        
        String[] starter = {"James","Nok","Shadow","Alan","Mean"};

        for(String i : starter){
            random = rand.nextInt(1000,9999);
            Member.put(random, i);
        }

        while (true) {
            System.out.println("Member List (ID=Name)");
            System.out.println(Member);
            System.out.println("Choose how to manupilate this Hash Map!");
            System.out.println("1. Add Member");
            System.out.println("2. Remove Member");
            System.out.println("3. Change Member Name");
            System.out.println("4. Check Member by ID");
            System.out.println("5. Exit");
            System.out.println("------------------------------------------");
            System.out.println("Please enter your choice in number above!");
            choice = input.nextInt();
            input.nextLine();

            if(choice == 1){
                String new_member;
                
                System.out.print("Please enter name of new member : ");
                new_member = input.nextLine();
                
                add_member(Member, new_member);
            }
            else if(choice == 2){
                int member_id;
                
                System.out.print("Please enter id member that you want to remove : ");
                member_id = input.nextInt();
                input.nextLine();

                remove_member(Member, member_id);

            }
            else if (choice == 3) {
                int member_id;
                String new_name;

                System.out.print("Please enter id member that you want to change name : ");
                member_id = input.nextInt();
                input.nextLine();

                if(!Member.containsKey(member_id)){
                    System.out.println("This Member don't exist!!");
                    wait_and_enter();
                }
                else{
                    System.out.print("Please enter new name of this member : ");
                    new_name = input.nextLine();

                    change_member(Member, member_id, new_name);
                }

            }
            else if(choice == 4){
                int member_id;
                
                System.out.print("Please enter id member that you want to check : ");
                member_id = input.nextInt();
                input.nextLine();

                check_member(Member, member_id);
            }
            else if(choice == 5){
                break;
            }
        }
    }

    private static void add_member(HashMap<Integer, String> Hash,String name){
        HashMap<Integer, String> Member = new HashMap<>();
        Member = Hash;
        Random rand = new Random();
        int random = rand.nextInt(1000,9999);

        if(Member.containsKey(random)){
            while (Member.containsKey(random)) {
                random = rand.nextInt(1000,9999);
            }
        }

        Member.put(random, name);

        System.out.println("Change succesful!");
        System.out.println("Result ");
        System.out.println("Member List (ID=Name)");
        System.out.print(Member);
        wait_and_enter();
    }

    private static void remove_member(HashMap<Integer, String> Hash,int key){
        HashMap<Integer, String> Member = new HashMap<>();
        Member = Hash;

        Member.remove(key);
        System.out.println("Change succesful!");
        System.out.println("Result ");
        System.out.println("Member List (ID=Name)");
        System.out.print(Member);
        wait_and_enter();
    }

    private static void change_member(HashMap<Integer, String> Hash,int key, String new_name){
        HashMap<Integer, String> Member = new HashMap<>();
        Member = Hash;

        if(!Member.containsKey(key)){
            System.out.println("This Member don't exist!!");
        }
        else{
            Member.replace(key, new_name);
            System.out.println("Change succesful!");
            System.out.println("Result ");
            System.out.println("Member List (ID=Name)");
            System.out.print(Member);
        }

        wait_and_enter();
    }

    private static void check_member(HashMap<Integer, String> Hash,int key){
        HashMap<Integer, String> Member = new HashMap<>();
        Member = Hash;

        if(!Member.containsKey(key)){
            System.out.println("This Member don't exist!!");
        }
        else{
            System.out.println("This member exist!");
            System.out.println("Their name is " + Member.get(key));
        }

        wait_and_enter();
    }
}
