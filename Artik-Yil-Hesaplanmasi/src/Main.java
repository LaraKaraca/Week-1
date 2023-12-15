import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // degisken tanimlandı
        int year;

        Scanner input = new Scanner(System.in);

        System.out.print("Bakılmasını istediginiz yılı giriniz: ");
        year = input.nextInt();

        // kosul tanımlamasi
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " yılı artık yıldır.");
        } else {
            System.out.println(year + " yılı artık yıl degildir.");
        }
    }
}