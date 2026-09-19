package Matrizes;

import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] m1 = new double[2][2];
        double[][] m2 = new double[2][2];
        double[][] m3 = new double[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m1[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m2[i][j] = sc.nextDouble();
            }
        }

        System.out.println("a - Somar");
        System.out.println("b - Subtrair a primeira da segunda");
        System.out.println("c - Adicionar constante");
        System.out.println("d - Imprimir matrizes");
        char opcao = sc.next().charAt(0);

        if (opcao == 'a') {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    m3[i][j] = m1[i][j] + m2[i][j];
                    System.out.print(m3[i][j] + " ");
                }
                System.out.println();
            }
        } else if (opcao == 'b') {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    m3[i][j] = m2[i][j] - m1[i][j];
                    System.out.print(m3[i][j] + " ");
                }
                System.out.println();
            }
        } else if (opcao == 'c') {
            double c = sc.nextDouble();
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    m1[i][j] += c;
                    m2[i][j] += c;
                }
            }
        } else if (opcao == 'd') {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(m1[i][j] + " ");
                }
                System.out.println();
            }
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(m2[i][j] + " ");
                }
                System.out.println();
            }
        }
        
        sc.close();
    }
}
