import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Ankara");
        sehirler.add("Mersin");
        //sehirler.add(1);          //Type güvenliği için String bir array oluşturduğumuz için içersine ancak Stiring bir ifade verebiliriz
        sehirler.add("İzmir");
        sehirler.add("İstanbul");
        Collections.sort(sehirler);

        for (String sehir:sehirler) {
            System.out.println(sehir);
        }

    }
}