package inheritance.extend;

public class ExtendsExampleMain {

	public static void main(String[] args) {
		Parent parent = new Parent(); // 부모타입 변수에 부모타입 객체 대입
		Parent parentTypeChild = new Child(); // 부모타입 변수에 자식타입 객체 대입, 다형성
		Child child = new Child(); // 자식타입 변수에 자식타입 객체 대입
		
		parent.process();
		System.out.println("--------------");
		parentTypeChild.process();
		//parentTypeChild.childProcess();// Child타입 객체 내부에 선언된 요소는 Parent로 호출불가
		System.out.println("--------------");
		child.process();
		child.childProcess();
	}

}
