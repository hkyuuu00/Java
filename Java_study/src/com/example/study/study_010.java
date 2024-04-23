package com.example.study;

public class study_010 {
	public static void number(int limit) { //limit은 매개변수(파라미터)
		for (int i=0; i<limit; i++) {
			System.out.println(i);
		}
	}
	
	public static void number2(int init, int limit2) { //limit은 매개변수(파라미터)
		for (int i=init; i<limit2; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		number(6); //()안에 값(인자, argument)이 number 메소드의 (int limit)에 저장
		number2(1,7); // 매개변수가 두개 이상일 경우 순서에 맞춰 인자값 저장
	}
}
