import java.util.Scanner;
public class bridge {

	void cross(int arr[],int n) {
		int min = 0;
		for (int i=0;i<n;i++) {
			if(min>arr[i])
				min=i;
		}
		int sum=0;
		for(int i=0;i<n;i++ ) {
			if(i!=min) {
				if(i==n-1) {sum=sum+arr[i];}
				else {
			sum=sum+(arr[min]+arr[i]);
			}}
		}
		System.out.println("Total time taken="+sum+"mins");
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of people");
		int n=sc.nextInt();
		int[] time=new int[n];
		System.out.println("Enter the time required for each");
		for(int i=0;i<n;i++) {
			time[i]=sc.nextInt();
		}
		bridge a=new bridge();
		a.cross(time, n);

		sc.close();
	}

}
