package Matrizes;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[] vetor = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                vetor[j] += matriz[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}
