import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
       Scanner input = new Scanner(System.in);
       //input
       int n = input.nextInt();
       int t = input.nextInt();

       //process
       int totalOrang = t + 1;
       int bagi       = n / totalOrang;
       int sisa       = n % totalOrang;

       //output
       System.out.println(bagi);
       System.out.println(sisa);
    }
}