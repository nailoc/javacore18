package com.hk.app;

import java.util.HashMap;

// 도서관리하는 클래스 - 추가, 목록, 검색 등등 할 수 있음
public class BookManager {
	
	HashMap<String, Book> book_dic = new HashMap<String, Book>();
	// 첫번째 String 고유한 문자열 - 키값으로 사용하기 바랍니다
	public int selectMenu() {
		// 1.추가 2.목록 0.종료
		return 0;
	}
	
	
	public void add() {
		// 도서를 추가
	}
	
	public void list() {
		// 도서목록 출력
	}

}
