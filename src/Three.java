import java.util.Scanner;

public class Three {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String x = "testing1";
        String y = "testing";

        System.out.println("Values 1: " + x);

        System.out.println("Values 2: " + y);

        checkValue(x, y);

    }

    private static void checkValue(String one, String two) {
        if(one.equalsIgnoreCase(two)){
            System.out.println("values are equal");
        }else{
            System.out.println("values are not equal");
        }
    }
}
