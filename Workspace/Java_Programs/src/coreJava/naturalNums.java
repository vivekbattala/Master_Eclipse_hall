package coreJava;



public class naturalNums extends Scanner1 {
	//inherits the scanner class for user defined values.
	
	public static void main(String[] args)
	{
		
		naturalNums obj_class= new naturalNums();
		//obj_class.scan();
		obj_class.for_loop();
		obj_class.while_loop();
	}
	
	void for_loop()
	{
		
		int res = 0;
		System.out.print("For Loop Value :");
		scan();
		for(int i=1; i<=num;i++)
		{
			res=res+i;
			
		}
		
		System.out.println(res);
		
	}
	
	void while_loop()
	{
		System.out.print("while Loop Value :");
		scan();
		
		int i=1;
		int res = 0;
	
		while(i<=num)
		{
			res=res+i;
			i++;
		}
		
		System.out.print(res);
		close();
	}
	
	
	
}