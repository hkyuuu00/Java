package com.example.study;

public class study_009 {
	//메소드는 함수, main 함수도 메소드
	
	// 새로운 메소드 생성
	public static void alphabet() {
		String[] alp = {"a","b","c","d"};
		for (String e: alp) {
			System.out.println(e);
		}
	}
	public static void number() {
		for (int i=0; i<6; i++) {
			System.out.println(i);
		}
	}
	
	// 메인함수만에서 호출
	public static void main(String[] args) {
		alphabet(); 
		number();
	}
}
