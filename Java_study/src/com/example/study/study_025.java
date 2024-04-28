package com.example.study;

import java.io.File;
import java.util.Scanner;

public class study_025 {
	public static void main(String[] args) {
		//try-catch문은 예외를 처리하기 위한 구문
		// try에는 먼저 실행되는 코드, 예외가 발생이 예상되는 코드
		try { 
			// 예외가 발생했을 때를 확인하기 위해 파일은 만들지 않음
			File file = new File("ABC.txt");
			Scanner sc = new Scanner(file);
			System.out.println(sc.nextInt() * 100);
		
		// catch에는 예외가 발생했을 때 실행되는 로직
		} catch (Exception e) {
			// 에러 메세지 출력, getMessage를 사용
            System.out.println("\n오류 발생 메세지: \n" + e.getMessage());
            
            // 예외가 어떤 이유에서 발생했는지를 출력, toString을 사용
            System.out.println("\n예외가 발생한 이유: \n" + e.toString());
            
            // 에러 전체를 보고싶을 때, printStackTrace를 사용, print를 사용하지 않고 바로 사용
            System.out.println("\n에러 사항:");
            e.printStackTrace();
        // finally는 예외 발생 여부와 상관없이 무조건 실행되는 코드
        } finally {
        	System.out.println("\n finish");
        }
		// catch를 실행하고 프로그램이 종료되는 것이 아닌 밖으로 나와서도 계속 실행.
		System.out.println("\n devide end");
	}
}

// 예외는 오류와 마찬가지로 실행 중인 프로그램을 비정상적으로 종료시키지만, 발생할 수 있는 상황을 미리 예측하여 처리