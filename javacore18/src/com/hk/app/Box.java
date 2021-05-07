package com.hk.app;

// 박스라는 클래스를 정의
public class Box {
	
	private Object data; 

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	// 메인함수 테스트
	public static void main(String[] args) {
		
		Box b = new Box();  // 숫자를 담겠다
		int score = 80;
		b.setData(score);
		
		Box b2 = new Box(); // 문자열을 담겠다
		String name = "자바월드";
		b2.setData(name);
		
		int rstScore = 0;
		String rstName = "";
		
		rstScore = (int)b.getData();
		rstName = (String)b2.getData();
		
		System.out.println(rstName + ":" + rstScore);
		
	}
}
