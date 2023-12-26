package com.javaex.ex01;

public class Ex08 {
	
	public static void main(String[] args) {
		
		//실수범위 명령자 double 을 선택해서 1.25라는 값이 나올 줄 알았는데
		//1.0 이라는 값을 얻음. 왤까? 우측 값에 강제 변환이 없어서..?
		//우측값에 두 변수 다 실수 범위인지 아닌지 모름. 기본값이 정수 범위라서?
		//>자료형이 정수 그러므로 정수에서 값을 골라서 출력이 됨.
		//>값으로 나올 수 있는 범주에 실수가 없음. 따라서 1이 최선.
		//1.0 은 강제 형변환 된 꼴. double 꼴은 맞춰주기 위해서.
		//>우측 자료값 만으로 계산 후 double 꼴 맞춰서 출력 되니까 1.0 출력
		double v01 = 5/4;
		System.out.println(v01);
		
		// >5.0 나누기 4 꼴 따라서 강한 쪽으로 형을 맞춘다!
		// >따라서 우측값 자체만으로도 실수쪽 자료형(변수 타입)에 맞춰 계산이 됨.
		// > 항상 '=' 우측 자료값 먼저 처리가 된다.
		double v02 = (double)5/4;
		System.out.println(v02);
		
		//나누는 대상이 double 처리 안 한 5라서 1.0 나올줄 알았다. 그런거 아님 ㅋㅋ
		//>5 나누기 4.0 꼴 따라서 강한 쪽으로 형을 맞춘다!
		double v03 = 5 / (double)4 ; 
		System.out.println(v03);
		
		double v04 = (double)5 / (double)4 ; 
		System.out.println(v04);
		
		int v05 = (int)1.3 + (int)1.8 ; 
		System.out.println(v05); 
		
		int v06 = (int)(1.3+1.8);
		System.out.println(v06);
		
		int v99 = (int)(5 / (double)4);
		System.out.println(v99);
	}

}
