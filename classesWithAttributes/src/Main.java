public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Hp Laptop 15","i5 16 Gb Ram",5005,3);    //New prodct dediğimiz zamna oluşturduğumuz constructor çalışacaktır
/*        product.setName("Hp Laptop 15");
        product.setId(1);
        product.setDescription("i5 16 Gb ram"); -->New Procuct dedğimiz zaman Product clasında parametre olarak istediğiz değerleri
        product.setPrice(5000);                     parametre olarak girebiliriz.Fakat burda girmekte isteyebiliriz.Bu durumda devreye
        product.setStockAmount(3);                  Overloading giriyor.product clası içerisinde oluşturduğumuz yapıcı bloğun altına Productu
        product.getKod();                           parametresiz olarak overloading yaparsak içerisine değer girmediğimiz zaman Hata vermeyecektir

        */
        Product product1 = new Product();       //Yani Artık overloading yaptığımız için paramertre girmediğimiz zaman hata vermiyor
        product1.setId(2);
        product1.setName("Lenovo S34");
        product1.setDescription("i7 32 Gb Ram");
        product1.setPrice(7800);
        product1.setStockAmount(5);
        product1.getKod();


        ProductMenager productMenager = new ProductMenager();
        productMenager.add(product);
        System.out.println(product.getKod());
        productMenager.add(product1);
        System.out.println(product1.getKod());

    }
}