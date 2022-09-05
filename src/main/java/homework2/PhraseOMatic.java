package homework2;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"no more HW", "completed", "second one", "air head"};
        String[] wordListTwo = {"focus", "finish up", "count down", "grit", "motivation"};
        String[] wordListThree = {"likeable", "studious", "helpful", "study group", "extra credit", "another one"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //generate three random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        // now build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + wordListThree[rand3];

        //print phrase

        System.out.println("We are so happy: " + phrase);
    }
}

