import java.util.ArrayList;
import java.util.List;
public class Album {

	private List<Song> allSongs;
	private String albumName;
	private String embedCode;
	
	public Album(String iName, String iEmbedCode) {
		setAlbumName(iName);
		embedCode = iEmbedCode;
	}
	public String getEmbedCode() {
		return embedCode;
	}

	public void setEmbedCode(String embedCode) {
		this.embedCode = embedCode;
	}

	public Album(String iAlbumName) {
		setAlbumName(iAlbumName);
		allSongs = new ArrayList<Song>();
	}

	public List<Song> getAllSongs() {
		return allSongs;
	}

	public void setAllSongs(List<Song> allSongs) {
		this.allSongs = allSongs;
	}
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	
}
