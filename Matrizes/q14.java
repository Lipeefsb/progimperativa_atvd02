package Matrizes;

import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            String nome = sc.next();
            int faltas = 0;
            String diasFalta = "";
            
            for (int dia = 1; dia <= 30; dia++) {
                String presenca = sc.next();
                if (presenca.equals("F")) {
                    faltas++;
                    diasFalta += dia + " ";
                }
            }
            
            if (faltas > 10) {
                System.out.println(nome + " - dias: " + diasFalta.trim());
            }
        }
        
        sc.close();
    }
}
