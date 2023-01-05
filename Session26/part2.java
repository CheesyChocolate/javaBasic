import java.util.*;

class Kitap {
    String adi;
    int  isbnno;
    int basimyili;
    String yayimevi;
    String[] yazaradi;  // birden fazla olabilir.

    static Kitap KitapOku() {
        Kitap k=new Kitap();
        Scanner girdi = new Scanner(System.in);

        System.out.println("Kitabin Adini Giriniz");
        k.adi=girdi.nextLine();

        System.out.println("Kitabin ISBN Giriniz");
        k.isbnno=girdi.nextInt();

        System.out.println("Kitabin Yayimevini Giriniz");
        k.yayimevi=girdi.nextLine();

        System.out.println("Basim Yilini Giriniz");
        k.basimyili=girdi.nextInt();

        System.out.println("Yazar Sayısını Giriniz");

        int yazarsayisi=girdi.nextInt();
        k.yazaradi = new String[yazarsayisi];

        for (int i=0; i<yazarsayisi; i++) {
            int sira = i+1;
            System.out.println(sira+" nci yazari giriniz");
            String yazar = girdi.next();
            k.yazaradi[i]=yazar;
        }
        System.out.println();
        System.out.println();

	girdi.close();
        return k;
    }

    static void KitapAta(Kitap[] kitap){
        for (int i = 0; i<3; i++) {
        	System.out.println ((i+1)+" nci Kitap Bilgilerini Giriniz");
		kitap[i]=KitapOku();
            }
    }


    static void KitapYazdir(Kitap[] k, String str) {
        for (int i = 0; i<k.length; i++) {
		Kitap kitap=k[i];
		for (int j = 0; j<kitap.yazaradi.length; j++)
                	if (str.equalsIgnoreCase(kitap.yazaradi[j])) {
                		System.out.println (kitap.isbnno+" " +kitap.adi);
				break;
			}
	}
    }
}

public class part2	{

    public static void main(String[] args) {
     	Kitap[] Kutuphane = new Kitap[3];
    	Kitap araci = new Kitap();
    	araci.KitapAta(Kutuphane);
    	araci.KitapYazdir(Kutuphane, "a");
    }
}
