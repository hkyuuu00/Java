package com.example.study;

class num{
	int a,b;

	// a,b 값을 받아와 전역변수로 설정
	// 클래스 이름과 같은 메소드를 만듬 ,생성자라고 하며 어떤 메소드보다 먼저 실행
	public num(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void sum() {
		System.out.println(this.a+this.b);
	}
	
	public void avg() {
		System.out.println((this.a+this.b)/2);
	}
}

public class study_017 {
	public static void main(String[] args) {
		// 생성자이기에 괄호로 인자값을 바로 받아옴
		num n1 = new num(10, 20);
		n1.sum();
		n1.avg();
	}
}
