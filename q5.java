import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[20];

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            nums[i] = sc.nextInt();
        }

        System.out.println("\nElementos com conteúdo ímpar:");
        for (int i = 0; i < 20; i++) {
            if (nums[i] % 2 != 0) {
                System.out.print(nums[i] + " ");
            }
        }

        System.out.println("\n\nElementos das posições (índices) pares:");
        for (int i = 0; i < 20; i += 2) {
            System.out.println("Posição [" + i + "]: " + nums[i]);
        }
        sc.close();
    }
}