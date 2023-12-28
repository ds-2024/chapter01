package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		
		int hours = sc.nextInt();
		
		System.out.print("임금은 ");
		
		if (hours <= 8 ) {
			//8시간 이하 //t) int salary = hours *10000
			System.out.print(10000* hours);
		} else {
			//8시간 초과
			System.out.print(10000*8 + (hours - 8)*12000);
		}
		
		System.out.print(" 입니다.");
		
		sc.close();		

	}

}
