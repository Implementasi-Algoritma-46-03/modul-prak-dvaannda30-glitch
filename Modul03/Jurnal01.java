import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        
        //input
        int N = input.nextInt();
        int pecahan = N / 1000;
        int sisaUang = N % 1000;

        System.out.println(pecahan);
        System.out.println(sisaUang);
    }
}
