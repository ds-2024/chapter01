package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
				
				int point =  sc.nextInt();
		
		if(point >= 60) {
		//참일때
			System.out.println("합격입니다.");
		}
		
		sc.close();
		
		System.out.println("프로그램종료");
	
	}

}
