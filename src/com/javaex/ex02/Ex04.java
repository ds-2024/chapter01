package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//스캐너 실행 > java import해주기
		Scanner sc = new Scanner(System.in);
		//이름안내
		System.out.println("이름을 입력해 주세요");
		//이름:
		System.out.print("이름: ");
		//이름 입력받기
		String name = sc.nextLine();
		//나이안내
		System.out.println("나이를 입력해 주세요");
		//나이:
		System.out.print("나이: ");
		//나이 입력받기
		int age = sc.nextInt();
		//키안내
		System.out.println("키를 입력해 주세요");
		//키:
		System.out.print("키: ");
		//키 입력받기
		double height = sc.nextDouble();
	
		//종합선언 출력
		System.out.println("당신의 이름은 " + name +" 나이는 "+ age + " 키는 " + height + " 입니다.");
				
		//close 작업
		sc.close();
		

	}

}
