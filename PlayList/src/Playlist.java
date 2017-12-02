import java.util.ArrayList;
import java.util.LinkedList;

public class Playlist {
	private ArrayList<Album> albums;
	
	
	public Playlist() {
		this.albums = new ArrayList<Album>();
	}

	public ArrayList<Album> getAlbums() {
		return albums;
	}
	
	public void viewAlbums() {
		for (int i=0; i<albums.size(); i++) {
			System.out.println(albums.get(i));
		}
	}
	
}
