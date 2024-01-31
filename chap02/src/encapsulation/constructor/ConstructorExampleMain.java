package encapsulation.constructor;

public class ConstructorExampleMain {

	public static void main(String[] args) {
		// CalculateCommand는 파라미터를 정확하게 주지 않으면 생성되지 않음
		CalculateCommand calculateCommand = new CalculateCommand(
				CalculateType.DIVIDE, 
				50, 
				3);
		
		Client client = new Client();
		int result = client.process(calculateCommand);
		
		System.out.println(result);

	}

}
