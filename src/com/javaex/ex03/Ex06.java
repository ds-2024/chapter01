package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		
		int point = sc.nextInt();
		
		
		

		 
		 if(point%3==0) {//3의 배수 일때
			 System.out.println(point + "는 3의 배수입니다.");
			
			
		 }else {//3의 배수가 아닐때
			 
			 System.out.println(point + "는 3의 배수가 아닙니다.");
		 }
		
		
		
		//Point 3으로 나눴을때 나머지가 0이면 3의 배수이다.
		// 따라서 3의배수 if 문법에 맞게 point%3 == 0 로 바꿈.
		
		
		
		

		sc.close();
	}

}
