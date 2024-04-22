package com.example.study;

public class study_002 {
	public static void main(String[] args) {
		@SuppressWarnings("unused") // 경고억제
		
		//변수 선언 ,int는 정수 double은 실수 String은 문자열
		int a;
		double b;
		//변수에 값 할당
		a = 1;
		b = 0.5;
		
		//선언과 할당을 한번에 가능
		String c = "Hello";
		String d = "World!";
		
		// 변수 출력
		System.out.println(a);
		System.out.println(a+1);
		System.out.println(a+b);
		System.out.println(c+d);
	}
}
/* 변수는 가독성과 유지보수의 장점을 가지고 있음 */
/* 세미 콜론은 문장이 끝났음을 의미 {}에는 괄호가 닫히면서 블럭이 끝났음을 이미 표현하기에 사용안함 */