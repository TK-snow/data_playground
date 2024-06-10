package com.mycompany.app.function.operator;

import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.lang3.text.WordUtils;

import com.mycompany.app.function.operator.model.Tree;


@SuppressWarnings("deprecation")
public class operator {
    public static Scanner input = new Scanner(System.in);
    
    protected static void wait_and_enter(){
        System.out.println(" ");
        System.out.println("Please Press [Any] to continue!");
        try {
            System.in.read();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    protected static String Capital_Word(String word){
        return  WordUtils.capitalizeFully(word);
    }

    public static Tree<String> dataSet(){
        Tree<String> Head = new Tree<String>();
        Head.setData("Game Operation");{
            Tree<String> Producer = new Tree<String>(); Producer.setData("Producer");
            Head.addChild(Producer);
            Tree<String> Director = new Tree<String>(); Director.setData("Director");
            Head.addChild(Director);{
                //under producer role
                Tree<String> Marketing = new Tree<String>(); Marketing.setData("Marketing");
                Producer.addChild(Marketing);
                Tree<String> Excutive = new Tree<String>(); Excutive.setData("Excutive");
                Producer.addChild(Excutive);
                Tree<String> Finance = new Tree<String>(); Finance.setData("Finance");
                Producer.addChild(Finance);
                //under director role
                Tree<String> Game_Designer = new Tree<String>(); Game_Designer.setData("Game Designer");
                Director.addChild(Game_Designer);
                Tree<String> Game_Programmer = new Tree<String>(); Game_Programmer.setData("Game Programmer");
                Director.addChild(Game_Programmer);{
                    //under game designer role
                    Tree<String> Artist = new Tree<String>(); Artist.setData("Artist");
                    Game_Designer.addChild(Artist);
                    Tree<String> Wirtter = new Tree<String>(); Wirtter.setData("Writter");
                    Game_Designer.addChild(Wirtter);
                    Tree<String> Sound_Design = new Tree<String>(); Sound_Design.setData("Sound Design");
                    Game_Designer.addChild(Sound_Design);

                    //under game programmer role
                    Tree<String> Level_Design = new Tree<String>(); Level_Design.setData("Level Design");
                    Game_Programmer.addChild(Level_Design);
                    Tree<String> AI_Programmer = new Tree<String>(); AI_Programmer.setData("AI Programmer");
                    Game_Programmer.addChild(AI_Programmer);
                    Tree<String> Model_Programmer = new Tree<String>(); Model_Programmer.setData("3D Programmer");
                    Game_Programmer.addChild(Model_Programmer);
                    Tree<String> Sound_Programmer = new Tree<String>(); Sound_Programmer.setData("Sound Programmer");
                    Game_Programmer.addChild(Sound_Programmer);{
                        //under artist
                        Tree<String> Background_Artist = new Tree<String>(); Background_Artist.setData("Background Artist");
                        Artist.addChild(Background_Artist);
                        Tree<String> Character_Design = new Tree<String>(); Character_Design.setData("Character Artist");
                        Artist.addChild(Character_Design);

                        //under sound design
                        Tree<String> Edittor = new Tree<String>(); Edittor.setData("Edittor");
                        Sound_Design.addChild(Edittor);
                    }
                }
            }
        }
        return Head;
    }
}
