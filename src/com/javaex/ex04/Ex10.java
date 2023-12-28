package com.javaex.ex04;

public class Ex10 {

	public static void main(String[] args) {
		
		for(int i=1; i<=20; i++) {
			if(i%2==0 || i%3==0) {
				continue;
			}
			System.out.println(i);
			
		}

		System.out.println("--------------------");
		
		for(int i=1; i<=20; i++) {
			if(i%2==0 || i%3==0) {
				//할일이 없으니까 아무입력X
			}else {
				System.out.println(i);
			}
		
		
	}

System.out.println("--------------------");
		
		for(int i=1; i<=20; i++) {
			if( !(i%2==0 || i%3==0) ) {
				System.out.println(i);
			}
		}
	}
}
