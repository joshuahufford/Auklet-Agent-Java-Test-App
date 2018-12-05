import io.auklet.agent.Auklet;

class AukletTest {
    public static void main(String []arg) {
        Auklet.init("", "");
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
            if(i == 990) {
                try {
                    System.out.print(i / 0);
                } catch (ArithmeticException e) {
                    Auklet.exception(e);
                    System.out.println("Divide By Zero Error");
                    System.out.println(e);
                }
            }
        }
    }
}