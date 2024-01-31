package inheritance.overriding;

public class OverridingExampleMain {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Parent parentTypeChild = new Child();// 다형성
		
		parent.process();
		parentTypeChild.process(); // 오버라이딩이 전제된 메서드는 부모타입으로도 자식측으로 자동호출
		
	}
}
