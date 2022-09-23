public class Main {
    public static void main(String[] args) {
/*
        BaseLogger[] baseLoggers = new BaseLogger[]{new EmailLogger(),new DataBaseLogger(),new FileLogger(),new ConsoleLogger()};
        for (BaseLogger logger:baseLoggers) {
            logger.log("Log Mesajı");

        }
*/
        CustomerMenager customerMenager = new CustomerMenager(new FileLogger());
        customerMenager.add();
    }
}