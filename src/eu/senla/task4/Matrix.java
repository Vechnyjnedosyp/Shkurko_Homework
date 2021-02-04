package eu.senla.task4;

import java.util.ArrayList;
import java.util.Arrays;


public class Matrix {

    private String[][] matrix;
    private String[] mainDiagonal;
    private String[] sideDiagonal;

    public void getMatrix() {
        this.matrix = new String[10][10];
        String symbols = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
        StringBuilder mixLetters;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j % 3 == 0) {
                    matrix[i][j] = (String.valueOf((Math.random() * 10))).substring(0, 6);
                } else {
                    mixLetters = new StringBuilder();
                    for (int n = 1; n <= 6; n++) {
                        int num = (int) (Math.random() * 52);
                        mixLetters.append(symbols.charAt(num));
                    }
                    matrix[i][j] = mixLetters.toString();
                }
            }
        }
    }

    public void getMainDiagonal() {
        this.mainDiagonal = new String[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            mainDiagonal[i] = matrix[i][i];
        }
        System.out.println("This is main diagonal ");
        System.out.println(Arrays.toString(mainDiagonal));
    }

    public void getSideDiagonal() {
        this.sideDiagonal = new String[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            sideDiagonal[i] = matrix[matrix.length - i - 1][i];
        }
        System.out.println("This is side diagonal ");
        System.out.println(Arrays.toString(sideDiagonal));
        System.out.println();
    }

    public void compareOfDiagonals() {
        System.out.println("Тhe result of comparison two diagonals is " + Arrays.equals(mainDiagonal, sideDiagonal) + ".");
        System.out.println();
    }

    public void transformationOfStrings() {
        ArrayList<Double> transNum = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < mainDiagonal.length; i++) {
            if (mainDiagonal[i].indexOf('.') != -1 && sideDiagonal[i].indexOf('.') != -1) {
                double valueMain = (Double.parseDouble(mainDiagonal[i]));
                double valueSide = (Double.parseDouble(sideDiagonal[i]));
                if (valueMain >= 1.7 || valueSide >= 1.7 ){
                    transNum.add(Math.ceil(valueMain));
                    transNum.add(Math.ceil(valueSide));
                } else {
                    transNum.add(Math.floor(valueMain));
                    transNum.add(Math.floor(valueSide));
                }
            } else {
                str.append(mainDiagonal[i], 1,4);
                str.append(sideDiagonal[i], 1,4);
            }
        }

        System.out.println("Result of converting numbers of type Double: ");

        for (int i = 0; i < transNum.size(); i++) {
            if (i != transNum.size() - 1) {
                System.out.print(transNum.get(i) + "_");
            } else {
                System.out.print(transNum.get(i));
            }
        }

        System.out.println("\n");
        System.out.println("Letter conversion result: ");

        for (int j = 0; j < str.length(); j++) {
            if (j == str.length() - 1 || (j + 1) % 3 != 0) {
                System.out.print(str.charAt(j));
            } else {
                System.out.print(str.charAt(j) + ", ");
            }
        }
        System.out.println("\n");
    }

    public void printMatrix() {
        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}
