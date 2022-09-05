
public class Artist {
    //name, label, song
    //instance variable,properties,fields, attributes
    public String artistName;
    public String label;
    public String[] songs;

    //constructor a template for making artist in main
    public Artist(String artistName, String label, String[] songs) {
        this.artistName = artistName;
        this.label = label;
        this.songs = songs;

    }

    //sing - a method
    //print artist name and label
    public void printArtistInfo() {
        System.out.println(this.artistName + " " + this.label);

    }

    //
    public void playPlaylist(Artist artist) {
        for (int x = 0; x < songs.length; x++) {
            System.out.println(songs[x]);
        }

    }
}



