import java.util.Scanner;

/*
* Formül : Kilo (kg) / Boy(m) * Boy(m)

Proje Konusu
#Java ile kullanıcıdan boy ve kilo değerlerini alarak yukarıdaki formüle
 göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
 * */
public class Main {
    public static void main(String[] args){
        double kilo,boy;
        double vki;
        Scanner scan =new Scanner(System.in);
        System.out.println("Kilonuzu Yazınız: ");
        kilo = scan.nextInt();
        System.out.println("Boyunuzu yazınız(m): ");
        boy = scan.nextInt();
        vki=kilo/(boy*boy);
        System.out.println("Vücud kitle endeksiniz: "+vki+" idir");

    }
}