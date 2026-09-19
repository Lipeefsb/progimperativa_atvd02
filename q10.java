import java.util.Scanner;

public class q10 {
    
    public static boolean contem(int[] vet, int valor) {
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == valor) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[5];
        int[] y = new int[5];

        System.out.println("Digite 5 números para o vetor X:");
        for (int i = 0; i < 5; i++) {
            x[i] = sc.nextInt();
        }

        System.out.println("Digite 5 números para o vetor Y:");
        for (int i = 0; i < 5; i++) {
            y[i] = sc.nextInt();
        }

        System.out.println("\na. Soma (x[i] + y[i]):");
        for (int i = 0; i < 5; i++) {
            System.out.print((x[i] + y[i]) + " ");
        }

        System.out.println("\n\nb. Produto (x[i] * y[i]):");
        for (int i = 0; i < 5; i++) {
            System.out.print((x[i] * y[i]) + " ");
        }

        System.out.println("\n\nc. Diferença (x - y):");
        for (int i = 0; i < 5; i++) {
            if (!contem(y, x[i])) {
                System.out.print(x[i] + " ");
            }
        }

        System.out.println("\n\nd. Interseção:");
        for (int i = 0; i < 5; i++) {
            if (contem(y, x[i])) {
                System.out.print(x[i] + " ");
            }
        }

        System.out.println("\n\ne. União:");
        for (int i = 0; i < 5; i++) {
            System.out.print(x[i] + " ");
        }
        for (int i = 0; i < 5; i++) {
            if (!contem(x, y[i])) {
                System.out.print(y[i] + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}
