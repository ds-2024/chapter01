package com.javaex.ex04;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.[0이면 종료]");
		
		
	while(true) {
		int no = sc.nextInt();
		
		if(no==0) {
			System.out.println("종료");
			break;
		}
		if(no != 0 ) {
			//더하기
			sum = sum + no;
			System.err.println(sum);
			
		}else {
			System.out.println("종료");
			break;
		  }
			
		}
		
		//입력받기
		//no 0이면 종료
		//no !0 이면 합계 계산
		
		//입력받기
		//no 0이면 종료
		

		
				
				
				
				
			sc.close();
	}

}
