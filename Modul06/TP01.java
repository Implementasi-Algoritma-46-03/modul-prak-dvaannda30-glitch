import java.util.Scanner;

public class TP01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double suhu1 = input.nextDouble();
        double suhu2 = input.nextDouble();
        double suhu3 = input.nextDouble();

        // F ke C
        double c1 = konversiKeCelcius(suhu1);
        double c2 = konversiKeCelcius(suhu2);
        double c3 = konversiKeCelcius(suhu3);

        // F ke C
        double r1 = konversiKeReamur(suhu1);
        double r2 = konversiKeReamur(suhu2);
        double r3 = konversiKeReamur(suhu3);

        System.out.printf("Celcius: %.2f %.2f %.2f%n", c1, c2, c3);
        System.out.printf("Reamur: %.2f %.2f %.2f%n", r1, r2, r3);
    }

    //F ke C
    private static double konversiKeCelcius(double suhuFahrenheit) {
        return (suhuFahrenheit - 32) * 5.0 / 9.0;
    }

    //F ke R
    private static double konversiKeReamur(double suhuFahrenheit) {
        return (suhuFahrenheit - 32) * 4.0 / 9.0;
    }
}