package exception.unchecked_exception;

public class Client {

	
	public void throwsUncheckedExceptionMethod() throws UncheckedException {
		throw new UncheckedException();
	}
	
	public void tryCatchUncheckedExceptionMethod() {
		// try~catch 처리를 사용하는게 강제되진 않지만 사용을 못 하는것도 아님
		//try {
			throw new UncheckedException();
		//} catch(UncheckedException e) {
		//	e.printStackTrace();
		//}
	}
	
}
