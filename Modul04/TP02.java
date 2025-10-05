import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input total transaksi
        int N = input.nextInt();

        // hitung diskon (jika ada)
        double diskon = 0;
        if (N > 2 00000) {
            diskon = N * 0.05; // 5%
        }

        // total setelah diskon
        double total = N - diskon;

        // hitung PPN 11% dari total
        double ppn = total * 0.11;

        // total akhir dibayar
        double totalBayar = total + ppn;

        System.out.println("Transaksi = " + N);
        if (diskon > 0) {
            System.out.println("Total = " + N + " - " + (int)diskon);
        } else {
            System.out.println("Total = " + N);
        }
        System.out.println("Ppn 11% = " + ppn);
        System.out.println("Total dibayar = " + totalBayar);
    }
}
