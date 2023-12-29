package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		
		//1~45 까지의 숫자중 임의의 6개의 숫자를 출력하세요
		//(중복체크는 하지말것)
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		int num6;
		
		num1 = (int)(Math.random()*45)+1;
		num2 = (int)(Math.random()*45)+1;
		num3 = (int)(Math.random()*45)+1;
		num4 = (int)(Math.random()*45)+1;
		num5 = (int)(Math.random()*45)+1;
		num6 = (int)(Math.random()*45)+1;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		
		System.out.println("-------------------");
		
		


	}

}
