package enum_.basic;

public class Client {
	public int process(CalculateCommand calculateCommand) {
		CalculateType calculateType = calculateCommand.getCaculcateType();
		int num1 = calculateCommand.getNum1();
		int num2 = calculateCommand.getNum2();
		
		int result = 0;
		
		if(calculateType.equals(CalculateType.ADD)) {
			result = num1 + num2;
		}else if(calculateType.equals(CalculateType.MINUS)) {
			result = num1 - num2;
		}else if(calculateType.equals(CalculateType.MULTIPLY)) {
			result = num1 * num2;
		}else if(calculateType.equals(CalculateType.DIVIDE)) {
			result = num1 / num2;
		}
		
		return result;
	}

}
