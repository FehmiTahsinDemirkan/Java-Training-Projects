import java.util.Scanner;

//KDV Tutarı Hesaplama
/*
Kullanıdan alınan tutarın KDV'li fiyatını ve KDV tutarını
hesaplayıp ekrana bastıran programı yazın.
(NOT: KDV tutarı %18 olarak alın.
BONUS GELİŞTİRME
Eğer girilen tutar 0 ve 500 arasında ise KDV oranı %18,
tuta 500TL'den büyük ise KDV oranı %8 olarak KDV hesaplayan
programı yazınız.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double tutar,kdv,onlykdv1,onlykdv2;
        System.out.println("Tutarı Giriniz: ");
        tutar= input.nextDouble();
        onlykdv1=(tutar*18)/100;
        onlykdv2=(tutar*8)/100;
        if (tutar<500  ){
            kdv=tutar+(tutar*18)/100;
            System.out.println("Tutar: "+tutar);
            System.out.println("KDV oranı %18");
        System.out.println("KDV tutarı: "+onlykdv1);
            System.out.println("KDV'li fiyat : " + kdv);
        }
        else {
            kdv = tutar + (tutar * 8) / 100;
            System.out.println("Tutar: "+tutar);
            System.out.println("KDV oranı %8");
            System.out.println("KDV tutarı: "+onlykdv2);
            System.out.println("KDV'li fiyat : " + kdv);
        }


    }
}