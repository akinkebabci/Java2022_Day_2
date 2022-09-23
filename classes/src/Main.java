public class Main {
    public static void main(String[] args) {
        //Referance Type
        CustomerMenager customerMenager = new CustomerMenager();
        CustomerMenager customerMenager1 = new CustomerMenager();  //customerMenager1 isminde bellekte bir yer daha tutuyoruz
        customerMenager = customerMenager1;         //customerMenagerin bellekteki referansı artık customerMenager1 demiş oluyoruz
        customerMenager.add();                      //Bir süre sonra bellekte (new) diyerek oluşturduğumuz customerMenager Java
        customerMenager.remove();                   //garbage collector(çöp toplayıcısı) tarafından silinecektir
        customerMenager.update();           //Bu sebeple new  diyerek oluşturduğumuz değişkenlere dikkat etmemiz gerekir
        customerMenager1.add();

        //value type (değer tipli) int,float,double,float vs..
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;                  //sayi2 nin değeri 10 dedik
        sayi1 = 30;
        System.out.println(sayi2);

        //Referance Type(Referan tip)
        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);

    }

}