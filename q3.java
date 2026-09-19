import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            v[i] = sc.nextInt();
        }

        System.out.println("\nElementos pares:");
        for (int i = 0; i < 10; i++) {
            if (v[i] % 2 == 0) {
                System.out.print(v[i] + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}
