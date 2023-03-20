import java.util.Scanner;

public class Four {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.println("charge of" + 5 + " is " + charge(5));
        System.out.println("charge of" + 10 + " is " + charge(10));
        System.out.println("charge of" + 18 + " is " + charge(18));
        System.out.println("charge of" + 20 + " is " + charge(20));

    }

    private static int charge(int one) {
        int x = 0;

        if(one<=10){
            x = 2;
        } else if (one > 10 && one < 20) {
            x = 4;
        } else if (one >= 20) {
            x=6;
        }


        return x;


    }
}
