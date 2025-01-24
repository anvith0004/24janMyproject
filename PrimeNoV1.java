
public class PrimeNoV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num= 31,Counter=0;
for(int p=num;p>=1;p--) {
	if(num%p==0)Counter++;
}
if(Counter==3)System.out.println("Yes it is Prime");
else
	System.out.println("not a prime");
	}

}
