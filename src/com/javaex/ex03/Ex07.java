package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		
		int point = sc.nextInt();
		//필요한 질문인지 아닌지도 판단하기 ex) point<90 && point>=80, 앞의 조건 필요 없음.생략.
		
		if(point >= 90) {
			System.out.println("A등급");
		}else if(point >= 80 ) {
			System.out.println("B등급");
		}else if(point >= 70) {
			System.out.println("C등급");
		}else if(point >= 60) {
			System.out.println("D등급");
		}else  {
			System.out.println("F등급");
			
			
			
		}
		
		sc.close();

	}

}
