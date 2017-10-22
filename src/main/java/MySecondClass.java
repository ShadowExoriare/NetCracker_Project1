import java.util.Random;

public class MySecondClass {
    private int a;
    private int b;


    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }

    private static Random RANDOM = new Random();

    public void getFirst() {
            this.setA(RANDOM.nextInt(10));
    }


    public void getSecond() {
            this.setB(RANDOM.nextInt(10));

    }
    public void action(){
        System.out.println(this.a * this.b);
    }
}
