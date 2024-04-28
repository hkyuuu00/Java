package com.example.study;

//throws는 예외객체를 호출한 쪽에 전달하기 위해 사용, 3인칭. 제3자가 처리하도록 던짐
public class study_027 {
	public static void main(String[] args) {
        try {
            divide(10, 0); // 예외 발생 가능성이 있는 코드
        } catch (Exception e) {
            System.out.println("0으로 나눌 수 없음");
        }
    }
	
	// 예외 발생 가능성이 있는 devide 메소드 생성, 예외를 throws를 사용하여 메소드를 호출한 곳으로 넘기기
    static void divide(int a, int b) throws Exception {
    	// b의 인자값으 0일때
        if (b == 0) {
        	// throw로 예외 발생, 메소드의 예외를 throws로 넘겼기에 이 부분에서 종료 시키고 넘김
            throw new Exception();
        }
        System.out.println(a / b);
    }
}

//Exception 클래스를 상속받아 자신만의 새로운 예외 클래스를 정의하여 사용할 수 있음.