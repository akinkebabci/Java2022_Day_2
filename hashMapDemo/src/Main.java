import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> sozluk = new HashMap<String, String>();
        sozluk.put("book", "kitap");                 //Hastable yani sözlüklerde key value şeklinde put anahtar sözcüğü ile ekleme yapabiliriz
        sozluk.put("table", "masa");
        sozluk.put("Computer", "Bilgisayar");
        System.out.println(sozluk.size());          //içersinde kaç adet eleman var demektir

        for (String item : sozluk.keySet()) {
            System.out.println("Eleman - " + item + "  Değer - " + sozluk.get(item));

        }

        sozluk.remove("table");             //remove ile key değerini verdiğmiz zaman o değeri siler
        sozluk.clear();                         //clear ile sözlük objesinin komple siler
        System.out.println(sozluk);
        System.out.println(sozluk.get("book"));

    }
}