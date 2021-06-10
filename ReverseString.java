class ReverseString 
{
	public static void main(String[] args) 
	{
		String s="Hello";
		String rev=reverse(s.length()-1,s);
		System.out.println(rev);
	}
	public static String reverse(int index,String s)
	{
		String rev="";
		if(index>=0)
			return rev+s.charAt(index)+reverse(index-1,s);
		return rev;
	}
}
