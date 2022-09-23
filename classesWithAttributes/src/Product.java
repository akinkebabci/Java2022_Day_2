public class Product {
    //attribute | field
    //Public demek heryerde erişilebilir  Private ise sadece geçerli blokta erişilebilir özel anlamına gelir
    //Default olarak publictir
    //Getter okumak , Setter Yazmak anlamına gelir.

    //Constructor(Yapıcı Blok)
    //Burda oluşturduğumuz değerler Main clasında oluşturmamak için.Constructor lar ile bu şekilde değer verebiliriz
    //Fakat burda parametre olarak istediğimiz değerleri girmek zorundayız
    public Product(int id, String name, String description, double price, int stockAmount) {
        System.out.println("Yapıcı Blok Çalıştı");
        this.id = id;
        this.name = name;
        this.description =description;
        this.price = price;
        this.stockAmount = stockAmount;
    }

    //Overloading yapmış olduk
    public Product(){

    }

    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String kod;

    //Getter sadece değer döndür oku(değer girilmez)
    public int getId() {
        return id;
    }

    //Setter içerisine bir değer girmek zorundayız
    public void setId(int id) {
        this.id = id;
    }

    //Encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() {
        return this.name.substring(0, 2) + id;
    }

}
