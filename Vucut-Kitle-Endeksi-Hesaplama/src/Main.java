import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu (metre cinsinden) giriniz : ");
        double boy = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        double kilo = inp.nextDouble();

        double indeks = kilo / (boy + boy);
        System.out.println("Vücut Kitle İndeksiniz : " + indeks);
    }
}