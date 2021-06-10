class Linearsearch 
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40,50};
		if(linear(a,0,50))
			System.out.println("found");
		else
			System.out.println("Not Found");
	}
	public static boolean linear(int[] a,int i,int key)
	{
		if(i>=a.length)
			return false;
		else if(a[i]==key)
			return true;
		else
			return linear(a,i+1,key);
	}
}
