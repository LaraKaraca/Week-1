import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int matematik, fizik, kimya, turkce, tarih, muzik;

        Scanner inp= new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        matematik = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Turkçe Notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Muzik Notunuz : ");
        muzik = inp.nextInt();

        int toplam = (matematik+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam / 6.0;
        System.out.println(sonuc>60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");
    }
}