package Matrizes;

import java.util.Random;

public class q8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] original = new int[4][4];
        int[][] transformada = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                original[i][j] = rand.nextInt(20) + 1;
                
                if (i >= j) {
                    transformada[i][j] = original[i][j];
                } else {
                    transformada[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(original[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(transformada[i][j] + "\t");
            }
            System.out.println();
        }
    }
}