package Matrizes;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int acima = 0, abaixo = 0, principal = 0, secundaria = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
                
                if (i == j) principal += matriz[i][j];
                if (i < j) acima += matriz[i][j];
                if (i > j) abaixo += matriz[i][j];
                if (i + j == 2) secundaria += matriz[i][j];
            }
        }

        System.out.println(acima);
        System.out.println(abaixo);
        System.out.println(principal);
        System.out.println(secundaria);
        
        sc.close();
    }
}
