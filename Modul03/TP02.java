import java.util.Scanner;

public class TP02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama barang: ");
        String barang = input.nextLine();

        System.out.print("Masukkan jumlah: ");
        int jumlah = input.nextInt();

        System.out.print("Masukkan harga satuan: ");
        int harga = input.nextInt();

        int total = jumlah * harga;

        System.out.println("Barang: " + barang);
        System.out.println("Total belanja adalah " + total + " Rupiah");

        input.close();
    }
}