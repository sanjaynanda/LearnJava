package learnstring;

import java.util.Arrays;

public class StringDemo {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s="sanjay.nanda@gmail.com";
		
		System.out.println("String before splitting:\n"+s);
		
		/*System.out.println("before trimming the string:\n"+s);
		String s1=s.trim();
		System.out.println("after trimming the string:\n");
		System.out.println(s1);
		
		System.out.println(s1.contains("Ja"));
		System.out.println(s1.contentEquals("kfd ja"));
		System.out.println(s1.replace("kk","g"));
		System.out.println(s1.substring(0,2));
		
		System.out.println(s1.subSequence(0, 8));
		
		
		
		System.out.println(s1.length());
		System.out.println(s.stripIndent());
		
		System.out.println("String after splitting:\n");
		String []a=s.split("@");
		for(String su:a)
		{
			System.out.println(su);
		}

		
		String amount="$15,30,55";
		System.out.println("original string:\n"+amount);
		System.out.println("string after replacing ");
		System.out.println(amount.replace("$", "").replace(",",""));
		
		String s3="abc,123@xyz";
		System.out.println("string before splitting: "+s3);
		System.out.println("string after splitting: ");
		System.out.println("first element:"+s3.split(",")[0]);
		System.out.println("second element:"+s3.split(",")[1].split("@")[0]);
		System.out.println("third element :"+s3.split("@")[1]);
		*/
		
		
		String s1="welcome ";
		String s2="to java ";
		String s3="programming";
		System.out.println("concat s1 and s2");
		System.out.println(s1+s2);
		System.out.println("concat s1 and s2 and s3");
		System.out.println(s1+s2+s3);
		
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println("welcome ".concat("to java"));
		
		String s5="welcome to selenium java python python";
		System.out.println(s5);
		System.out.println("replacing e with X");
		System.out.println(s5.replace('e','X'));
		
		System.out.println("replacing python with C#");
		System.out.println(s5.replace("python","C#"));
		
		String s6="abc 532 juw";
		String arr[]=s6.split(" ");
		System.out.println(Arrays.toString(arr));
		
		String s7="John Kenedy";
		System.out.println(s7.contains("john"));
		System.out.println(s7.toLowerCase().contains("john"));
		System.out.println(s7.replace('J','j'));
		
		
		
	}

}


