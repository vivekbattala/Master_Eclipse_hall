/**
 * 
 */
package coreJava;

import java.util.Scanner;

/**
 * @author Vivek
 *
 */
public class Scan_TernaryOperator {

	int first,sec,third;
	int temp,result;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scan_TernaryOperator classObj= new Scan_TernaryOperator();
		classObj.scanner();
		//System.out.println("vivek ternary operator");
	}
	
	public void scanner()
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the values");
		first=scan.nextInt();
		sec=scan.nextInt();
		third=scan.nextInt();
		
		temp= (first<2) ? first:third; 
		System.out.println(temp);
	}

}
