package prgs;
import java.util.Scanner;
public class squareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a Number: ");
      int n=sc.nextInt();
      for(int i=1;i<=n;i++) {
    	  System.out.println("Square root of " + i + " is " + Math.sqrt(i));
      }
      sc.close();
	}

}
