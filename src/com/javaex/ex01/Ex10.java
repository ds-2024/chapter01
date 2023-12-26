package com.javaex.ex01;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//증감 연산자
		int a = 7;
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);
		/*메모리값 자체를 +1 증가 시킴.
		 * 따라서 8로 저장이 되어있음. 단순히 읽은게 아님. prefix 는 줄의 업무중 가장 우선되는 연산.
		 * 출력값을 맞추는게 포인트가 아님. 언제 ++기능을 넣어줄지 파악하는게 포인트.
		 */
		System.out.println(--a);
		System.out.println(a);
		
		

	}

}
