package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("과목코드: ");
		
		//String code =sc.nextLine();
		//char int byte short String (O)
		//boolean  double float long (X)
		
		int code = sc.nextInt();
		
		switch(code) {
		 
		case 1:
			System.out.println("R101호");
			break;
		
			
		case 2:
		    System.out.println("R202호");
			break;
			
			
		case 3:
			System.out.println("R303호");
			break;
			
			
		case 4:
			System.out.println("R404호");
			break;
			
			
			default:
				System.out.println("상담원");
				break;

		}
		
		sc.close();

	}

}
