
public class Pattern5 {
	public static void main(String[] args) {
		int v =0;
		for(int r = 1;r<=4;r++) {
			for(int c=1;c<=r;c++) {
				if(c==1) {
					if((r+c) % 2 ==0) {
						v=1;
						System.out.print(v+" ");
					}
					else {
						v =0;
						System.out.print(v+" ");
					}
				}
				else {
					if(v ==0) v =1;
					System.out.print(v+" ");
				}
			}
			System.out.println();
		}
	}
}