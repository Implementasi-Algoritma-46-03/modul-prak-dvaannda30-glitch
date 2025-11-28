import java.util.Scanner;

public class TP01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membaca jumlah peserta
        int N = input.nextInt();
        input.nextLine(); // membersihkan buffer

        // Membuat array untuk menyimpan nama peserta
        String[] peserta = new String[N];

        // Input nama-nama peserta sesuai urutan booking
        for (int i = 0; i < N; i++) {
            peserta[i] = input.nextLine();
        }

        // Output sesuai format
        for (int i = 0; i < N; i++) {
            System.out.println("Bulan " + (i + 1) + ": " + peserta[i]);
        }

        input.close();
    }
}
