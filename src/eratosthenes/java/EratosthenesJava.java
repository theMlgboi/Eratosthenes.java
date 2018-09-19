/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eratosthenes.java;

import java.util.ArrayList;

/**
 *
 * @author Andrew Archer 
 * this program finds all the prime numbers from 1-1000
 */
public class EratosthenesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //boolean numbers[] = new boolean[1000];
       //creates the arraylist
       ArrayList<String> myFriends = new ArrayList<String>();
       //adds numbers 1-1000 to the array
      for(int i=2; i<1000; i++){
          myFriends.add(i+" ");
         System.out.println(myFriends);
      }
       //removes all multiples of two from the array 
       for(int two = 2; two < 1000; two++){
           myFriends.remove(2*two+ " ");
          
       }
       //removes all the multiples of three from the array
    for(int three = 2; three <1000; three++){
        myFriends.remove(3*three+ " ");
          
    }
    //removes all the multiples of five from the array 
    for(int five = 2; five <1000; five++){
        myFriends.remove(5*five + " ");
          
    }
    //removes all the multiples of seven from the array  
    for(int seven = 2; seven<1000; seven++){
        myFriends.remove(7*seven + " ");
        //prints out all the prime numbers from 1-1000
          System.out.println(myFriends);
    }
    }
    
    
}
