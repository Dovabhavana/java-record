package record;

public class MergeSort {
	int interchanges;
	void merge(int a[],int lb,int mid,int ub){
		int i,j,k;
		int[] temp=new int[20];
		i=lb;
		j=mid+1;
		k=lb;
		while((i<=mid) && (j<=ub))
		{
			if(a[i]<a[j])
				temp[k++]=a[i++];
			else
				temp[k++]=a[j++];
			
		}
		while(i<=mid)
			temp[k++]=a[i++];
		while(j<=ub)
			temp[k++]=a[j++];
		interchanges++;
		for(i=lb;i<=ub;i++)
			a[i]=temp[i];
		}
	void mergepass(int a[],int lb,int ub) {
		int mid;
		if(lb!=ub) {
			mid=(lb+ub)/2;
			mergepass(a,lb,mid);
			mergepass(a,mid+1,ub);
			merge(a,lb,mid,ub);
			
		}
	}
	int getinterchanges() {
		return interchanges;

}
}
