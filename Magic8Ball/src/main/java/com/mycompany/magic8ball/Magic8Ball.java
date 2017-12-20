/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.magic8ball;

/**
 *
 * @author kmlnd
 */

import java.util.Random;
public class Magic8Ball {
    
    private static Random randomizer = new Random();
    
    public void Run(){
        
    boolean AskAgain = true;    
        
        while(AskAgain == true){
            ConsoleIO.Display("I am the Magic8Ball!");
            String UserInput = ConsoleIO.UserPrompt("Ask me a anything");
            ConsoleIO.Display("hmmm..... " + UserInput + " well..... " + RandomResponse());
            String anotherQuestion = ConsoleIO.UserPrompt("Ask another question?");
            if(anotherQuestion.equalsIgnoreCase("Yes")){
                ConsoleIO.Display("No problem.");
            } else if (anotherQuestion.equalsIgnoreCase("No")){
                ConsoleIO.Display("No problem, bye bye!.");
                AskAgain = false;
            } else{
                ConsoleIO.Display("Sorry, yes or no answers please.");
                anotherQuestion = ConsoleIO.UserPrompt("Ask another question?");
            }
        }
        
    }
    
    public static String RandomResponse(){
    String[] Response = {"Yes","No","maybe","Ask again"};
    int RandomResponse = randomizer.nextInt(Response.length);
    return Response[RandomResponse];
}
    
    
    
}
