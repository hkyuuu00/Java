package com.example.study;

class O{
	// 정수
	public void a(int param) {
		System.out.println(param);
	}
	// 문자열
	public void a(String param) {
		System.out.println(param);
	}
}
public class study_023 {
	public static void main(String[] args) {
		// 오버로딩을 통한 다형성, 하나의 객체가 여러가지 타입을 가질 수 있는 것
		O o = new O();
		o.a(3);
		o.a("abc");
	}
}
