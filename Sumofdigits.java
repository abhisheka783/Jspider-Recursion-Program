class Sumofdigits 
{
	public static void main(String[] args) 
	{
		System.out.println("sum= "+sum(123));
	}
	public static int sum(int num)
	{
		if(num>0)
			return num%10+sum(num/10);
		else
			return 0;
	}
}
