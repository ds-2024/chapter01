package com.javaex.ex04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
			
		// 숫자 입력받아 3의 배수인지 판별
		// 0이 입력되면 종료
		
		
		Scanner sc = new Scanner(System.in);
		
		//반복
		
		while(true) {
			System.out.println("숫자를 입력하세요");
		
			int num =sc.nextInt();
		
			if(num==0) {
				System.err.println("종료");
		
				break;
			
			}else {
		
				if(num%3==0) {
					System.out.println("3의 배수입니다.");
			
				}else {
					System.out.println("3의 배수가 아닙니다.");
			
				}
		

				
			}

		}//While 
		sc.close();// 줄맞춤 중요
	}
}

