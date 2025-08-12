package lab3;
import java.util.Scanner;
public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		  String word = sc.nextLine();
		  int count = 0;
		  for (int i = 0; i < word.length(); i++) {
		            char ch = Character.toLowerCase(word.charAt(i));
		            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		                count++;
		            }
		        }
		  System.out.println(count);

	}

}
