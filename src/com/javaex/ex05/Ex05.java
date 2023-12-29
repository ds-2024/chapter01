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
		
		
			
		
		
		
	

	}

}
