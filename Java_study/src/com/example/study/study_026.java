package com.example.study;

// throw는 예외를 일부러 발생시키기 위해 사용, 1인칭. 내가 예외를 발생시킴
public class study_026 {
	static void throwEx() {
        try {
        	// 예외를 자신에게 발생, 예외가 발생해 catch로 넘어감 
            throw new Exception();
        } catch (Exception e) {
            System.out.println("호출된 메소드 예외처리");
        }
    }
	//static void throwEx() throws Exception { 
	//	throw new Exception(); 
	//}
	// 위 코드를 사용해서 try-catch를 생략할 수 있음
	
    public static void main(String[] args) {
        try {
        	// 메소드 호출, 메소드에는 예외가 없이 잘 실행되기에 결과는 "호출된 메소드에서 예외가 처리됨!"
        	throwEx();
        } catch (Exception e) {
            System.out.println("main() 메소드에서 예외가 처리");
        }
    }
}
