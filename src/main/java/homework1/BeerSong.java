public class BeerSong {
    public static void main(String[] args) {

        // variables
        int beerNum = 99;
        String word = "bottles";
        String singleWord = "bottle";

        while (beerNum > 0) {

            if (beerNum > 1) {
                System.out.println(beerNum + " " + word + " of beer on the wall");
                System.out.println(beerNum + " " + word + " of beer.");
                System.out.println("take one down.");
                System.out.println("Pass it around.");

            }


            if (beerNum == 1) {
                System.out.println(beerNum + " " + singleWord + " of beer on the wall");
                System.out.println(beerNum + " " + singleWord + " of beer.");
                System.out.println("take one down.");
                System.out.println("Pass it around.");
                System.out.println("No more bottles of beer on the wall");
            }


            //end else



//            System.out.println(beerNum + " " + word + " of beer on the wall");
//            System.out.println(beerNum + " " + word + " of beer.");
//            System.out.println("take one down.");
//            System.out.println("Pass it around.");
            beerNum = beerNum - 1;

//            if (beerNum > 0) {
//                System.out.println(beerNum + " " + word + " of beer on the wall");
//            }
//            else {

//                //end else
        }
    } //end while loop
} //end main method
//end class