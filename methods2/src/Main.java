public class Main {
    public static void main(String[] args) {
        int topla = topLa(5, 7);
        String sehir = SehirVer();
        guncelle();
        ekle();
        System.out.println(sehir);
        System.out.println(topla);
        int toplam = topLa2(1,2,3,4,5);
        System.out.println(toplam);
    }

    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");

    }

    public static void guncelle() {
        System.out.println("Güncellendi");

    }

    public static String SehirVer() {
        return "Gaziantep";
    }

    public static int topLa(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }
    //Veriable arguments
    public static int topLa2(int... sayilar) {
        int sum = 0;
        for (int sayi:sayilar) {
            sum+=sayi;
        }
        return sum;
    }

}