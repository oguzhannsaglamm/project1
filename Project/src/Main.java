

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunuzu girin :");
        mat = scanner.nextInt();

        System.out.print("Fizik notunuzu girin :");
        fizik = scanner.nextInt();

        System.out.print("Kimya notunuzu girin :");
        kimya = scanner.nextInt();

        System.out.print("Türkçe notunuzu girin :");
        turkce = scanner.nextInt();

        System.out.print("Tarih notunuzu girin :");
        tarih = scanner.nextInt();

        System.out.print("Müzik notunuzu girin :");
        muzik = scanner.nextInt();


        int toplam = mat + fizik + kimya + tarih + turkce + muzik;

        double ortalama = toplam / 6;

        System.out.println("Ortalmanız :" + ortalama);

        boolean kosul = ortalama > 60;
        String gecti = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println(gecti);

    }






}

