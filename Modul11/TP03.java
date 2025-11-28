import java.util.Scanner;

public class TP03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kalimat = input.nextLine();

        kalimat = kalimat.trim();

        if (kalimat.isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] kata = kalimat.split("\\s+");

        System.out.println(kata.length);
    }
}