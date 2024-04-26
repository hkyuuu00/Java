package com.example.study;

class Name{
	String a;
	int b, c;
	
	public void setInfo(String a, int b){
		this.a = a;
		this.b = b;
	}
	// 같은 메소드가 2개이지만 인자를 3개 받아오고 변수를 3개 생성
	public void setInfo(String a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public void Card() {
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
	}
}
//상속받은 자식클래스에서 부모클래스의 메소드를 재정의 하는것을 오버라이드, 메소드 이름이 같아야 함.
class Name2 extends Name{
	public void Card() {
		System.out.println("이름은 "+this.a+"이고 학번은 "+this.b+"입니다");
	}
}
public class study_019 {
	public static void main(String[] args) {
		Name n = new Name();
		// 메소드의 이름은 같지만 받는 인자값의 개수가 다르기에 서로 맞는 인자값을 전달, 오버로딩
		n.setInfo("Lee", 20190000);
		n.setInfo("Lee", 20190000, 991122);
		n.Card();
		
		Name2 n2 = new Name2();
		n2.setInfo("Lee", 20190000);
		n2.Card();
	}
}
