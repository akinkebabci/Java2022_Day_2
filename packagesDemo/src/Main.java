
import matematik.DortIslem;
import matematik.Logaritma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int sayi1 = scanner.nextInt();
        System.out.println(sayi1);

        DortIslem dortIslem = new DortIslem();
        dortIslem.topla(12,22);

        Logaritma logaritma = new Logaritma();
        logaritma.logaritmaHesapla();
    }
}