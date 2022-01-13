package record;

import java.util.Scanner;

public class TestSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		MergeSort m1=new MergeSort();
		int[] arr=new int[20];
		int n,i;
		System.out.println("Enter array size:");
		n=sc.nextInt();
		System.out.println("enter array elements:");
		for(i=0;i<n;i++)
		arr[i]=sc.nextInt();
		m1.mergepass(arr,0,n-1);
		System.out.print("The array elements after sorting are:");
		for(i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}

}
