package com.example.study;

class number{
	int a,b;
	public number() {}
	public number(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void setNum(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void firstNum() {
		System.out.println(this.a+this.b);
	}
	public void secondNum() {
		System.out.println(this.a-this.b);
	}
}
//number2 클래스에서 number 클래스를 상속, 부모의 필드와 메소드를 상속받음
class number2 extends number{
	public void thirdNum() {
		System.out.println(this.a*this.b);
	}
}
class number3 extends number{
	// 생성자 생성
	public number3(int a, int b){
		// super을 이용해 부모클래스와 자식클래스의 멤버변수 이름이 같을 경우 구분, 부모의 *생성자*를 호출
		// super는 항상 첫줄에 사용
		super(a,b);
	}
	public void fourthNum() {
		System.out.println(a/b);
	}
}
public class study_018 {
	public static void main(String[] args) {
		// 상속받은 클래스를 객채화
		number2 n2 = new number2();
		// 상속 받았기에 부모 메소드들에 접근 가능
		n2.setNum(30,10);
		n2.firstNum();
		n2.secondNum();
		n2.thirdNum();
		
		// 부모 생성자를 super로 가져왔고 인자값 넣어주기
		number3 n3 = new number3(30,10);
		n3.fourthNum();
	}
}
