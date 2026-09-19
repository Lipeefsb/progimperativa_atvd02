package Vetores;

public class q9 {
    public static void main(String[] args) {
        int[] vet = new int[100];
        int count = 0;
        int num = 1; 

        while (count < 100) {
            if (num % 7 != 0 || num % 10 == 7) {
                vet[count] = num;
                count++;
            }
            num++;
        }

        System.out.println("100 primeiros naturais atendendo ao critério:");
        for (int i = 0; i < 100; i++) {
            System.out.print(vet[i] + " ");
            if ((i + 1) % 10 == 0) System.out.println(); 
        }
    }
}
