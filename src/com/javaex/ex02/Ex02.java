package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		Scanner sc = new Scanner(System.in);
		
		//안내출력
		System.out.println("이름을 입력해 주세요");
		
		//이름출력
		System.out.print("이름:");
		
		//이름 입력받기
		String name = sc.next(); //> println 인지 print 인지 구분!!!
		
		//나이안내출력
		System.out.println("나이를 입력해주세요");
		
		//나이출력
		System.out.print("나이:");
		
		//나이 입력받기
		int age = sc.nextInt();
		
		//결과 출력
		System.out.println("당신의 이름은 " + name + " 입니다.");
		
		System.out.println("----------------------");
		
		sc.close();
		
		


	}

}
