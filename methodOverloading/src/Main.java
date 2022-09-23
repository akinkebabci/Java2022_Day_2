public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.topla(2,3)); //hem aynı method içerisinde iki adate parametre verebildik
        System.out.println(dortIslem.topla(4,5,6));//aynı zamanda içerisine üç adet parametre verebildik
    }
}