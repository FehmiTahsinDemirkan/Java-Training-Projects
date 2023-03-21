import java.util.Scanner;

public class SepetTutariHesaplama {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double kavunKilo = 1.5;
        double karpuzKilo = 2.55;
        double uzumKilo = 2.5;
        double domatesKilo = 0.95;
        double salatalikKilo = 3.14;

        System.out.println("Lütfen aldığınız sebzelerin kg.larını giriniz");

        double toplam = 0;

        System.out.println("Kavun kaç kg=");
        double A = scan.nextDouble();
        double Kavun = (kavunKilo * A);
        System.out.println("Kavun toplam=" + Kavun);


        System.out.println("Karpuz kaç kg=");
        double B = scan.nextDouble();
        double Karpuz = (karpuzKilo * B);
        System.out.println("Karpuz toplam=" + Karpuz);


        System.out.println("Üzüm kaç kg=");
        double C = scan.nextDouble();
        double Uzum = (uzumKilo * C);
        System.out.println("Üzüm toplam=" + Uzum);

        System.out.println("Domates kaç kg=");
        double D = scan.nextDouble();
        double Domates = (uzumKilo * A);
        System.out.println("Domates toplam=" + Domates);

        System.out.println("Salatalık kaç kg=");
        double E = scan.nextDouble();
        double Salatalik = (salatalikKilo * A);
        System.out.println("Salatalık toplam=" + Salatalik);


        toplam = (Kavun + Karpuz + Uzum + Domates + Salatalik);
        System.out.println("Toplam Ödemeniz Gereken tutar=" + toplam + "tl");

    }
}
