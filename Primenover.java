
public class Primenover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n=37,r;
 boolean isprime=true;
 int i=2;
 for(;i<n/2;i++) {
	 r=n%1;
	 if(r==0) {
		 isprime=false;
		 break;
	 }
 }
 if(i==n/2)System.out.println("yes");
 else System.out.println("no");
	}

}