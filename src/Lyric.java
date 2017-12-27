import java.util.List;

public class Lyric {

	private List<String> keyWords;
	
	private String line;
	
	private String feels;
	

	

	

	public Lyric(String iLine) {
		
		line = iLine;

		feels = null;
		
	}
	

	
	public void setFeels(String type) {
		
		feels = type;
		
		
	}
	
	public String getFeels() {
		return feels;
	}


	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public List<String> getKeyWords() {
		return keyWords;
	}

	public void setKeyWords(List<String> keyWords) {
		this.keyWords = keyWords;
	}
}
