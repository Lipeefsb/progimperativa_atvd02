import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[15];

        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = sc.nextLine();
        }

        System.out.println("\nNomes na ordem inversa:");
        for (int i = 14; i >= 0; i--) {
            System.out.println(nomes[i]);
        }
        sc.close();
    }
}