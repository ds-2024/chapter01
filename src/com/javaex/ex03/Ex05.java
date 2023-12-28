package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		
		int hours = sc.nextInt();
		
		System.out.print("임금은 ");
		
		if(hours <=8 ) {
			//8시간 이하
			System.out.print(10000*hours);
		
		}else {
			//8시간 초과
			System.out.print(10000*8 +(int)(hours - 8)*10000*1.5);
		}
		
	System.out.println(" 입니다.");
	
	sc.close();
	}
	
		
		
		
		
		}
		
		
		

	


