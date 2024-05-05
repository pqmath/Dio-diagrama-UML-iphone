package iphone;

import iphone.browser.Browser;
import iphone.music_player.Music_Player;
import iphone.telephone.Telephone;

public class Iphone implements Browser, Music_Player, Telephone {

	public void chooseSong() {
		System.out.println("Choose a song to listen.");
	}

	public void play() {
		System.out.println("Playing the song.");
	}

	public void pause() {
		System.out.println("Song paused.");
	}

	public void makeCall() {
		System.out.println("Calling...");
	}

	public void joinCall() {
		System.out.println("Joining the call.");
	}

	public void startVoiceMessage() {
		System.out.println("Starting the voice message, say something cool");
	}
	
	public void showWebPage() {
		System.out.println("Opening web page... \nPage opened.");
	}

	public void closeWebPage() {
		System.out.println("Page closed.");
	}

	public void refreshWebPage() {
		System.out.println("Updating the page...\r\n" + "Page successfully updated!");
	}

	
}
