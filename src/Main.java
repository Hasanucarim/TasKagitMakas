import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen İsminizi Giriniz");

        String isim = scan.nextLine();

        System.out.println("Hoş geldiniz " + isim);

        System.out.println("Şimdi sizinle Taş Kağıt Makas Oynayacağız");
        System.out.println("...............................................");

        String Bil = "";
        String Kullanici = "";

        int computer = 0;
        int user = 0;

while (user < 3 && computer<3 ) {
    Random B = new Random();
    int Random = B.nextInt(3);

    switch (Random) {
        case 0:
            Bil = "Tas";
            break;
        case 1:
            Bil = "Kagit";
            break;
        case 2:
            Bil = "Makas";
            break;

    }


    System.out.println("Bilgisayarın Seçimi: " + Bil);

    System.out.println("Tas için 0, Kagit için 1, Makas için 2 yazınız");
    int kullaniciInput = scan.nextInt();
    switch (kullaniciInput) {
        case 0:
            Kullanici = "Tas";
            break;
        case 1:
            Kullanici = "Kagit";
            break;
        case 2:
            Kullanici = "Makas";
            break;
    }
    System.out.println("Sizin Seçiminiz: " + Kullanici);

    if (Bil.equals("Tas")) {
        if (Kullanici.equals("Tas")) {
            System.out.println("Durum Berabere");

        } else if (Kullanici.equals("Kagit")) {
            System.out.println("Kazandınız");
            user++;

        } else {
            System.out.println("Kaybettiniz");
            computer++;
        }
    } else if (Bil.equals("Kagit")) {
        if (Kullanici.equals("Tas")) {
            System.out.println("Bilgisayar kazandı");
            computer++;

        } else if (Kullanici.equals("Kagit")) {
            System.out.println("Durum Berabere");

        } else {
            System.out.println("Kaybettiniz");
            computer++;
        }
    } else if (Bil.equals("Makas")) {
        if (Kullanici.equals("Tas")) {
            System.out.println("Kazandınız");
            user++;

        } else if (Kullanici.equals("Makas")) {
            System.out.println("Durum Berabere");

        } else {
            System.out.println("Kaybettiniz");
            computer++;
        }
    }


            }
if (user>computer){
    System.out.println("User = " + user + "  ***  " + "computer = " + computer);
    System.out.println("Kazandınız");

} else if (computer>user)  {
    System.out.println("User = " + user + "  ***  " + "computer = " + computer);
    System.out.println("Kaybettiniz");

        } else {
    System.out.println("User = " + user + "  ***  " + "computer = " + computer);
    System.out.println("Beraber Kaldınız");

}

        }

    }
