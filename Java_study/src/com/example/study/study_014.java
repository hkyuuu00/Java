package com.example.study;

//Scanner 클래스 불러오기
import java.util.Scanner;

public class study_014 {
	public static void main(String[] args) {
		// Scanner 클래스의 인스턴스 생성하기
        Scanner sc = new Scanner(System.in);
        // nextInt() 메소드를 통해 정수 입력 값 변수에 저장하기, 다양한 입력메소드가 있고 찾아쓰기
        int number  = sc.nextInt();
        System.out.println(number*100); //10을 입력했을 경우 1000출력
	}
}
