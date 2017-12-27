import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Song {

	private List<Lyric> songLyrics;
	private String songName;
	private String artist;
	public Song(String iSongName, String iArtist) {
		
		songLyrics = new ArrayList<Lyric>();
		songName = iSongName;
		artist = iArtist;
	}
	
	public String getArtist() {
		return artist;
	}
	public String getName() {
		return songName;
	}

	public List<Lyric> getSongLyrics() {
		return songLyrics;
	}

	public void setSongLyrics(List<Lyric> songLyrics) {
		this.songLyrics = songLyrics;
	}
	

	


	
	
	public void populateLyrics(File song) {
		
		try {
			// file = new File("test.txt");
			FileReader fileReader = new FileReader(song);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				
				Lyric newLyric = new Lyric(line);
				
				List<String> lineKeyWords = new ArrayList<String>();
				
				
				
				stringBuffer.append(line);
				stringBuffer.append("\n");
				
				//Get first word
				
				int firstSpaceIndex = 0;
				while (line.charAt(firstSpaceIndex) != ' ') {
					firstSpaceIndex++;
				}
				
				String firstWord = line.substring(0, firstSpaceIndex);
				//System.out.println(firstWord);
				lineKeyWords.add(firstWord);
				
				//Get later words
				for (int i = 0; i < line.length(); i++) {
					
				
					
					if (line.charAt(i) == ' ' && i < line.length() - 1) {
						//System.out.println("Found space");
						int j = i+1;
						while (line.charAt(j) != ' ' && j < line.length()-1) {
							j++;
							
						}
						String gotAWord = line.substring(i+1, j+1);
						//System.out.println(gotAWord);
						lineKeyWords.add(gotAWord);
					}
					
				}
				
				
				newLyric.setKeyWords(lineKeyWords);
				
				songLyrics.add(newLyric);
				
			}
			fileReader.close();
			//System.out.println("Contents of file:");
			//System.out.println(stringBuffer.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
