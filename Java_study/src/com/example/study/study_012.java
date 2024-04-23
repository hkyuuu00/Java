package com.example.study;

public class study_012 {
	//String[] args는 매개변수로 main 메소드에 데이터를 넘겨주고 싶을 때 사용하는 매개변수
	public static void main(String[] args) {
		System.out.println(args.length); // 파라미터로 넘어온 값의 수
		System.out.println(args[0]);// 파라미터로 넘어온 값 출력, args는 문자열 배열이기에 맞춰서 출력
	}
}
/* Run 메뉴에서 Run Configurations 클릭 후 상단메뉴에서 Argument 클릭, Program Argument 창에 전달해주고 싶은 값 넣기
 * Lee Park Kwon 값을 넣은 후 출력하였음.
 * 3
 * Lee
 * 결과가 나옴
 */