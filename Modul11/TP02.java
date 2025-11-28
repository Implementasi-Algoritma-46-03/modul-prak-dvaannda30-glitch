import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] poin = new int[N];

        for (int i = 0; i < N; i++) {
            if (input.hasNextInt()) {
                poin[i] = input.nextInt();
            } else {
                poin[i] = 0; // fallback jika input kurang
            }
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (poin[j] > poin[i]) {
                    int temp = poin[i];
                    poin[i] = poin[j];
                    poin[j] = temp;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(poin[i]);
            if (i < N - 1) {
                System.out.print(" ");
            }
        }
    }
}
