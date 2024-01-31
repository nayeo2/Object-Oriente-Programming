package enum_.adv;

public class CalculateCommand {
	private CalculateType caculcateType; // ADD, MINUS, MULTIPLY, DIVIDE 중 하나만 대입가능
	private int num1;
	private int num2;
	
	public CalculateCommand(CalculateType calculateType, int num1, int num2) {
		this.caculcateType = calculateType;
		this.num1 = num1;
		this.num2 = num2;
	}

	public CalculateType getCaculcateType() {
		return caculcateType;
	}

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}
}
