public class q1 {
    public static void main(String[] args) {
        int[] A = {1, 0, 5, -2, -5, 7};

        int soma = A[0] + A[1] + A[5];
        System.out.println("Soma de A[0] + A[1] + A[5] = " + soma + "\n");

        A[4] = 100;

        System.out.println("Elementos do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }
}