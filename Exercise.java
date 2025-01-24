import java.util.Scanner;
public class Exercise {

	public static void main(String[] args) {
		// to check whether the character is upper case or lower case alphabet
		char ch;
		Scanner sc=new Scanner(System.in);
		char cod;
		do {
			System.out.println("please enter a char");
			ch=sc.next().charAt(0);
			if((ch>=('A'))&&(ch<='Z')) {
				System.out.println("ch is a upper case");
				}
			else if((ch>=('a'))&&(ch<=('z'))){
				System.out.println("ch is a lower case");	
			}
			System.out.println("do you want to repeat?if yes pls enter y or n");
			cod=sc.next().charAt(0);
		} 
		while(cod=='y');
		System.out.println("program ends");
		

	}

}