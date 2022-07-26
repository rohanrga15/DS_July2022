
public class AssociationAssignment
{
	public static void main(String[] args) 
	{
		Genre a = new Genre("Rock", "Hard rock");
		Genre b = new Genre("Rock", "Soft rock");
		
		Artist a1 = new Artist("Bob seger", 10, b);
		Artist a2 = new Artist("John Frusciante", 50, b);
		Artist a3 = new Artist("Van Halen", 20, a);
		
		Song s1 = new Song("Rock", "Soft rock", "Snow", 7.5, "Californication", a2);
		Song s2 = new Song("Rock", "Soft rock", "Turn the page", 10, "72", a1);
		
//		PlayList p = new PlayList();
//		MusicApp mm = mm.createPlaylist(s1, s2);
		MusicApp mm = new MusicApp(s1, s2);
		mm.createPlaylist(s1, s2);
//		mm.showMusic(s1);
	}
}

class Genre
{
	String masterType;
	String childType;
	public Genre(String masterType, String childType) 
	{
		super();
		this.masterType = masterType;
		this.childType = childType;
	}
	
	void showGenre()
	{
		System.out.println("The genre is     : "+masterType);
		System.out.println("The sub-genre is : "+childType);
	}
}

class Artist
{
	String name;
	int songs;
	Genre ref;
	public Artist(String name, int songs, Genre ref)
	{
		super();
		this.name = name;
		this.songs = songs;
		this.ref = ref;
	}	
	
	void showArtist()
	{
		System.out.println("Artist           : "+name);
		System.out.println("Number of songs  : "+songs);
		ref.showGenre();
	}
}

class Song extends Genre
{
	String name;
	double len;
	String album;
	Artist ref1;
	public Song(String masterType, String childType, String name, double len, String album, Artist ref1)
	{
		super(masterType, childType);
		this.name = name;
		this.len = len;
		this.album = album;
		this.ref1 = ref1;
	}
	
	void showSong()
	{
		System.out.println("Name of song     : "+name);
		System.out.println("Duration of song : "+len);
		System.out.println("Album            : "+album);
		ref1.showArtist();
	}
}

/*class PlayList
{
	MusicApp createPlaylist(Song r1, Song r2)
	{
		MusicApp m1 = new MusicApp(r1, r2);
		return m1;
	}
	
}*/

class MusicApp
{
	Song ref1;
	Song ref2;
	Song ref3;
	public MusicApp(Song ref1)
	{
		super();
		this.ref1 = ref1;
	}
	public MusicApp(Song ref1, Song ref2)
	{
		super();
		this.ref1 = ref1;
		this.ref2 = ref2;
	}
	public MusicApp(Song ref1, Song ref2, Song ref3)
	{
		super();
		this.ref1 = ref1;
		this.ref2 = ref2;
		this.ref3 = ref3;
	}

	void createPlaylist(Song ref1)
	{
		System.out.println("This playlist has :  ");
		System.out.println("-------------------------------------");
		ref1.showSong();
		System.out.println("-------------------------------------");
	}
	void createPlaylist(Song ref1, Song ref2)
	{
		System.out.println("This playlist has :  ");
		System.out.println("-------------------------------------");
		ref1.showSong();
		System.out.println("-------------------------------------");
		ref2.showSong();
		System.out.println("-------------------------------------");
	}
	void createPlaylist(Song ref1, Song ref2, Song ref3)
	{
		System.out.println("This playlist has :  ");
		System.out.println("-------------------------------------");
		ref1.showSong();
		System.out.println("-------------------------------------");
		ref2.showSong();
		System.out.println("-------------------------------------");
		ref3.showSong();
		System.out.println("-------------------------------------");
	}
}


