package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수:");
		int point = sc.nextInt();
		
		if(point >= 60){
			//True
			System.out.println("합격입니다.");
		}
		else {
			//False
		
		System.out.println("불합격입니다.");
		}
		
		sc.close();

	}

}
