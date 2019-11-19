package why_generic;
import java.util.Scanner;

class SeqSearch{
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		
		while(true) {
			if(i==n)
				return -1;
			if(a[i]==key)
				return i;
			i++;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("¿ä¼Ú¼ö : ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
	}
	
	
}
