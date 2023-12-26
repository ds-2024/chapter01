package com.javaex.ex01;

public class Ex05 {

	public static void main(String[] args) {
		
		//캐릭터형 무조건 1글자, 따라서 황일영이라는 이름을 치면 에러 발생
		char ch01 = 'A';
		char ch02 =  '황';
		
		System.out.println(ch01);
		System.out.println(ch02);
		
		/*유니코드 캐릭터형 이지만 코드표에서 값 받아와서 출력됨.
		 * 따라서 오류가 안나니까 조심해야한다. 
		 * char 타입의 변수에는 문자가 아니라 문자에 해당하는 정수형태의 코드값이 저장되는것. 
		 */
		char ch03 = 65;
		System.out.println(ch03);
		
		char ch04 =  3;
		System.out.println(ch04);
		
		//char ch05 = "황"; // char ch05 쌍따옴표 안됨, 두글자도 안됨
		
		////////////////////////////////////////////
		//String 사용법만 익히자
		
		String name =  "황일영"; // '' 안됨, 반드시 쌍따옴표 사용, 1글자이상, " " 도 가능
		System.out.println(name);
		
		String name2 =  "황";
		System.out.println(name2);
		
		
		
	}
}
