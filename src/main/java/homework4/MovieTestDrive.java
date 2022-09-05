package homework4;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie("Gone with the Stock","Tragic", -2);
        one.title = "Gone with the Stock";
        one.genre = "Tragic";
        one.rating = -2;
        Movie two = new Movie("Lost in Cubicle Space","Comedy", 5);
        two.title = "Lost in Cubicle Space";
        two.genre = "Comedy";
        two.rating = 5;
        two.playIt();
        Movie three = new Movie("Byte Club", "Tragic but ultimately uplifting", 127);
        three.title = "Byte Club";
        three.genre = "Tragic but ultimately uplifting";
        three.rating = 127;


    }
}
