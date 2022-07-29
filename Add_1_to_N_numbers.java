import java.util.Scanner;

public class Add_1_to_N_numbers {
	static void calculateSum(int n) {
		int total=0;
		for(int i=1;i<=n;i++) {
			total+=i;
		}
		System.out.println("Total: "+total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter limit: ");
		int n=sc.nextInt();
		sc.close();
		calculateSum(n);
	}

}
