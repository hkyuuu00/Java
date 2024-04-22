package com.example.study;

public class study_001 {
	public static void main(String[] args) {
		//""를 이용하여 문자열 출력
		System.out.println("Hello World!");
		// +를 이용해 붙이기 가능
		System.out.println("Hello"+"World!");
		// ""를 출력할 때에는 "앞에 \사용
		System.out.println("Hello \"W\"orld!");
		
		//숫자 출력
		System.out.println(3);
		//연산자를 이용
		System.out.println(4+2);
	}
}

/* package는 자바 클래스를 모아놓은 디렉토리,
 * 패키지에는 클래스 또는 인터페이스를 포함시킬 수 있고, 서로 관련된 클래스들끼리 그룹 단위로 묶어 놓아 효율적으로 관리가능
 * 같은 이름의 클래스여도 폴더로 분리하여 서로 다른 패키지에 존재하는 것이 가능하여 충돌하는 것을 피할 수 있음. 
 * 
 * String[] args 는 args라는 이름의 문자열 배열을 사용하겠다는 뜻
 * 프로그램이 시작되는 부분이기 때문에 외부에서 값을 받을 수 있어야하기 때문
 */
