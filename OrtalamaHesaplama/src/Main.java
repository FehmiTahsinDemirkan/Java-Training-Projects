import java.util.Scanner;

//Problem-1
/*
Java ile fizik,matematik,türkçe,kimya, müzik, tarih
derslerinin sınav puanlarını kullanıcıdan alan ve bu derslerin ortalamalarını
hesaplayıp ekrana bastırılan programı yazın.
BONUS !!!
Eğer ortalama 50 nin altındaysa ekrana "Sınıfta kaldı",
50 nin üstündeyse "Sınıfı Geçti" yazdır.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); //Kullanıcıdan veri almamıza olanak sağlar
        int fiz,mat,turk,kim,muz,tar;
        double ortalama;
        System.out.println(" Notunuzu giriniz: ");
        fiz = input.nextInt();
        System.out.println("Matematik Notunuzu giriniz: ");
        mat = input.nextInt();
        System.out.println("Türkçe Notunuzu giriniz: ");
        turk = input.nextInt();
        System.out.println("Kimya Notunuzu giriniz: ");
        kim = input.nextInt();
        System.out.println("Müzik Notunuzu giriniz: ");
        muz = input.nextInt();
        System.out.println("Tarih Notunuzu giriniz: ");
        tar = input.nextInt();
        ortalama = (fiz+mat+turk+kim+muz+tar)/6;
        System.out.println("Ortalamanız : "+ortalama);
        if (ortalama<=50){
            System.out.println("Sınıfta Kaldınız...");
        }
        else
            System.out.println("Sınıfı Geçtiniz...");
    }
}