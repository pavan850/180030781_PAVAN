package ccc;

import java.util.*;
public class P7 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 char a = sc.next().charAt(0);
	 if(a >= 65 && a <=90) {
	 char b = Character.toLowerCase(a);   
	 System.out.println(b);

	}else {
		char b = Character.toUpperCase(a);   
		 System.out.println(b);

	}

}
}
