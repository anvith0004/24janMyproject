package MyProject;

public class Program1 {
	static void arRR(int[] x) {
		int len =x.length;// 5
		int arrlen =len-1;//4
		int t=x[arrlen];
		// num[4]=num[3]
		//num[3]=num[2]
		//num[2]=num[1]
		//num[1]=num[0]
		for (int i = arrlen; i>=1; i--) {
			x[i]=x[i-1];
		}
		x[0]=t;
		System.out.println("\n after 1 right notation \n");
		for (int i=0;i<=arrlen;i++) {
			System.out.print(x[i]+"  ");
		}
	}
	public static void main(String[]args) {
		
			int[]num= {10,20,30,40,50};
			System.out.println("Befoe right notation");
			for (int i =0; i< num.length; i++) {
				System.out.print(num [i]+"   ");
			}
			arRR(num);
			arRR(num);
			arRR(num);
			
			
				
			}
		
		
		
	}


