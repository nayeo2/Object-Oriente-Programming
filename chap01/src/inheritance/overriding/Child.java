package inheritance.overriding;

public class Child extends Parent {
	
	// 오버라이딩 : 부모쪽 메서드와 시그니처는 같지만 실행구문이 달라짐
	@Override
	public void process() {
		System.out.println("Child process()");
	}

}
