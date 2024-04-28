package com.example.study;

class A1{
	public String a() {
		return "A1.a";
	}
}
class B1 extends A1{
	public String a() {
		return "B1.a";
	}
	public String b() {
		return "B1.b";
	}
}

public class study_024 {
	public static void main(String[] args) {
		// 참조변수의 다형성
		// A1의 형태를 하고 있지만 내용은 B1임. 
		A1 obj = new B1();
		// A1과 B1 모두 가지고 있는 a는 B1의 내용이 리턴
		System.out.println(obj.a());
		// B1을 인스턴스화 했지만 A1의 형태이기에 B1의 b 메소드는 호출 불가
		//System.out.println(obj.b());
		
		// B1 obj = new A1();
		// 위 코드는 불가, 자식 클래스 타입의 참조 변수로는 부모 클래스 타입의 인스턴스를 참조할 수 없음
		// 참조 변수가 사용할 수 있는 멤버의 개수가 실제 인스턴스의 멤버 개수보다 많기 때문
	}
}
// 참조 변수 다형성은 인터페이스에서도 똑같이 실행됨.