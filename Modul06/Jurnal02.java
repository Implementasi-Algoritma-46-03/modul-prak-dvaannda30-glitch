import java.util.Scanner;
public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        String lagu = input.nextLine();
        lirik(lagu);
    }
    

    private static void lirik(String lagu) {
        String lirik = lagu;
        int teks = lirik.length();
        switch (teks % 5) {
            case 0:
                lirik = lirik.replaceAll("[AIUEOaiueo]", "a");
                break;
            case 1:
                lirik = lirik.replaceAll("[AIUEOaiueo]", "e");
                break;
            case 2:
                lirik = lirik.replaceAll("[AIUEOaiueo]", "i");
                break;
            case 3:
                lirik = lirik.replaceAll("[AIUEOaiueo]", "o");
                break;
            case 4:
                lirik = lirik.replaceAll("[AIUEOaiueo]", "u");
                break;
        }
        System.out.println(lirik);
    }
}
