package abc;

public class operations {

	static int fibo;
	static int naturalnum;
	// operations opt = new operations();

	protected int fibonacci(int fibo) {
		// TODO Auto-generated constructor stub
		System.out.println("Fibo Value is :" + fibo);
		/* This is the Logic for fibonacci Series */
		int res = 0;
		int temp = 0;
		int temp1 = 1;
		for (int i = 0; i <= fibo; i++) {
			System.out.print(temp);
			res = temp + temp1;
			temp = temp1;
			temp1 = res;
		}
		/* This is the Logic for fibonacci Series */
		return fibo;

	}

	protected int naturalNum(int naturalnum) {
		// TODO Auto-generated constructor stub
		System.out.println("Natural Number Value is :" + naturalnum);
		
		int res = 0;
		System.out.print("For Loop Value :");
		
		for(int i=1; i<=naturalnum;i++)
		{
			res=res+i;			
		}
		System.out.println(res);
		
		return naturalnum;
	}
}
