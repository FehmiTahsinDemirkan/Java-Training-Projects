import java.util.Scanner;

/*
#Proje Konusu
        #Java ile gidilen kilometre verisine göre taksimetre tutarını hesaplayıp ekrana yazdıran programı yazın.

        -Taksimetre kilometre başına 2.20 TL tutmaktadır.
        -Kısa mesafe tutarı 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        -Taksimetre açılış ücreti 10 TL'dir.
*/

import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("km giriniz:");
        int km= scan.nextInt();
        double ucret=10+(km*2.20);
        if (ucret<20) {
            System.out.println("ücretiniz 20tl.dir");
        }else
            System.out.println("Ücretiniz=" + ucret);
    }
}