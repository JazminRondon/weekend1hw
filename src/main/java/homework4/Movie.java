package homework4;

public class Movie {
    String title;
    String genre;
    int rating;

    public void playIt(){
        System.out.println("Playing the movie " + title +"\nGenre :" + genre + "\nRating :" + rating);
    }
    public Movie(String title, String genre, int rating){
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }
}
