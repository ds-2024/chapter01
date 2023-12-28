package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요.");
		System.out.print("숫자: ");
		
		int no = sc.nextInt();
		
		if(no>0) {//양수니?
			
			if(no%2==0) {//짝수니?
				System.out.println("짝수입니다.");//양수 중 짝수
				
				
			}else {//나머지 홀수
				System.out.println("홀수입니다.");//양수 중 홀수
			}
			
		}else if(no<0){
			
			System.out.println("음수입니다.");
			
		}else {
			System.out.println("0입니다.");
			//음수 0
			
			sc.close();
			
			
			
		}
	
		}
	}


