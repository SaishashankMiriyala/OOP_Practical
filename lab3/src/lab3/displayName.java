package lab3;

import java.util.Scanner;

public class displayName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name: ");
		String name=sc.nextLine(); 
		for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
	}
}
