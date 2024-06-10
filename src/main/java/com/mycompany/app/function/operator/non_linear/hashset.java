package com.mycompany.app.function.operator.non_linear;

import java.util.HashSet;

import com.mycompany.app.function.operator.operator;

public class hashset extends operator {
    public static void hashset_operation(){
        HashSet<String> Company = new HashSet<>();
        String[] start_company = {"facebook","twitter","unity","level-5","cygames"};

        for(String i : start_company){
            Company.add(Capital_Word(i));
        }

        while (true) {
            int choice;
            System.out.println("Company List :" + Company);
            System.out.println("Choose how to manupilate this Hash Set!");
            System.out.println("1. Add Company");
            System.out.println("2. Remove Company");
            System.out.println("3. Check Company");
            System.out.println("4. Exit");
            System.out.println("------------------------------------------");
            System.out.println("Please enter your choice in number above!");
            choice = input.nextInt();
            input.nextLine();

            if(choice == 1){
                String new_company;
                
                System.out.print("Please enter name of new Company : ");
                new_company = input.nextLine();
                
                add_company(Company, new_company);
            }
            else if (choice == 2) {
                String company;
                
                System.out.print("Please enter name of Company you want to remove : ");
                company = input.nextLine();
                
                remove_company(Company, company);
            }
            else if(choice == 3){
                String new_company;
                
                System.out.print("Please enter name of Company you want to check : ");
                new_company = input.nextLine();
                
                check_company(Company, new_company);
            }
            else if(choice == 4){
                break;
            }
        }
    }

    private static void add_company(HashSet<String> hashSet,String name){
        HashSet<String> Company = new HashSet<>();
        Company = hashSet;

        name = Capital_Word(name);

        if(Company.contains(name)){
            System.out.println("This company already exist! Please Enter difference company1");
        }
        else{
            Company.add(name);
            System.out.println("Change succesful!");
            System.out.println("Result :" + Company);
        }

        wait_and_enter();
    }

    private static void remove_company(HashSet<String> hashSet,String name){
        HashSet<String> Company = new HashSet<>();
        Company = hashSet;
        name = Capital_Word(name);

        if(!Company.contains(name)){
            System.out.println("This company does not exist!");
        }
        else{
            Company.remove(name);
            System.out.println("Remove succesful!");
            System.out.println("Result :" + Company);
        }

        wait_and_enter();
    }

    private static void check_company(HashSet<String> hashSet,String name){
        HashSet<String> Company = new HashSet<>();
        Company = hashSet;

        name = Capital_Word(name);

        if(Company.contains(name)){
            System.out.println("This company is exist in our data set!");
        }
        else{
            System.out.println("This company does not exist in our data set!");
        }

        wait_and_enter();
    }
}
