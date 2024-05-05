package iphone.telephone;

public class Corded_Phone implements Telephone {

	public void makeCall() {
		System.out.println("Calling...");
	}

	public void joinCall() {
		System.out.println("Joining the call");
	}

	public void startVoiceMessage() {
		System.out.println("Starting the voice message, say something cool");
	}

}
