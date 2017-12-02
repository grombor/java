import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	
	private String name;
	private String artist;
	private ArrayList<Song> songs;
	
	public Album(String name, String artist) {
		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<Song>();
	}
	
	public void addSong(String title, double duration) {
		if (checkTitle(title)==null) {
			this.songs.add(new Song(title, duration));
		}
		else {
			System.out.println("Title already exists");
		}
	}
	
	public void addToPlaylist(int trackNumber, LinkedList<Song> playList) {
		int index = trackNumber-1;
		if ((index>=0) && (index<=playList.size())) {
			playList.add(this.songs.get(index));
			System.out.println("Song added");
		}
		else {
			System.out.println("Error - track doesnt exist");
		}
	}
	
	public void addToPlaylist(String title, LinkedList<Song> playList) {
		Song checkSong = checkTitle(title);
		if (checkSong!=null) {
			playList.add(checkSong);
			System.out.println("Song added");
		}
		else {
			System.out.println("Song not found");
		}
	}
	
	public ArrayList<Song> getSongs() {
		return songs;
	}
	
	private Song checkTitle (String title) {
		for (Song checkSong:this.songs) {
			if (checkSong.getName().equals(title)) {
				return checkSong;
			}
		}
		return null;
	}
}
