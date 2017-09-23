package songObject;

public class Song {
	
	private String name;  // holds the name of song
	private String artist; // holds the artist's name
	private String album;  // holds the album's name
	private String year;  // holds the year album was created
	
	public Song(String name, String artist, String album, String year) { // constructor for Song
		
		this.name = name;
		this.artist = artist;
		this.album = album;
		this.year = year;
	}
	
	public String getName() {  // gets the name of song
		
		return name;
	}
	
	public String getArtist() { // gets the artist's name
		
		return artist;
	}
	
	public String getAlbum() {  // gets the name of album
		
		return album;
	}
	
	public String getYear() {  // gets the year album was created
		
		return year;
	}
	
	public void setName(String songName) {  // sets the name of song
		
		name = songName;
	}
	
	public void setArtist(String artistName) {  // sets the name of artist
		
		name = artistName;
	}
	
	public void setAlbum(String albumName) {  // sets the name of album
		
		album = albumName;
	}
	
	public void setYear(String year) {  // sets the year album was created 
		
		this.year = year;
	}
	
	
	

}
