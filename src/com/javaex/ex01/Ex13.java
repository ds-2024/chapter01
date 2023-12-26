package com.javaex.ex01;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//논리연산자
		//&& and 연산자
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println("------------------------------");
		
		//|| or 연산자
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println("------------------------------");
		
		//응용
		int a=5;
		int b=7;
		
		System.out.println((a>b)&&(a<b)); //f && t = > f
		System.out.println((a>b)&&(a>b)); //f && f = > f 
		System.out.println((a>b)||(a<b)); //f || t = > t
		System.out.println( (a>b)&&(a<b)||(a<b) ); // f && t || t = > t
		System.out.println( (a<b)||(a>b)||(a>b) ); // t || f || f = > t
		// || or 연산만 있는데 t가 하나라도 있으면 식 몇개라도 t 도출. 
		System.out.println("------------------------------");
		
		System.out.println(!(a<b)); //!t => f
		System.out.println(!(a>b)); //!f => t
		System.out.println((a>b)||(a<b));
		
		
		
	}

}
