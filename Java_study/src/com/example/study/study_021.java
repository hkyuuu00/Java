package com.example.study;

// 추상 클래스 생성
abstract class Abs{
	// 추상 메소드 생성
	abstract void b();
}
class B extends Abs{
	void b() {
		System.out.println("A");
	}
}

// final을 사용하면 끝까지 변경할 수 없도록 고정, 메소드 뿐만 아니라 변수에도 설정 가능
class C{
	final void c() {
		System.out.println("c");
	}
}

public class study_021 {
	public static void main(String[] args) {
		B obj = new B();
		obj.b();
	}
}
// abstract는 상속을 강제하는 것
// 추상 메소드가 포함된 클래스를 상속받는 자식 클래스가 반드시 추상 메소드를 구현하도록 하기 위함