package com.example.study;

// 클래스 생성, Calculator의 설계도, main메소드에서 생성한 객체에 해당하는 부분
class Calculator {
	int left ,right;
	//static은 클래스에서 공유되는 변수나 메서드를 정의, 클래스 변수 생성
	//base를 0으로 세팅
	static int base = 0;
	
	public void setOprands(int left, int right) {
		//인자로 받은 left와 right를 Calculator클래스 전역에서 사용할 수 있도록 this.left에 넣어줌
		this.left = left; 
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right+base);
	}
	public void avg() {
		System.out.println((this.left+this.right+base)/2);
	}	
}

// 객체를 생성하지 않고 한번만 사용
class Calculator2{
	//static을 사용해 클래스 변수처럼 메소드를 클래스 소속으로 만들어줌
	public static void sum(int left, int right) {
		System.out.println(left+right);
	}
}

public class study_016 {
	public static void main(String[] args) {
		
		//Calculator객체 생성 후 c1에 넣기, c1은 Calculator를 담을 수 있는 데이터 형을 가진 변수, 인스턴스화
		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		
		// 객체를 재활용
		Calculator c2 = new Calculator();
		c2.setOprands(20, 40);
		// Calculator클래스에서 base를 0으로 세팅했지만 10으로 수정 가능
		//클래스 변수를 사용할 때에는 객체이름 혹은 객체가 담긴 변수를 앞에 써서 사용한다.
		c2.base = 10;
		c2.sum();
		c2.avg();
		
		// 재활용 하지않고 한번만 사용할 경우에는 인스턴트하지 않고 사용
		Calculator2.sum(20,10);
	}
}



