import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList sayilar = new ArrayList();
        //System.out.println(sayilar.size());  //size bize dizinin içerisinde kaç tane elman olduğunu VERİR
        sayilar.add(5);                      //get fonksiyonu ile dizi içerisine bir elemen ekledik
        sayilar.add(10);
        sayilar.add("Ankara");                  //İçerisine string de verebiliriz
        //System.out.println(sayilar.size());
        //System.out.println(sayilar.get(2));     //get girdiimiz değerdeki indexte hangi elemen olduunu döndürür
        //sayilar.set(0,20);                      //set fonksiyonu ise verdiğmiz değerin indexinde ki elemanı ikinci verdiğimiz değerle değiştiriyor
        //System.out.println(sayilar.get());    //20.index olmadıüı için hata dönecektir
        //System.out.println(sayilar.indexOf(10));//indexOf fonksiyonu içerisine girdiğimiz değer kaçıncı indexte alamıı verir
        //sayilar.remove(2);                 //remove ile içerisine girdiğimiz indexteli değeri siler
        //sayilar.remove("Ankara");           //İçerisine girdiğimiz elemanı dizi içerisinde bulup siler
        //sayilar.clear();                        //sayilar dizisinin içindeki tüm elemanları siler


        for (Object i:sayilar) {           //Array list bir obje olduğu için int vs. olarak değil obje olarak gezmemiz gerekiyor
            System.out.println(i);
        }


    }
}