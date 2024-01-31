package abstractlayer.interface_;

public class ImplementsClass implements SomeInterface, AnotherInterface {

	@Override
	public void anotherMethod() {
		// 리스코프 치환 원칙 : 자식의 실행 커버리지는 부모의 실행 커버리지보다 넓어져서는 안 된다. 
		System.out.println("ImplementsClass의 anotherMethod()");
		
	}

	@Override
	public void someMethod() {
		System.out.println("ImplementsClass의 someMEthod()");
	}

}
