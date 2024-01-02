package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		
		int[]	lottoNumArray =  new int[6];
		
		for(int i=0; i<lottoNumArray.length;i++) {
			lottoNumArray[i] =(int)(Math.random()*45)+1;
		}
			
			
		for(int i=0; i<lottoNumArray.length;i++) {
				System.out.println(lottoNumArray[i]);
				
			
		}
		// Ex02 와 비교하고 array 필요성 체감
		//같은 타입의 데이터를 연속적인 한 공간에 나열시켜 각 데이터
		//위치인 인덱스를 부여해서 사용.
		//array 문법구조 알아두기
		//for 과 array 의 조합
		
			
		
		
		
	

	}

}
