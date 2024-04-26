package com.example.study;
class A{
	public String x() {
		return "X";
	}
	// private은 클래스 내부에서만 접근가능
	private String y() {
		return "Y";
	}
	public String z() {
		return y();
	}
}
// public으로 지정된 클래스의 이름은 파일 이름과 반드시 같아야 함.
public class study_020 {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.x());
		// 밑에 코드는 오류 발생, private 메소드는 외부에서 접근이 불가능
		//System.out.println(a.y());
		System.out.println(a.z());
	}
}
