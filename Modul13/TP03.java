import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int[] b = new int[a];

        for (int i = 0; i < a; i++) {
            b[i] = scan.nextInt();
        }

        int c = scan.nextInt();
        boolean isFound = false;

        for (int i = 0; i < a; i++) {
            if(b[i] == c){
                System.out.printf("Ditemukan di indeks ke-%d", i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.print("Tidak ditemukan");
        }

        scan.close();
    }
}