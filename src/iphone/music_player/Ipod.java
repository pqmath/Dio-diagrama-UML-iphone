package iphone.music_player;

public class Ipod implements Music_Player{

	public void chooseSong() {
		System.out.println("Choose a song to listen.");
	}

	public void play() {
		System.out.println("Playing the song.");
	}

	public void pause() {
		System.out.println("Song paused.");
	}

}
