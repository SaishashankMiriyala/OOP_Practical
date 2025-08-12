package prgs;
import java.util.Scanner;
public class discount_percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double bill_amount, discount, total_amount;200
		  System.out.println("Enter Total Bill: ");
		  Scanner bill = new Scanner(System.in);
		  System.out.println("Enter GST : ");
		  Scanner gst = new Scanner(System.in);
		  System.out.println("Enter Maintainence amount: ");
		  Scanner maintainence = new Scanner(System.in);
		  
		  bill_amount = bill.nextDouble() + gst.nextDouble() + maintainence.nextDouble();
		  
		  
		  if(bill_amount > 1000) {
		   discount = bill_amount * 0.10;
		  }
		  else {
		   discount = bill_amount * 0.05;
		  }
		  
		  System.out.println("Discount Amount: " +discount);
		  total_amount = bill_amount - discount;
		  System.out.print("Total Bill: " +total_amount);
	}

}
