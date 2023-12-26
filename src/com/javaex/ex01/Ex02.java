package com.javaex.ex01;

public class Ex02 {
	
	public static void main(String[] args) {
		
		//byte
		byte no = 127;
		//no = -129; //byte 형의 범위를 벗어남
		System.out.println(no);
		
		///////////////////////////////
		
		int num = 2147483647;
		
		System.out.println(num);
		
		//////////////////////////////
		
		///long
		//int 범위를 벗어난 숫자는 맨뒤에 L을 붙여야한다.
		//long 형 쓸때는 항상 L을 붙이자
		long num2 = 2147483647L;
		
		System.out.println(num2);
		
		/////////////////////////////
		//////변수선언, 초기화
		
		
		
		int var01;
		int var02;
		int var03;
		
		var01 = 10;
		var02 = 20;
		var03 = 30;
		
		System.out.println(var01);
		System.out.println(var02);
		System.out.println(var03);

		int var04 = 100; int var05 = 200; int var06 = 300;
		
		System.out.println(var04);
		System.out.println(var05);
		System.out.println(var06);
	}

}
