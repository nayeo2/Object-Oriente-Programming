package object.hashcode;

import java.util.Objects;

public class ObjectExample {
	private int intField;
	private String stringField;
	
	public ObjectExample(int intField, String stringField) {
		this.intField = intField;
		this.stringField = stringField;
	}
	
	public int getIntField() {
		return intField;
	}
	
	public String getStringField() {
		return stringField;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;// 비용이 제일 덜 들고 같음을 보장 가능
		if(o == null || getClass() != o.getClass()) return false;//비용이 덜 들고 다름을 보장 가
		ObjectExample that = (ObjectExample) o;
		// 비용이 제일 큰 비교를 제일 마지막에
		return intField == that.intField && 
							Objects.equals(stringField, that.stringField) ;
	}
	
	// 해시값을 구하는 기준을 레퍼런스 주소를 기준으로 잡는지 아니면 멤버변수에 대입된 값으로 잡는지 차이를 만듦
	@Override
	public int hashCode() {
		return Objects.hash(intField, stringField);
	}
	
}
