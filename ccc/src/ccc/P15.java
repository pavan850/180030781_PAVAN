package ccc;

import java.util.*;

public class P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int sum  =0;

	while (a != 0)
    {
        sum = sum + a % 10;
        a = a/10;
    }
	System.out.println(sum);
}
	}
