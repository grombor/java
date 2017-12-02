import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	private static ArrayList<Album> albums = new ArrayList<Album>();
	
	public static void main(String[] args) {
		
//		Adding some albums
		
		Album album = new Album("ManOwaR", "Hearts of Steel");
		album.addSong("Call to Arms", 5.32);
		album.addSong("Hand of Doom", 5.50);
		album.addSong("Warriors of the World United", 5.51);
		album.addSong("Fight Until We Die", 4.08);
		albums.add(album);
		
		album = new Album("ManOwaR", "Fighting the World");
		album.addSong("Fighting the World", 3.53);
		album.addSong("Carry On", 4.18);
		album.addSong("Holy War", 4.42);
		album.addSong("Black Wind, Fire and Steel", 5.16);
		albums.add(album);
		
		LinkedList<Song> playList = new LinkedList<Song>();
			albums.get(0).addToPlaylist("Call to Arms", playList);
			albums.get(1).addToPlaylist(1, playList);
			albums.get(0).addToPlaylist(1, playList);
			albums.get(1).addToPlaylist("Black Wind, Fire and Steel", playList);
			albums.get(0).addToPlaylist(0, playList);
		
//		menu
		
		boolean quit = false;
		int action;
		Scanner s = new Scanner(System.in);
		ListIterator<Song> li = playList.listIterator();
		boolean forward = true;
		
		while (!quit) {
			
			printMenu();
			action = Integer.parseInt(s.nextLine());
			
			switch (action) {
				case 1:
					viewPlayList(playList);
					break;
				case 2:
					play(playList);
					break;
				case 3:
					if (forward) {
						if (li.hasNext()) {
							System.out.println("Now playing: " + li.next().toString());
						}
						else {
							System.out.println("You reach end of the playlist");
						}
					}
					else {
					}
					
					break;
				case 4:
					if (forward) {
						forward = false;
						if (li.hasPrevious()) {
							li.previous();
							System.out.println("Now playing: " + li.previous().toString());
						}
						else {
							System.out.println("You reach end of the playlist");
						}
					}
					else {
						System.out.println("Now playing: " + li.previous().toString());
					}
					
					break;
				case 9:
					System.out.println("Shutting down...");
					quit = true;
					break;
			}
		}
		

	}

	private static void viewPlayList(LinkedList<Song> playList) {
		if (playList.isEmpty()) {
			System.out.println("Playlist is empty");
		}
		else {
			Iterator<Song> iterator = playList.iterator();
			System.out.println("\t PLAYLIST");
			System.out.println("--------------------");
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			System.out.println("--------------------");
		}
	}

	private static void printMenu() {
		System.out.println("\n\t PLAYLIST");
		System.out.println("1. View playlists");
		System.out.println("2. Play playlist");
		System.out.println("3. Next song");
		System.out.println("4. Previous song");
		System.out.println("9. Quit");
		System.out.println("Choose an action: ");
	}

	private static void play(LinkedList<Song> playList) {
		ListIterator<Song> li = playList.listIterator();
		if (playList.size()==0) {
			System.out.println("Playlist is empty");
		}
		else {
			System.out.println("Now plalying " + li.next().toString());
		}
	}
}
