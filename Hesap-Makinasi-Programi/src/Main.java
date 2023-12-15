import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("İşlem seçin: ");
        System.out.println("1. Toplama: ");
        System.out.println("2. Çıkarma: ");
        System.out.println("3. Çarpma: ");
        System.out.println("4. Bölme: ");

        int secim = scanner.nextInt();

        System.out.println("Sayıları girin: ");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        switch (secim) {
            case 1:
                int toplam = sayi1 + sayi2;
                System.out.println("Sonuç" + toplam);
                break;

            case 2:
                int fark = sayi1 - sayi2;
                System.out.println("Sonuç: " + fark);
                break;

            case 3:
                int carpim = sayi1 * sayi2;
                System.out.println("Sonuç: " + carpim);

            case 4:
                if (sayi2!= 0){
                double bolum = (double) sayi1 / sayi2;
                System.out.println("Sonuç: " + bolum);
            }else{
                System.out.println("Bölme işlemi için ikinci sayı sıfır olamaz.");
            }
            break;
            default:
                System.out.println("Geçersiz bir seçim yaptınız.");
        }
        scanner.close();

    }
}