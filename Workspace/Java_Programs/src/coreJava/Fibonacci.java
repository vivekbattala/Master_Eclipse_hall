package coreJava;

public class Fibonacci extends Scanner1 {

	
	public static void main(String[] args)
	
	{
		Fibonacci fb=new Fibonacci();
		scan();
		
		int res=0;
		int temp = 0;
		int temp1 = 1;
		for(int i=0;i<=num;i++)
		{
			System.out.print(temp);
			res=temp+temp1;
			temp=temp1;
			temp1=res;
	}
}
}
