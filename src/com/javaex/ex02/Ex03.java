package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.계획세우기
		//스캐너 준비
		//new Scanner(System.in); // 에러들어가서 import 해줘야함
		Scanner sc = new Scanner(System.in);
		//안내문구
		System.out.println("이름을 입력해 주세요");
		
		//이름:
		System.out.print("이름: ");
		
		//이름입력받기
		String name = sc.nextLine();
		
		//안내문구
		System.out.println("나이를 입력해 주세요");
		
		//나이:
		System.out.print("나이: ");
		
		//나이입력받기
		int age = sc.nextInt();
		//출력
		
		System.out.println("당신의 이름은 " + name +" 나이는 " + age + " 입니다.");
		
		//스캐너종료
		//2. 스캐너종료 sc.close(); 바로 박아주기
	       sc.close();
		

	}

}
