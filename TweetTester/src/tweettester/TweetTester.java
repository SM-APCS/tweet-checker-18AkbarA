/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tweettester;

import java.util.Scanner;
import java.lang.Math; 
/**
 * @class  AP CSA
 * @author Abs. the bro.
 */
public class TweetTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter your tweet: ");
         String tweet = scan.nextLine();
         int tweetlength = tweet.length();
         System.out.println("Character count: " + tweetlength);
         if (tweetlength > 140){
        	 System.out.println("Too many characters!");
         }
         else{
        	 System.out.println("Meets character requirement");
         }
    }
    
}
