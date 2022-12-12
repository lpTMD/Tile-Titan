	package spaceyshooter;

	import java.io.File;
	import java.io.IOException; 
	import javax.sound.sampled.*;

	// Class to hold and produces sound
	
	public class Sound
	{
		// Initializes 
		public static final File music = new File( "src/Resources/Sound/Music.wav");

		// Throwing exceptions in case of errors such as file missing or not incompatible, ran in Main
		public static void Music() throws LineUnavailableException, IOException, UnsupportedAudioFileException 
		{
			// Selection of clip from AudioInput
	        Clip backgroundMusic = AudioSystem.getClip();
	        // Selects channel of input to place audio file
	        AudioInputStream sound = AudioSystem.getAudioInputStream(music);
	        // Plays sound
	        backgroundMusic.open(sound);
	        // Loops Music
	        backgroundMusic.loop(Clip.LOOP_CONTINUOUSLY);
	    }
	}

