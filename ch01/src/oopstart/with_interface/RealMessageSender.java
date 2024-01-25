package oopstart.with_interface;

public class RealMessageSender implements MessageSender{
	
	@Override
	public void send() {
		System.out.println("RealMessage");
	}

}
