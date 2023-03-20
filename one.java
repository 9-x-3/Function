import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		
		
		int num1=5,num2=10,num3=15;
		
		findGreatest(num1,num2,num3);
		findLowest(num1,num2,num3);
		findLowest2(1,2,3);
        	
	}

	public static int findLowest2(int num1, int num2, int num3) {
		// TODO Auto-generated method stub
		return 0;
    	
    	
		
	}


	
	public static void findLowest(int num1, int num2, int num3) {
		// TODO Auto-generated method stub
		
    	if ((num1>num2 )&& (num1>num3)) {
    		System.out.println("The largest number is:" + num1);
    		
    }
    	else if ((num2>num1 )&& (num2>num3)) {
    		System.out.println("The largest number is:" + num2);
    		}
    	else if ((num3>num1 )&& (num3>num2)) {
    		System.out.println("The largest number is:" + num3);
    
    		}
    	
    	
		
	}

	public static void findGreatest(int num1, int num2, int num3) {
		// TODO Auto-generated method stub
		if ((num1<num2 )&& (num1<num3)) {
    		System.out.println("The lowest number is:" + num1);
    		
    }
    	else if ((num2<num1 )&& (num2<num3)) {
    		System.out.println("The lowest number is:" + num2);
    		}
    	else if ((num3<num1 )&& (num3<num2)) {
    		System.out.println("The lowest number is:" + num3);
    
    		}
    	
		
	}

	
	
}
