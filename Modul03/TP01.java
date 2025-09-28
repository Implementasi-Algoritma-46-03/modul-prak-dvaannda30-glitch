import java.util.Scanner;

public class TP01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: X, Y, N
        int X = input.nextInt();  // tabungan awal
        int Y = input.nextInt();  // tabungan harian
        int N = input.nextInt();  // jumlah hari

        // process
        int total = X + (Y * N);

        // output
        System.out.println(total);
    }
}