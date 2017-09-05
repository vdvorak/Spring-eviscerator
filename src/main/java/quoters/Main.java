package quoters;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        while (true){
            Thread.sleep(1000);
//            context.getBean(TerminatorQuoter.class).sayQuote(); //по интерфейсу, а не по классу.
            context.getBean(Quoter.class).sayQuote();
        }

    }
}
