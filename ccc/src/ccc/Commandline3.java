package ccc;

public class Commandline3 {
	public static void main(String[] args) {
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=a+b;
		System.out.print("The sum of "+args[0]+" and "+args[1]+" is "+c);

	}

}
