import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double tutar;
        Scanner inp = new Scanner(System.in);
        System.out.print("Fiyat Giriniz :");
        tutar = inp.nextDouble();

        double kdvTutar = tutar < 1000 ? (tutar * 0.18) + tutar : (tutar * 0.08) + tutar;
        System.out.println("Ürünün KDV'li Tutarı : " + kdvTutar);

    }
}