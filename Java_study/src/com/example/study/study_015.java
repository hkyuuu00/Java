package com.example.study;

import java.io.File;
import java.util.Scanner;

public class study_015 {
	public static void main(String[] args) {
		//try-catch문은 예외를 처리하기 위한 구문
		try { 
			// index.txt 파일 변수에 넣어줌, 프로젝트 폴더에 미리 생성
			File file = new File("index.txt");
			// Scanner를 통해 file을 입력, 파일 내용을 이 코드에 입력해주는 것, 파일에는 123이 들어가있음
			Scanner sc = new Scanner(file);
			System.out.println(sc.nextInt() * 100);
		
		// catch로 예외일 경우를 설정, 찾을 수 없는 파일일 경우, 에러메세지 출력
		} catch (Exception e) {
            System.err.println("오류 발생: " + e.getMessage());
        } 
	}
}
