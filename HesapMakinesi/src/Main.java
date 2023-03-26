import java.util.Scanner;

/*
#Proje Konusu
#Java ile girilen 2 sayı ile kullanıcının seçtiği 4 işlemleri yapabilen bir hesap makinesi yapınız.
*/


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("lütfen işlem yapmak istediğiniz ilk sayıyı giriniz : ");
        double ilkSayi = scanner.nextInt();
        System.out.print("lütfen işlem yapmak istediğiniz ikinci sayıyı giriniz : ");
        double ikinciSayi = scanner.nextInt();
        System.out.print("hangi işlemi yapacağınızı seçiniz: ");
        String islem = scanner.next();

        switch (islem) {
            case "+" -> System.out.println("işlem sonucu: " + (ilkSayi + ikinciSayi));
            case "-" -> System.out.println("işlem sonucu: " + (ilkSayi - ikinciSayi));
            case "*" -> System.out.println("işlem sonucu: " + (ilkSayi * ikinciSayi));
            case "/" -> System.out.println("işlem sonucu: " + (ilkSayi / ikinciSayi));
        }


    }
}