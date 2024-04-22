package com.example.study;

public class study_005 {
	public static void main(String[] args) {
		//대입 연산자, 1을 더하거나 빼주는 연산
		int i = 3;
		float f = 3.3F;
		
		//++i, --i 처럼 연산자가 앞에올 경우 연산을 먼저 처리 후 출력
		System.out.println(++i); //4
		System.out.println(--f); //2.3
		
		//연산자가 뒤에 올 경우 해당 줄까지 처리 후 다음줄부터 연산된 값 적용
		System.out.println(i++); // 출력 먼저 처리 후 연산
		System.out.println(i); // 연산된 값 출력
		
		//비교 연산자, 서로의 값을 비교하여 boolen값을 출력 ,boolen값은 true와 false로 나타남
		int a = 10;
		int b = 20;
		System.out.println(a>b);
		
		//대입 연산자, 값을 계산하여 대입
		int c = 2;
		c += 3;
		System.out.println(c);
		
		//논리 연산자 &&(and), 두 값의 결과가 모두 true일 경우 true이고 나머지는 false
		int p = 1;
		int q = 2;
		System.out.println(p>q && p<q); // false && true이기에 false
		System.out.println(p>0 && p<q); // true && true이기에 true
		
		//논리연산자 ||(or), 두 값의 결과가 모두 false 일 경우 false이고 나머지는 true
		System.out.println(p>q || p<q); // false && true이기에 true
		System.out.println(p<0 || p>q); // false && false이기에 false
		
		//논리연산자 !(not), 부정의 의미로 true는 false, false는 true로 바꿈
		System.out.println(!true);
		
		//시프트연산, 2진수에서 <<는 왼쪽 >>는 오른쪽으로 값을 시프트시킴
		int d = 4;
		System.out.println(d << 2);
		System.out.println(d << 3);
	}
}
	
