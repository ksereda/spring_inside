package my_context;

import javax.annotation.PostConstruct;

public class InformationTable implements Quoter {

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;
    private String message;

    @PostConstruct
    public void init() {
        System.out.println("Phase 2");
        System.out.println(repeat);
    }

    public InformationTable() {
        System.out.println("Phase 1");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void sayQuote() {
        System.out.println("Phase 3");
        for (int i = 0; i < repeat; i++) {
            System.out.println("message " + message);
        }
    }

}
