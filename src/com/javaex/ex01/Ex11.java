package com.javaex.ex01;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//증감연산자
		
		int b = 10;
		
		System.out.println(b);
		System.out.println(b++);
		/*여태까지는 출력값이 10으로 나옴. 출력이 우선순위라서.
		 * 그래서 값이 올라간걸 확인하려면 다시 b값 출력해서 확인해봐야함.
		 */
		
		System.out.println(b);
		
		System.out.println(b--);
		System.out.println(b);
		/*마찬가지로 예전 b값으로 출력이 되고(L20),
		 *확인차로 연산 들어갔는지 확인 출력 (L21)
		 */
		
		int no = 10;
		System.out.println(no-- + 3);
		/* 작업종류 *출력 *-- *+ 우선순위 정하기. 가장 먼저 해야할 작업 1.no +3 2. 출력 3.no + 3 --
		 * 따라서 다시 no 를 출력해서 9가 됐는지 확인해주기.
		 */
		System.out.println(no);
		
		int no1 =  10;
		
		++no1;
		++no1;
		System.out.println(no1);
		
		int no2 = 10;
		no2++;
		++no2;
		System.out.println(no2);
	}

}
