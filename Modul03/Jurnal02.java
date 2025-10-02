import java.util.Scanner;
public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner scn = new Scanner(System.in);
        double nilai1 = scn.nextDouble();
        double nilai2 = scn.nextDouble();
        double nilai3 = scn.nextDouble();

        double rataRata = (nilai1+nilai2+nilai3) / 3.0;

        System.out.printf("Nilai rata-rata: %.2f\n" , rataRata);
    }
}
