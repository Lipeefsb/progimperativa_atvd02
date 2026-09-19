package Vetores;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[20];
        int[] idades = new int[20];
        int somaIdades = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Pessoa " + (i + 1) + " - Nome: ");
            nomes[i] = sc.nextLine();
            
            System.out.print("Pessoa " + (i + 1) + " - Idade: ");
            idades[i] = sc.nextInt();
            sc.nextLine(); 
            
            somaIdades += idades[i];
        }

        double media = (double) somaIdades / 20;
        System.out.printf("\nIdade média do grupo: %.2f\n", media);

        System.out.println("\nPessoas com idade acima da média:");
        for (int i = 0; i < 20; i++) {
            if (idades[i] > media) {
                System.out.println("- " + nomes[i] + " (" + idades[i] + " anos)");
            }
        }
        sc.close();
    }
}
