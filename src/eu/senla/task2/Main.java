package eu.senla.task2;

import java.util.Scanner;

public class Main {

    public static void main (String [] args){

        Rainbow color = new Rainbow();
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter 1 or 2 for print your color(s):");
        final int SELECT_NUMBERS = input.nextInt();
        if (SELECT_NUMBERS <= 2 && SELECT_NUMBERS != 0){
            switch (SELECT_NUMBERS) {
                case 1:color.oneColor();
                    break;
                case 2:color.mixOfColors();
                    break;
            }
        } else {
            System.out.println("You entered an incorrect value, restart the program.");
        }





}



}
