public class WordLength {

    // Vars
    public String word;
    public int length;

    //constructor
    public WordLength(String word, int length) {
        this.word = word;
        this.length = length;
    }


    public static WordLength longest(String str) {

        String[] wordarray = str.split(" ");
        String longestWord = "";

        for (String word : wordarray) {
            if (longestWord.length() < word.length()) {
                longestWord = word;
            }
        }
        return new WordLength(longestWord, longestWord.length());
    }


    public static WordLength shortest(String str) {

        String[] wordarray = str.split(" ");
        String shortestWord = wordarray[0];

        for (String word : wordarray) {
            if (shortestWord.length() > word.length()) {
                shortestWord = word;
            }
        }
        return new WordLength(shortestWord, shortestWord.length());
    }

}



