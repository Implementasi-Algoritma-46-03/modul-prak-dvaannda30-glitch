import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        
        if (N % 6 == 0) {
            System.out.println("Kelipatan Enam");
        } else {
            System.out.println("Bukan kelipatan enam");
        }
    }
}
