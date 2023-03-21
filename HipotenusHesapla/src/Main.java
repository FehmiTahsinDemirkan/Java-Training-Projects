import java.util.Scanner;

//HİPOTENÜS HESAPLAMA
/*
kullanıcıdan dik kenarlarının uzunluğunu alan ve üçgene
ait Hipotenüsü hesaplayan programı yazın.
BONUS !!!
Hipotenüs teoremi ile bulduğunuz 3.kenar uzunluğu ile
birlikte üçgenin alanını hesaplayan programı yazınız.
Çevre=2.u
u=(a+b+c)/2
Alan*Alan=u*(u-a)*(u-b)*(u-c)
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1.Kenarı giriniz : ");
        double a = scan.nextInt();
        System.out.println("2.Kenarı giriniz : ");
        double b = scan.nextInt();
            //Math.sqrt karesini almak için kullanmak.
        double c =Math.sqrt((a*a)+(b*b));
        System.out.println("3.Kenar(Hiponetüs) :"+c);
        double Cevre,u,Alan = 0,A;
        Cevre=a+b+c;
        u=(a+b+c)/2;

        System.out.println("Üçgenin Çevresi : "+Cevre);

    }
}