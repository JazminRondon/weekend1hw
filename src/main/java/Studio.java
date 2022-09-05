public class Studio {

    public static void main(String[] args) {
        //Artist(String artistName, String label

        String[] beyonceSongs = {"Who runs the world", "Halo", "Thick"};

        //for(int x=0; x < beyonceSongs.length; x++ ){
        //    System.out.println(beyonceSongs[x]);


        Artist artist1 = new Artist("Beyonce", "Universal", beyonceSongs);
        artist1.playPlaylist(artist1);
        System.out.println("=============================");
        String[] poloGSongs = {"RapStar", "Block-Party"};
        Artist artist2 = new Artist("PoloG", "Interscope", poloGSongs);
        artist2.playPlaylist(artist2);
    }
}

