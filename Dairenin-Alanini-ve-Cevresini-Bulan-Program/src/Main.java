import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // degiskenler tanimlandi
        int r;
        int a;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);

        // input
        System.out.println("Yaricapi Giriniz: ");
        r = input.nextInt();

        System.out.println("Merkez aci olcusu giriniz: ");
        a = input.nextInt();

        // Alan hesaplama
        double Alan = ((pi * (r*r) * a) / 360);

        System.out.println("Dairenin Alani: " + Alan);

    }
}