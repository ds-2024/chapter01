package com.javaex.ex04;

public class Ex05_1 {
	
	public static void main(String[] args ) {
		
		//1부터 10까지의 합 구하라
		
		int sum = 0;
		int max =100;
		
		for(int i = 1; i<=max ; i++ ) {
			
		sum = sum + i;	//위치도 중요함. 
	
			System.out.println(i +" 까지의 합은 " + sum);
			
			
		}
		
		System.out.println("1부터 "+ max +"까지의 정수의 합은 "+ sum +" 입니다.");
	}

}
