import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //createFile();
        //getFileInfo();
        readFile();
        writeFile();
        readFile();
    }

    public static void createFile() {
        File file = new File("C:\\Users\\akin\\Desktop\\Benim Klasör\\Yazılım\\java\\java2022Odev_2\\Files\\students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya Oluşturuldu");
            } else {
                System.out.println("Dosya zaten MEvcut");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getFileInfo() {
        File file = new File("C:\\Users\\akin\\Desktop\\Benim Klasör\\Yazılım\\java\\java2022Odev_2\\Files\\students.txt");
        if (file.exists()) {                                     //Dosya ilgili yolda varsa True yoksa False Döndürür                                //
            System.out.println("Dosya Adi : " + file.getName());   //Dosya ismini oluşturur
            System.out.println("Dosya Yolu : " + file.getAbsoluteFile()); //Dosya yolunu okumak
            System.out.println("Dosya Klasör Adresi : " + file.getParentFile());
            System.out.println("Dosya Boyutu : " + file.length());       //Dosyanın boyutunu gösterir
            System.out.println("Dosya Yazılabilirmi : " + file.canWrite());       //Dosya Yazılabilirmi
            System.out.println("Dosya Okunabilirmi : " + file.canRead());       //Dosya Okunabilrmi

        }
    }
    public static void readFile(){
        File file = new File("C:\\Users\\akin\\Desktop\\Benim Klasör\\Yazılım\\java\\java2022Odev_2\\Files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line =reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(
                    "C:\\Users\\akin\\Desktop\\Benim Klasör\\Yazılım\\java\\java2022Odev_2\\Files\\students.txt",true));
            writer.newLine();                //Yeni satır Oluştur demek
            writer.write("Akın\nKebabcı\nMerhaba Dünya");
            System.out.println("Dosyaya Yazıldı...");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}