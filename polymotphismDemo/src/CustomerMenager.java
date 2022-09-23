public class CustomerMenager {
    private BaseLogger baseLogger;

    public CustomerMenager(BaseLogger logger){
        this.baseLogger = logger;

    }
    public void add(){
        System.out.println("Müşteri Eklendi");

        this.baseLogger.log("Log Mesajı");
    }
}
