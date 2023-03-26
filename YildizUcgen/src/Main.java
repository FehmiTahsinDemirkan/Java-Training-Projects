/*
Proje Konusu
        #Java ile kullanıcı girdiği değer kadar yıldızlar ile eşkenar üçgen oluşturan programı yazın.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Üçgenin yüksekliğini giriniz: ");
        int yukseklik = input.nextInt();

        for (int satir = 1; satir <= yukseklik; satir++) {

            // Boşlukları ekle
            for (int bosluk = 1; bosluk <= yukseklik - satir; bosluk++) {
                System.out.print(" ");
            }

            // Yıldızları ekle
            for (int yildiz = 1; yildiz <= satir * 2 - 1; yildiz++) {
                System.out.print("*");
            }

            // Bir alt satıra geç
            System.out.println();
        }
    }
}
