package Vetores;

import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int count = 0;

        while (count < 10) {
            System.out.print("Introduza o " + (count + 1) + "º número: ");
            int num = sc.nextInt();
            boolean existe = false;

            for (int i = 0; i < count; i++) {
                if (vetor[i] == num) {
                    existe = true;
                    break;
                }
            }

            if (existe) {
                System.out.println("Número já existe. Por favor, introduza um número diferente.");
            } else {
                vetor[count] = num;
                count++;
            }
        }

        System.out.println("\nVetor final:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}