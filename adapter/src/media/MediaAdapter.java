package media;

public class MediaAdapter implements MediaPlayer{
	AdvancedMediaPlayer advancedMusicPlayer;
	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer = new VLCPlayer();
		}
		else if(audioType.equalsIgnoreCase("mp4")){
			advancedMusicPlayer = new MP4Player();
		}
	}
	public void play(String audioType, String filename) {
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer.playVLC(filename);
		}
		else if(audioType.equalsIgnoreCase("mp4")){
			advancedMusicPlayer.playMP4(filename);
		}
	}
}
