package com.example.study;

public class study_008 {
	public static void main(String[] args) {
		
		// 문자열 배열 생성 {}중괄호로 묶어주기
		String[] group = {"가","나","다","라","마"};
		
		// 정수 배열 생성
		int[] num = {1,2,3,4,5};
		
		// 호출 혹은 사용할 경우 배열의 index를 이용한다. index는 0부터 시작
		// 배열 이름과 index를 사용하여 호출
		System.out.println(group[0]);
		System.out.println(num[2]);
		
		// 배열에 .length를 붙여 배열 개수 확인
		// 이 방법을 사용하여 group.length - 1 = 마지막 항목의 인덱스 번호
		System.out.println(group.length);
		
		// 반복문 사용
		String[] name = {"Lee","Kwon","Park","Yu","Hong"};
		for(int i = 0; i<name.length; i++) { //i를 초기화, i는 배열 개수보다 작음, i를 1씩 증가 
			System.out.println(name[i]);
		}
		
		// for-each 반복문
		for(String e: name) { //name 배열의 값을 하나씩 e에 담아주며 for을 이용해 반복
			System.out.println(e);
		}
		
	}
}
