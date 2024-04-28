package com.example.study;

//인터페이스는 오로지 추상 메소드와 상수만을 포함
interface I1{
	public static final int a = 1;
	public abstract void z();
}
interface I2{
	public abstract void x();
}

//인터페이스는 다중 상속이 가능하다는 장점, 
// 클래스 Inter는 인터페이스 I1,I2를 구현 ,implements
class Inter implements I1,I2{
	// 인터페이스 I1,I2에 있는 것을 클래스에서 구현해야 에러가 나지않음
	public void z() {
		System.out.println(a+1);
	}
	public void x() {
		System.out.println(2);
	}
}


public class study_022 {
	public static void main(String[] args) {
		Inter i = new Inter();
		i.z();
		i.x();
	}
}
