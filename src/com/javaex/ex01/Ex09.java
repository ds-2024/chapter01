package com.javaex.ex01;

public class Ex09 {
	
	public static void main(String[] args) {
		
		//대입연산자
		int a = 7;
		int b = 2;
		
		//산술연산자
		// a+b를 한번만 쓴다면 굳이 변수 값(담을 그릇) 만들 필요 없지만 계속 써야한다면
		// 그릇 생성(변수) 해주자.
		//int var01 =  a+b;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); //나누기 --> 몫
		System.out.println(a%b); //나누기 --> 나머지
		
		System.out.println("---------------------");
		
		//%연산자 자세히
		System.out.println(7/2); //3
		System.out.println(7.0/2); //3.5
		System.out.println(7%2); //1
		System.out.println(7.0%2);// 나머지를 실수형 1.0 으로 표시해줌
		
		System.out.println("-------------------------");
		
		int var = -3;
		int pVar = +var; //+(-3) ==> -3
		int mVar = -var; //-(-3) ==> +3
		
		System.out.println(pVar);
		System.out.println(mVar);
	}

}
