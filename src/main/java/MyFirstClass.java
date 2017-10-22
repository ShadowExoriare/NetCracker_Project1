
public class MyFirstClass {
    public static void main(String[] s){
        int i, j;
        for (i = 1; i <= 8; i++) {
            for(j = 1; j <= 8; j++) {
                MySecondClass o = new MySecondClass();
                o.getFirst();
                o.getSecond();
                o.action();
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}

