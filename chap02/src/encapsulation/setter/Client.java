package encapsulation.setter;

public class Client {

	public int process(CalculateCommand calculateCommand) {
		// 클라이언트는 연산 결과를 달라고 주문만 하면 됨.
		// 클라이언트가 getter를 호출하려 해도 CalculateCommand내부 구조를 추론할 수 없음
		int result = calculateCommand.getCalculateResult();
		
		return result;
	}
}
