import java.util.*;

public class Grade_Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter no. of grades:");
		n = sc.nextInt();
		
		int grade[] = new int[n] , sum = 0;
		
		System.out.println("Enter marks of each grade");
		for(int i=0;i<n;i++) {
			grade[i] = sc.nextInt();
		}
		for(int i =0 ; i<n ;i++)
			sum += grade[i];
		int avg = sum/n;
		System.out.println(avg);
		

	}

}

