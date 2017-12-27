import java.io.File;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.concurrent.ThreadLocalRandom;


@WebServlet("/findMatch")
public class findMatch extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public findMatch() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		
		String userInput = request.getParameter("userInput");
		userInput = userInput.toLowerCase();
		
		String userSelect = request.getParameter("userSelect");
		//System.out.println(userInput);
		
		List<Album> allAlbums = new ArrayList<Album>();
		
		Album album1 = new Album("Because the Internet", "https://open.spotify.com/embed/album/0zi2TaQkYxfXIBvl2yTjQJ");
		
		Song song1 = new Song("Life: The Biggest Troll", "Childish Gambino");
		Song song2 = new Song("Crawl", "Childish Gambino");
		Song song3 = new Song("3005", "Childish Gambino");
		Song song4 = new Song("Earth: The Oldest Computer", "Childish Gambino");
		Song song5 = new Song("Pink Toes", "Childish Gambino");
		Song song6 = new Song("Shadows", "Childish Gambino");
		Song song7 = new Song("Sweatpants", "Childish Gambino");
		Song song8 = new Song("Telegraph Ave.", "Childish Gambino");
		Song song9 = new Song("Worldstar", "Childish Gambino");
		Song song10 = new Song("The Worst Guys", "Childish Gambino");
		Song song11 = new Song("Zealots of Stockholm", "Childish Gambino");
		
		File file1 = new  File(getServletContext().getRealPath("/songFiles/Life tbt.txt"));
		File file2 = new  File(getServletContext().getRealPath("/songFiles/Crawl.txt"));
		File file3 = new  File(getServletContext().getRealPath("/songFiles/3005.txt"));
		File file4 = new  File(getServletContext().getRealPath("/songFiles/Earth tot.txt"));
		File file5 = new  File(getServletContext().getRealPath("/songFiles/Pink Toes.txt"));
		File file6 = new  File(getServletContext().getRealPath("/songFiles/shadows.txt"));
		File file7 = new  File(getServletContext().getRealPath("/songFiles/Sweatpants.txt"));
		File file8 = new  File(getServletContext().getRealPath("/songFiles/Telegraph Ave.txt"));
		File file9 = new  File(getServletContext().getRealPath("/songFiles/World Star.txt"));
		File file10 = new  File(getServletContext().getRealPath("/songFiles/The Worst Guys.txt"));
		File file11 = new  File(getServletContext().getRealPath("/songFiles/Zealots of Stockholm.txt"));
		
		song1.populateLyrics(file1);
		song2.populateLyrics(file2);
		song3.populateLyrics(file3);
		song4.populateLyrics(file4);
		song5.populateLyrics(file5);
		song6.populateLyrics(file6);
		song7.populateLyrics(file7);
		song8.populateLyrics(file8);
		song9.populateLyrics(file9);
		song10.populateLyrics(file10);
		song11.populateLyrics(file11);
		
		List<Song> childishList = new ArrayList<Song>();
		
		childishList.add(song1);
		childishList.add(song2);
		childishList.add(song3);
		childishList.add(song4);
		childishList.add(song5);
		childishList.add(song6);
		childishList.add(song7);
		childishList.add(song8);
		childishList.add(song9);
		childishList.add(song10);
		childishList.add(song11);
		
		album1.setAllSongs(childishList);
		
		allAlbums.add(album1);
		
		
		//Drake
		Album album2 = new Album("More Life", "https://open.spotify.com/embed/album/1lXY618HWkwYKJWBRYR4MK"); 
		
		Song drake1 = new Song("Free Smoke", "Drake");
		Song drake2 = new Song("Passionfruit", "Drake");
		Song drake3 = new Song("Gyalchester", "Drake");
		Song drake4 = new Song("Portland", "Drake");
		Song drake5 = new Song("Sacrifices", "Drake");

		
		File file12 = new  File(getServletContext().getRealPath("/songFiles/Free Smoke.txt"));
		File file13 = new  File(getServletContext().getRealPath("/songFiles/Passionfruit.txt"));
		File file14 = new  File(getServletContext().getRealPath("/songFiles/Gyalchester.txt"));
		File file15 = new  File(getServletContext().getRealPath("/songFiles/Portland.txt"));
		File file16 = new  File(getServletContext().getRealPath("/songFiles/Sacrifices.txt"));

		
		drake1.populateLyrics(file12);
		drake2.populateLyrics(file13);
		drake3.populateLyrics(file14);
		drake4.populateLyrics(file15);
		drake5.populateLyrics(file16);

		
		List<Song> drakeList = new ArrayList<Song>();
		
		drakeList.add(drake1);
		drakeList.add(drake2);
		drakeList.add(drake3);
		drakeList.add(drake4);
		drakeList.add(drake5);

		
		album2.setAllSongs(drakeList);
		
		allAlbums.add(album2);
		
		//blackbear
		Album album3 = new Album("cybersex", "https://open.spotify.com/embed/album/1nXBX3wP3DQgwpqvVtJl8H"); 
		
		Song bear1 = new Song("g2g ttyl", "Blackbear");
		Song bear2 = new Song("down 4 u", "Blackbear");
		Song bear3 = new Song("anxiety", "Blackbear");
		Song bear4 = new Song("playboy shit", "Blackbear");
		Song bear5 = new Song("i hope ur whole life sux", "Blackbear");

		
		File file17 = new  File(getServletContext().getRealPath("/songFiles/g2g ttyl.txt"));
		File file18 = new  File(getServletContext().getRealPath("/songFiles/down 4u.txt"));
		File file19 = new  File(getServletContext().getRealPath("/songFiles/Anxiety.txt"));
		File file20 = new  File(getServletContext().getRealPath("/songFiles/Playboy Shit.txt"));
		File file21 = new  File(getServletContext().getRealPath("/songFiles/i hope ur whole life sux.txt"));

		
		bear1.populateLyrics(file17);
		bear2.populateLyrics(file18);
		bear3.populateLyrics(file19);
		bear4.populateLyrics(file20);
		bear5.populateLyrics(file21);

		
		List<Song> bearList = new ArrayList<Song>();
		
		bearList.add(bear1);
		bearList.add(bear2);
		bearList.add(bear3);
		bearList.add(bear4);
		bearList.add(bear5);

		
		album3.setAllSongs(bearList);
		
		allAlbums.add(album3);
		
		//Majid jordan
		
		Album album4 = new Album("The Space Between", "https://open.spotify.com/embed/album/6QC8G4HVk9lkbpxugU7ZgF");
		Song mj1 = new Song("Gave Your Love Away", "Majid Jordan");
		Song mj2 = new Song("OG Heartthrob", "Majid Jordan");
		Song mj3 = new Song("Body Talk", "Majid Jordan");
		Song mj4 = new Song("Not Ashamed", "Majid Jordan");
		Song mj5 = new Song("Phases", "Majid Jordan");

		
		File file22 = new  File(getServletContext().getRealPath("/songFiles/Gave Your Love Away.txt"));
		File file23 = new  File(getServletContext().getRealPath("/songFiles/OG Heartthrob.txt"));
		File file24 = new  File(getServletContext().getRealPath("/songFiles/Body Talk.txt"));
		File file25 = new  File(getServletContext().getRealPath("/songFiles/Not Ashamed.txt"));
		File file26 = new  File(getServletContext().getRealPath("/songFiles/Phases.txt"));

		
		mj1.populateLyrics(file22);
		mj2.populateLyrics(file23);
		mj3.populateLyrics(file24);
		mj4.populateLyrics(file25);
		mj5.populateLyrics(file26);

		
		List<Song> mjList = new ArrayList<Song>();
		
		mjList.add(mj1);
		mjList.add(mj2);
		mjList.add(mj3);
		mjList.add(mj4);
		mjList.add(mj5);

		
		album4.setAllSongs(mjList);
		
		allAlbums.add(album4);
		
		
		String artistString = "";
		String lyricString = "nothing";
		String songString = "";
		String embedString = "";
		String followedBy = "";
		
		if (userInput.length() > 3) {
		for (int k = 0; k < allAlbums.size(); k++) {
			//System.out.print("index: " + k);
			Album currAlbum = allAlbums.get(k);
		for (int j = 0; j < currAlbum.getAllSongs().size(); j++) {
			
			Song testSong = currAlbum.getAllSongs().get(j);
			System.out.println(j + testSong.getName());
			for (int i = 0; i < testSong.getSongLyrics().size(); i++) {
			
				if (testSong.getSongLyrics().get(i).getLine().toLowerCase().contains(userInput)) {
				System.out.println(i + testSong.getSongLyrics().get(i).getLine());
				artistString = testSong.getArtist();
				lyricString = testSong.getSongLyrics().get(i).getLine();
				if (i+1 < testSong.getSongLyrics().size()) {
					followedBy = testSong.getSongLyrics().get(i+1).getLine();
				}
				songString = testSong.getName();
				embedString = currAlbum.getEmbedCode();
				}
			
		}
		}
		}
		}
		
		//search failed
		List<Lyric> confident = new ArrayList<Lyric>();
		List<Lyric> romHappy = new ArrayList<Lyric>();
		List<Lyric> romSad = new ArrayList<Lyric>();
		List<Lyric> see = new ArrayList<Lyric>();
		if (lyricString.equals("nothing")) {
			System.out.println("in test   " + userSelect);
			Lyric rs1 = mj1.getSongLyrics().get(25);
			Lyric rs2 = bear1.getSongLyrics().get(27);
			Lyric rs3 = song6.getSongLyrics().get(14);
			Lyric rs4 = bear5.getSongLyrics().get(12);
			romSad.add(rs1);
			romSad.add(rs2);
			romSad.add(rs3);
			romSad.add(rs4);
			
			Lyric rh1 = song5.getSongLyrics().get(13);
			Lyric rh2 = mj2.getSongLyrics().get(4);
			Lyric rh3 = bear2.getSongLyrics().get(10);
			Lyric rh4 = song3.getSongLyrics().get(0);
			romHappy.add(rh1);
			romHappy.add(rh2);
			romHappy.add(rh3);
			romHappy.add(rh4);
			
			Lyric con1 = drake3.getSongLyrics().get(2);
			Lyric con2 = bear4.getSongLyrics().get(9);
			Lyric con3 = song7.getSongLyrics().get(10);
			Lyric con4 = song1.getSongLyrics().get(0);
			Lyric con5 = drake1.getSongLyrics().get(36);
			Lyric con6 = song2.getSongLyrics().get(9);
			confident.add(con1);
			confident.add(con2);
			confident.add(con3);
			confident.add(con4);
			confident.add(con5);
			confident.add(con6);
			
			if (userSelect.equals("romSad")) {
				System.out.println("in romSad");
				int randomNum = ThreadLocalRandom.current().nextInt(0, 4);
				System.out.println(randomNum + "  " + romSad.get(randomNum).getLine());
				lyricString = romSad.get(randomNum).getLine();
				if (lyricString.equals(rs1.getLine())) {
					songString = mj1.getName();
					artistString = mj1.getArtist();
					embedString = album4.getEmbedCode();
					followedBy = mj1.getSongLyrics().get(26).getLine();
				}
				if (lyricString.equals(rs2.getLine())) {
					songString = bear1.getName();
					artistString = bear1.getArtist();
					embedString = album3.getEmbedCode();
					followedBy = bear1.getSongLyrics().get(28).getLine();
				}
				if (lyricString.equals(rs3.getLine())) {
					songString = song6.getName();
					artistString = song6.getArtist();
					embedString = album1.getEmbedCode();
					followedBy = song6.getSongLyrics().get(15).getLine();
				}
				if (lyricString.equals(rs4.getLine())) {
					
						songString = bear5.getName();
						artistString = bear5.getArtist();
						embedString = album3.getEmbedCode();
						followedBy = bear5.getSongLyrics().get(13).getLine();
					
				}
			}
			
			if (userSelect.equals("romHappy")) {
				System.out.println("in romHappy");
				int randomNum = ThreadLocalRandom.current().nextInt(0, 4);
				System.out.println(randomNum + "  " + romHappy.get(randomNum).getLine());
				lyricString = romHappy.get(randomNum).getLine();
				if (lyricString.equals(rh1.getLine())) {
					songString = song5.getName();
					artistString = song5.getArtist();
					embedString = album1.getEmbedCode();
					followedBy = song5.getSongLyrics().get(14).getLine();
				}
				if (lyricString.equals(rh2.getLine())) {
					songString = mj2.getName();
					artistString = mj2.getArtist();
					embedString = album4.getEmbedCode();
					followedBy = mj2.getSongLyrics().get(5).getLine();
				}
				if (lyricString.equals(rh3.getLine())) {
					songString = bear2.getName();
					artistString = bear2.getArtist();
					embedString = album3.getEmbedCode();
					followedBy = bear2.getSongLyrics().get(11).getLine();
				}
				if (lyricString.equals(rh4.getLine())) {
					
						songString = song3.getName();
						artistString = song3.getArtist();
						embedString = album1.getEmbedCode();
						followedBy = song3.getSongLyrics().get(1).getLine();
					
				}
			}
			
			if (userSelect.equals("confident")) {
				System.out.println("in confident");
				int randomNum = ThreadLocalRandom.current().nextInt(0, 6);
				//System.out.println(randomNum + "  " + confident.get(randomNum).getLine());
				lyricString = confident.get(randomNum).getLine();
				if (lyricString.equals(con1.getLine())) {
					songString = drake3.getName();
					artistString = drake3.getArtist();
					embedString = album2.getEmbedCode();
					followedBy = drake3.getSongLyrics().get(3).getLine();
				}
				if (lyricString.equals(con2.getLine())) {
					songString = bear4.getName();
					artistString = bear4.getArtist();
					embedString = album3.getEmbedCode();
					followedBy = bear4.getSongLyrics().get(10).getLine();
				}
				if (lyricString.equals(con3.getLine())) {
					songString = song7.getName();
					artistString = song7.getArtist();
					embedString = album1.getEmbedCode();
					followedBy = song7.getSongLyrics().get(11).getLine();
				}
				if (lyricString.equals(con4.getLine())) {
					
						songString = song1.getName();
						artistString = song1.getArtist();
						embedString = album1.getEmbedCode();
						followedBy = song1.getSongLyrics().get(1).getLine();
					
				}
				if (lyricString.equals(con5.getLine())) {
					
					songString = drake1.getName();
					artistString = drake1.getArtist();
					embedString = album2.getEmbedCode();
					followedBy = drake1.getSongLyrics().get(37).getLine();
				
				}
				if (lyricString.equals(con6.getLine())) {
					
					songString = song2.getName();
					artistString = song2.getArtist();
					embedString = album1.getEmbedCode();
					followedBy = song2.getSongLyrics().get(10).getLine();
				
				}
			}
			
			
			
		}
		
		System.out.println("printing artist " + artistString);
		
		session.setAttribute("artistPass", artistString);
		session.setAttribute("lyricPass", lyricString);
		session.setAttribute("songPass", songString);
		session.setAttribute("embedPass", embedString);
		session.setAttribute("followPass", followedBy);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/results.jsp");
		dispatcher.forward(request, response);
		
	}
	}