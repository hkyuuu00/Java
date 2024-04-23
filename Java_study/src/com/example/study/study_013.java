package com.example.study;

public class study_013 {
	public static void main(String[] args) {
		//출력 print ,줄바꿈 없이 계속 출력
		System.out.print("1");
		System.out.print("2");
		System.out.print("3");
		
		//println, ln을 사용하여 줄바꿈
		System.out.println("1");
		System.out.println("2");
		
		/*printf, 지시자와 플래그를 통해 변수의 값을 여러 형식으로 출력
		 	%b : boolean
			%d : 10진수
			%o : 8진수
			%x, %X : 16진수
			%c : 문자
			%s : 문자열
			%n : 줄 바꿈
		 */
		System.out.printf("현재시간은 %d%s %d%s 입니다!%n", 11, "시", 10,"분");
		System.out.printf("%d", 10);
	}
}
