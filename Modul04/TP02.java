import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        double diskon = 0;
        if (N > 200000) {
            diskon = N * 0.05; // 5%
        }

        double total = N - diskon;
        double ppn = total * 0.11;
        double totalBayar = total + ppn;
        
        System.out.println("Transaksi = " + N);
        if (diskon > 0) {
            System.out.println("Total =" + N + " - " + (int)diskon);
        } else {
            System.out.println("Total = " + N);
        }
        System.out.println("Ppn 11% = " + ppn);
        System.out.println("Total dibayar = " + totalBayar);
    }
}
