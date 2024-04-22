package com.example.study;

public class study_007 {
	public static void main(String[] args) {
		//for문은 초기화, 조건, 증감식이 한 문장에 모두 포함되어 있으며, 조건이 true인 동안 반복해서 실행
		for (int i = 0; i < 5; i++) {
		    System.out.println(i); //0부터 4까지 출력
		}
		
		
		// while문은 특정 조건이 true인 동안 계속해서 반복, 조건은 반복문 내부에서 변경되어야 하고, 그렇지 않으면 무한 루프 발생
		int j = 0;
		while (j < 5) {
			System.out.println(j); //0부터 4까지 출력
		    j++;
		}
		
		// break는 완전히 종료시키고 밖으로 탈출한다.
		for (int i = 0; i < 10; i++) {
			if(i == 4) {
			    break;
			}
			System.out.println(i); //4에서 멈춤
		}
		// continue는 현재 반복을 끝내고 다음 반복으로 넘어가는 역할을 한다.
		for (int i = 0; i < 10; i++) {
			if(i == 4) {
			    continue;
			}
			System.out.println(i); //4를 건너뜀
		}
	}
}