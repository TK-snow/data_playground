package com.mycompany.app;

import java.io.IOException;

//menu import
import com.mycompany.app.function.ui.Menu;
import com.mycompany.app.function.ui.Linear;
import com.mycompany.app.function.ui.Non_Linear;


import com.mycompany.app.function.operator.linear.*;
import com.mycompany.app.function.operator.non_linear.*;

public class App 
{
    static int current_status;
    public static void main( String[] args ) throws IOException
    {
        while (true) {
            current_status = Menu.Start();

            if(current_status == 2 ){
                break;
            }
            else if(current_status == 1){
                while (true) {
                    current_status = Menu.data_choose();

                    if(current_status == 1){
                        while (true) {
                            current_status = Linear.data_choose();
                            if(current_status == 1){
                                Linear.arrey_detail();
                                array.array_operation();
                            }
                            else if(current_status == 2){
                                Linear.arreylist_detail();
                                arraylist.arraylist_operation();
                            }
                            else if (current_status == 3) {
                                Linear.arrey_detail();
                                linkedlist.linkedlist_operation();
                            }
                            else if (current_status == 4) {
                                Linear.stack_detail();
                                stack.stack_operation();
                            }
                            else if( current_status == 5){
                                Linear.queue_detail();
                                queue.queue_operation();
                            }
                            if (current_status == 6) {
                                break;
                            }
                        }
                        break;
                    }
                    else if(current_status == 2){
                        while (true) {
                            current_status = Non_Linear.data_choose();
                            if(current_status == 1){
                                Non_Linear.hashmap_detail();
                                hashmap.hashmap_operation();
                            }
                            else if (current_status == 2) {
                                Non_Linear.hashset_detail();
                                hashset.hashset_operation();
                            }
                            else if (current_status == 3) {
                                Non_Linear.treeset_detail();
                                treeset.treeset_operation();
                            }
                            else if (current_status == 4) {
                                Non_Linear.treemap_detail();
                                treemap.treemap_operation();
                            }
                            else if(current_status == 5) {
                                Non_Linear.graph_detail();
                                graph.graph_operation();
                            }
                            else if(current_status == 6){
                                Non_Linear.tree_detail();
                                tree.tree_operation();
                            }
                            if (current_status == 7) {
                                break;
                            }
                        }
                        break;
                    }
                    else if(current_status == 3){
                        break;
                    }
                }


            }
            else{
                System.out.println("Error please enter again!");
            }
        }
        
    }
}
