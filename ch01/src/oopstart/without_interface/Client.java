package oopstart.without_interface;

public class Client {
	public void process() {
		// RealMessageSender messageSender = new RealMessageSender();
		FakeMessageSender messageSender = new FakeMessageSender();
		messageSender.send();
	}
}
