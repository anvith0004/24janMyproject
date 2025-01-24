
import java.util.Scanner;
public class AlphaorInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char ch;
Scanner input=new Scanner(System.in);
System.out.println("enter a char");
ch=input.next().charAt(0);
if((ch>='a' && ch<='z')||(ch >='A'&& ch<='Z'))
	System.out.println("is an alphabet");
else if((ch >='0' && ch<='9')) {
	System.out.println("is an integer");
}
else {
	System.out.println("is a special character");
}
	}
}

