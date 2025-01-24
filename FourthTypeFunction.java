
public class FourthTypeFunction {
 static float anyCountryToIndianRupees(String country,int amt) {
	 float res=0.0f;
	 if(country.equalsIgnoreCase("USA")) {
		 res=amt *78.67f;
	 }
	 else if(country.equalsIgnoreCase("UK")) {
		 res=amt*120.56f;
	 }
	 else if(country.equalsIgnoreCase("UAE")) {
		 res=amt*20.56f;
	 }
	 return res;
		  }
 static int getAmt(){
	 return 100;
 }
	public static void main(String[] args) {
      int usDollars=100,ukPOunds=200,uaeDirams=50;
      float 
      rupees=anyCountryToIndianRupees("USA",getAmt());
      System.out.println("Indian rupees-------.USA"+rupees);
      rupees= anyCountryToIndianRupees("UK",ukPOunds);
      System.out.println("Indian rupees-------.Uk"+rupees);
      rupees= anyCountryToIndianRupees("UAE",uaeDirams);
      System.out.println("indian rupees-------.UAE"+rupees);
	}
}