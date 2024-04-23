package com.example.study;

public class study_011 {
	// void가 아니고 String인 이유는 number메소드가 return할 값이 반드시 문자열이라는 것을 의미
	// void가 붙는 경우는 메소드의 리턴값이 존재하지 않을 경우
	public static String number(int init, int limit) {
		int i = init;
		//output을 return할거기에 문자열로 생성
		String output = "";
		while(i<limit) {
			output += i;
			i++;
		}
		// return값을 String으로 설정했기에 return 생성
		return output;
	}
	public static void main(String[] args) {
		String result = number(1,7);
		System.out.println(result);
		// 이 방식을 사용할 경우 재활용이 편리함
		
	}
}
