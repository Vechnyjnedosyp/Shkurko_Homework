package eu.senla.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Matrix {

    private String[][] matrix;
    private String[] mainDiagonal;
    private String[] sideDiagonal;

    public String[][] matrix() {
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
        return matrix;
    }

    public String[] mainDiagonal() {
        this.mainDiagonal = new String[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    mainDiagonal[i] = matrix[i][j];
                }
            }
        }
        System.out.println("This is main diagonal ");
        System.out.println(Arrays.toString(mainDiagonal));
        return mainDiagonal;
    }

    public String[] sideDiagonal() {
        this.sideDiagonal = new String[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == matrix.length - j - 1 && j == matrix.length - i - 1) {
                    sideDiagonal[j] = matrix[i][j];
                }
            }
        }
        System.out.println("This is side diagonal ");
        System.out.println(Arrays.toString(sideDiagonal));
        System.out.println();
        return sideDiagonal;
    }

    public void comparisonOfDiagonals() {
        System.out.println("Тhe result of comparison two diagonals is " + Arrays.equals(mainDiagonal, sideDiagonal) + ".");
        System.out.println();
    }

    public void transformationOfStrings() {
        ArrayList<Long> num = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < mainDiagonal.length; i++) {
            if (mainDiagonal[i].indexOf('.') != -1 && sideDiagonal[i].indexOf('.') != -1) {
                num.add(Math.round(Double.parseDouble(mainDiagonal[i])));
                num.add(Math.round(Double.parseDouble(sideDiagonal[i])));
            } else {
                str.append(mainDiagonal[i], 1, 5);
                str.append(sideDiagonal[i], 1, 5);
            }
        }

        System.out.println("Result of converting numbers of type Double: ");

        for (int i = 0; i < num.size(); i++) {
            if (i != num.size() - 1) {
                System.out.print(num.get(i) + "_");
            } else {
                System.out.print(num.get(i));
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
