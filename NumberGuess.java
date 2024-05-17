package JAVA;
import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.util.Random;
import java.lang.Math;

public class NumberGuess{
  static int count =0;

  public void Guess(){
    Scanner sc = new Scanner(System.in);
    System.out.println("------------------------------------------------");
    System.out.println("!..WELLCOME TO GUESSING GAME..!");
    System.out.print("Enter number of rounds to play : ");
    int n = sc.nextInt();
    System.out.println("------------------------------------------------");
    while(count!=n){
      System.out.print("Enter your guess : ");
      int num = sc.nextInt();
      int score =0;
     Random rand =  new Random();
     int x = rand.nextInt(100);
     if(num>x){
      System.out.println("Your Guess is too high and correct guess is "+x);
      }
      else if(num<x){
          System.out.println("Your Guess is too low and correct guess is "+x);
      }else if(num==x){

          score++;
          System.out.println("You did a correct guess and correct guess is "+x);
      }
      else{
      System.out.println("Sorry out of trails"+x);
      }
      count++;
      System.out.println("Your score is "+score);
      System.out.println("You completed "+count+" guesses and "+(n-count)+" guesses left");
      
      if(count==n){
        System.out.println("------------------------------------------------");
        Scanner c = new Scanner(System.in);
        System.out.print("GAME OVER want to play again(Yes/No) : ");
        String nm = c.nextLine();
        if(nm.equals("Yes")){
            Guess();
        }else{
            System.out.println("Thanks for playing ");
        }
      } 
      System.out.println("------------------------------------------------");
    }
    sc.close();
  }
  public static void main(String[] args) {
    NumberGuess obj = new NumberGuess();
    obj.Guess();

  }
}

