import org.junit.Assert;
import org.junit.Test;

public class WordLengthTests {

    //setup
    public String str = "The cow jumped over the moon.";


    //tests
    @Test
    public void longestWordInSentence() {

        WordLength longest = WordLength.longest(str);

        Assert.assertTrue("jumped".equals(longest.word) && 6==longest.length);
    }

    @Test
    public void shortestWordInSentence() {

        WordLength shortest = WordLength.shortest(str);
        Assert.assertTrue("The".equals(shortest.word) && 3==shortest.length);
    }
}