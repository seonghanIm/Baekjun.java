package step3;
import java.util.Scanner;
public class N2742 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int S = N;
		for(int i=0;i<S;i++)
		{
			System.out.println(N-i);
			
		}
		sc.close();

	}

}
