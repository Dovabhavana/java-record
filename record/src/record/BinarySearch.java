package record;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[20];
		int i,middle,low=0,high,k,n;
		System.out.println("Enter array size:");
		n=sc.nextInt();
		System.out.println("Enter array elements:");
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter element to be searched:");
		k=sc.nextInt();
		high=n-1;
		while(low<=high) {
			middle=(low+high)/2;
			if(arr[middle]==k)
			{
				System.out.println("Element founded at "+middle+" index position");
				break;
			}
			else if(arr[middle]<k) {
				low=middle+1;
				
			}
			else {
				high=middle-1;
			}
			
		}
		if(low>high) {
			System.out.println("Element not founded in the given array of elements");
		}
		

	}

}
