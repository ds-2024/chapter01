package com.javaex.ex02;

public class Ex01 {
	
	public static void main(String[] args) {
		
		int i =12345;
		double d =3.14;
		char c = '한';
		String s ="한";
		String name = "DS";
		String str = "안녕하세요";
		String hello =  "굿모닝";
		
		System.out.println(i);
		System.out.println(12345);
		
		
		System.out.println(str);
		System.out.println("안녕하세요");
		
		System.out.print(name);
		System.out.println(str); // println 과 print 줄바꿈 차이
		
		System.out.println("----------------");
		System.out.print("안녕");
		System.out.println("하세요");
		
		System.out.println("----------------");
		System.out.println(hello + hello);
		
		System.out.println("----------------");
		System.out.println(name + hello + hello);
		System.out.println(name +"님" + " " + hello);
		
		System.out.println("제" + " "+"이름은"+" " + name +"입니다");
		System.out.println("제 " + "이름은"+" "+ name +" 입니다.");
		System.out.println("----------------");
		
		System.out.println(i + i);//문자 붙여주는게 아니라 정수라서 계산이 된다.
		System.out.println(d+d);
		System.out.println(i+d);// 실수, 정수 범위라서 계산 됨
		
		System.out.println(c+c);//char는 숫잔줄 앎. *숫자로 연산됨
		System.out.println(s+s);//한한 문자열 변수타입으로 해결
	
		System.out.println(name + i);//문자열의 승리. 계산안되니가 붙여버림.
		System.out.println(name + i + d);//계산 될 수 있는 부분은 계산이 된다.
		
		//System.out.println("안녕"하"세요"); // 안녕"하"세요 출력 안됨. 에러뜸."안녕" "세요" 로 인식
		
		System.out.println("안녕\"하\"세요"); // \"큰따옴표
		//System.out.println("안녕\하\세요"); //안됨. 슬래쉬 두개 넣어야 작동됨. \\,\"
		System.out.println("안녕\\하\\세요");
		System.out.println("안녕\n하세요");
		System.out.println("안녕\t하세요");

	
	}
	

}
