package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//자동형변환
		int var00 =  3+5;
		System.out.println(var00);
		
		//3.0 으로 자동 형변환 됨 (정수를 실수형으로 바꿔서 계산).
		//따라서 실수형으로 선언해줘야함
		int a = 3;
		double b = 3.5;
		double var02 =  a+b;
		System.out.println(var02);
		
		///////////////////////////////////////////////
		///강제형변환
		
		float var04 = 1111.6345F;
		int var05 = (int)var04;
		
		System.out.println(var04);
		System.out.println(var05);
		
		//축소형변환(int --> byte)
		//줄여도 숫자 자체가 작은 수라 값이 변환되지 않는다.
		int v01 = 10;
		byte v02 = (byte)v01;
		System.out.println(v02);
		
		//축소 형변환 (int --> byte)
		//10은 규칙없는 숫자. 어떻게 줄였는지 알 수 없다. 값이 변환. 큰 숫자를 작은 칸에 우겨넣어서.
		int v03 = 20309770;
		byte v04 = (byte)v03;
		System.out.println(v04);
		
		//확대 형변환 (byte --> int)
		//값이 그대로 나오는 이유. 기존 메모리도 충분했는데 메모리 더 주니까 변형시킬게 없다.
		byte v05 =  127;
		int v06 = (int)v05;
				System.out.println(v06);
				
		//실수 --> 정수
		//소숫점 날라감 
		double v07 = 5.57;
		int v08 = (int)v07;
		System.out.println(v08);
		
		//정수 --> 실수
		//소숫점 이하의 값이 없지만 정수형을 실수형으로 변환한것이라 .0 표시 해줌
		int v09 =  7;
		double v10 = (double)v09;
		System.out.println(v10);
		
	 
		

	}

}
