package designPattern;

public class SingletonPattern {
	// 기본
	// 정적 필드
	private static SingletonPattern singleton = new SingletonPattern();

	// 생성자
	private SingletonPattern() {
	}

	// 정적 메소드
	static SingletonPattern getInstance() {
		return singleton;
	}
}
