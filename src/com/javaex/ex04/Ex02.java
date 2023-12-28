package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해주세요");

		System.out.print("단 : ");
		int dan = sc.nextInt();
		
		int i = 1;
		//int time =1;
		
		while(i<=9) {
			//반복
			// System.out.println(dan+"*" +1~9 +"=" +dan*?);
			System.out.println(dan +"*"+ i +"="+ dan*i);
			
			//time++;
			i++;
			
			
		}
		

	}

}
