package com.example.study;

public class study_004 {
	public static void main(String[] args) {
		// 덧셈연산자 +
		int add = 1+2;
		System.out.println(add);
		
		// 뺼셈연산자 -
		int sub = 3-2;
		System.out.println(sub);
		
		// 곱셈연산자 *
		int mul = 3*2;
		System.out.println(mul);
		
		// 나눗셈연산자 /
		int div = 9/4;
		System.out.println(div);
		
		// 나머지연산자 %
		int rem = 9%4;
		System.out.println(rem);
		
		// + 덧셈연산자는 문자열을 연결할 때에도 사용
		String name1 = "Lee";
		String name2 = "HK";
		String fullName = name1 + name2;
		System.out.println(fullName);
		
		//실수의 연산 , 실수와 정수의 연산은 정수를 자동으로 형변환 시킴 ,10 = 10.0
		int a = 10;
		float b = 5.5F;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
	}
}
