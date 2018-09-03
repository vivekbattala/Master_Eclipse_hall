package corejava;

public class Avg_array {

	static int[] arr={2,4,5,6,8,9};
	public static void main(String args [])
	
	{
		Avg_array ar=new Avg_array();
		ar.Avg();
		System.out.println("viv"+ arr[2]);
	}
	
	public void Avg()
	{
		int a=arr.length;
		int b = 0;
		for(int i=0; i < a; i++)
		{
			//System.out.println("arr"+ a+arr[i]);
			System.out.println(b= b+arr[i]);
			//b= b+arr[i];
		}
		int avg= b/a;
		System.out.println(avg+"last");
	}
}
