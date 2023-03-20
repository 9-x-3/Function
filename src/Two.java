import java.util.Scanner;

public class Two {

    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        num1=sc.nextInt();

        System.out.println("Enter second number:");
        num2=sc.nextInt();
        result(num1,num2);


    }

    private static void result(int num1, int num2) {
        int n=20;
        // TODO Auto-generated method stub
        int val1 = Math.abs(num1-n);
        int val2 = Math.abs(num2-n);

        int result1 = (val2==val1) ? 0 :  (val1 <val2 ? num1 : num2) ;
        System.out.println("The nearest number to 20 is: " + result1);
    }
}
