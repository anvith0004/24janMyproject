
import java.util.Scanner;
public class FourthTypeFunction1 {
	static float m1(String Country,int Amt) {
		 float res=0.0f;
		 if(Country.equalsIgnoreCase("USA")) {
			 res=Amt *78.67f;
		 }
		 else if(Country.equalsIgnoreCase("UK")) {
			 res=Amt*120.56f;
		 }
		 else if(Country.equalsIgnoreCase("UAE")) {
			 res=Amt*20.56f;
		 }
		 return res;
			  }
	 static int getAmt(){
		 return 100;
	 }
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter country.......");
	 String Country=sc.next();
	 String cC= getAmtDetails(Country);
	 System.out.println("please enter \n"+cC);
	 if(cC.equalsIgnoreCase("Country not found")) {
	 System.out.println("not able to process");
 }
 else {
	 int amt=sc.nextInt();
	 System.out.println("For this "+Country+
			 "\n this amt= amt+ indian amt="
			 +m1(Country,amt));
 }
 }
static String getAmtDetails(String Country) {
	String res="";
	if(Country.equalsIgnoreCase("USA")) {
		res="DOllars";
	}
	else if(Country.equalsIgnoreCase("UK")) {
		res="Pounds";
	}
	else if(Country.equalsIgnoreCase("UAE")) {
		res=("diram");
	}
	else
  {
		res="Country not FOund";
	}
	return res;
	}
}


