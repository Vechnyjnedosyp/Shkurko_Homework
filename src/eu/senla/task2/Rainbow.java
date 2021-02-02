package eu.senla.task2;

import java.util.Scanner;

public class Rainbow {

     private static String [] COLORS = {"red", "orange", "yellow", "green", "light blue", "blue", "purple"};


     public void getOneColor(){
          System.out.println("Please, enter one number of color from 1 to 7:");
          Scanner input = new Scanner(System.in);
          int oneNumber = input.nextInt();
          input.close();
          if (oneNumber != 0 && oneNumber < 8) {
               String oneColor = COLORS[oneNumber - 1];
               System.out.println(oneColor);
          } else {
               System.out.println("You entered an incorrect value, restart the program.");
          }
     }
     public void getMixOfColors(){
          System.out.println("Please, enter first and second numbers of colors from 1 to 7.");
          System.out.println("First number:");
          Scanner input = new Scanner(System.in);
          int firstNumber = input.nextInt();
          System.out.println("Second number:");
          int secondNumber = input.nextInt();
          input.close();
          if (firstNumber != 0 && secondNumber != 0 && firstNumber < 8 && secondNumber < 8) {
               String mixOfColors = COLORS[firstNumber - 1] + "-" + COLORS[secondNumber - 1];
               System.out.println(mixOfColors);
          } else {
               System.out.println("You entered an incorrect value, restart the program.");
          }
     }

}











