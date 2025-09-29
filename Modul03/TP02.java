import java.util.Scanner;

public class TP02 {
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        // Input : nama, jumlah barang, harga per barang
        String nama = input.next();
        int jumlah  = input.nextInt();
        int harga   = input.nextInt();

        // Hitung total belanja
        int total = jumlah * harga;

        // Output sesuai format
        System.out.println("Hi, " + nama + ". Total belanja adalah " + total + " rupiah.");

        input.close();
    }
}