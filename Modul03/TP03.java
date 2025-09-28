import java.util.Scanner;

public class TP03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y;

        System.out.print("Masukkan nilai x: ");
        x = input.nextInt();

        System.out.print("Masukkan nilai y: ");
        y = input.nextInt();

        if (y == 0) {
            System.out.println("Tidak bisa dibagi dengan nol!");
        } else {
            System.out.println("Hasil pembagian: " + (x / y));
            System.out.println("Sisa pembagian  : " + (x % y));
        }

        input.close();
    }
}