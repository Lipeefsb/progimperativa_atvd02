import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];

        System.out.println("Digite os 10 valores do vetor A:");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Digite os 10 valores do vetor B:");
        for (int i = 0; i < 10; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                c[i] = a[i];
            } else {
                c[i] = b[i];
            }
        }

        System.out.println("\nVetor resultante C:");
        for (int i = 0; i < 10; i++) {
            System.out.println("C[" + i + "] = " + c[i]);
        }
        sc.close();
    }
}