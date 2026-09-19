package Matrizes;

import java.util.Random;

public class q9 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] cartela = new int[5][5];
        boolean[] sorteados = new boolean[100];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int num;
                do {
                    num = rand.nextInt(100);
                } while (sorteados[num]);
                
                sorteados[num] = true;
                cartela[i][j] = num;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%02d\t", cartela[i][j]);
            }
            System.out.println();
        }
    }
}
