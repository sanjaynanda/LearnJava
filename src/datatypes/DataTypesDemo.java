package datatypes;

import java.util.Scanner;

public class DataTypesDemo {

	public static void main(String[] args) {
		short bs=129;
		System.out.println("values of byte b\n"+bs);
		String s="dfjlfsj";
		System.out.println();
		System.out.println(s.codePointAt(1));
		System.out.println("enter a digit:\n");	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a digit:\n");	
		int ab=sc.nextInt();
		System.out.println("enter data is \n"+ab);
		
		int a=34,b=343,c=3435;
		System.out.println(a+" "+b+" "+c);
		
		

	}

}
