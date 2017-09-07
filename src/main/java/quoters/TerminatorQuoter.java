package quoters;


import javax.annotation.PostConstruct;

@Profiling
public class TerminatorQuoter implements Quoter {
    @InjectRandomInt(min=2, max=7)
    private int repeat;

    private String message;

    @PostConstruct
    public void init(){
        System.out.println("init method класса TerminatorQuoter");
        System.out.println("Количество повторов: " + repeat);
    }

    public TerminatorQuoter() {
        System.out.println("Конструктор класса");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    @PostProxy
    public void sayQuote() {
        System.out.println("Вызов PostProxy");
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }
}
