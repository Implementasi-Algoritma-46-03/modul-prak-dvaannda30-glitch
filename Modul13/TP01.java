import java.util.Scanner;

public class TP01 {
    public static void sort(float[] a){
        for (int i = 0; i < 10; i++) {
            float key = a[i];
            int j = i - 1;

            while(j >= 0 && a[j] > key){
                a[j + 1] = a[j];
                j -= 1;
            }

            a[j + 1] = key;
        }
    }

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner scan = new Scanner(System.in);

        float[] a = new float[10];
        float[] b = new float[10];

        for (int i = 0; i < 10; i++) {
            a[i]= scan.nextFloat();
        }
        for (int i = 0; i < 10; i++) {
            b[i]= scan.nextFloat();
        }

        sort(a);
        sort(b);

        for (int i = 0; i < 10; i++) {
            if(a[i] == a[a.length - 1]){
                System.out.printf("%.2f", a[i]);
            }
            else{
                System.out.printf("%.2f ", a[i]);
            }
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            if(b[i] == b[b.length - 1]){
                System.out.printf("%.2f", b[i]);
            }
            else{
                System.out.printf("%.2f ", b[i]);
            }
        }

        scan.close();
    }
}