import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v1 = new int[20];
        int[] v2 = new int[20];
        int[] v3 = new int[40];

        System.out.println("--- Leitura do 1º vetor ---");
        for (int i = 0; i < 20; i++) {
            v1[i] = sc.nextInt();
        }

        System.out.println("--- Leitura do 2º vetor ---");
        for (int i = 0; i < 20; i++) {
            v2[i] = sc.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            v3[2 * i] = v1[i];
            v3[2 * i + 1] = v2[i];
        }

        System.out.println("\nVetor intercalado:");
        for (int i = 0; i < 40; i++) {
            System.out.print(v3[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
