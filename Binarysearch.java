class Binarysearch 
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40,50};
		if(binary(a,0,a.length-1,50))
			System.out.println("found");
		else
			System.out.println("Not Found");
	}
	public static boolean binary(int[] a,int low,int high,int key)
	{
		int mid=(low+high)/2;
		if(low>high)
			return false;
		else if(key==a[mid])
			return true;
		else if(key>a[mid])
			return binary(a,mid+1,high,key);
		else
			return binary(a,low,mid-1,key);
	}
}