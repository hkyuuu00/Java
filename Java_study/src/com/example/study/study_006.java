package com.example.study;

public class study_006 {
	public static void main(String[] args) {
		// 조건문 if는 조건을 생성하여 조건에 따라 실행
		int a = 5;
		int b = 7;
		String abc= "a";
		if(a>b) {
			System.out.println(100);
		} else if(a<b) {
			if(a<=5) {
				System.out.println(99);
			} else {
				System.out.println(97);
			}
		} else {
			System.out.println(98);
		}
		
		
		//삼항연산자 , 조건식을 쓰고 ? 뒤에 먼저나오는 값이 true값 뒤에가 false값
		int result = (a - b > 0) ? a : b;
		
		// 조건문 Switch, abc의 값이 a일 경우 case a출력 후 탈출(break), default는 기본 값
		switch(abc){
			case "a":
				System.out.println("a입니다");
				break;
			case "b":
				System.out.println("b입니다");
				break;
			case "c":
				System.out.println("c입니다");
				break;
			default:
				System.out.println("default");
				break;
			
		}
	}
}
