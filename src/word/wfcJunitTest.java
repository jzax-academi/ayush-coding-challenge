package word;
import org.junit.Test;
import org.junit.Assert;
import java.util.List;
import java.util.Arrays;

//This class uses Junit to test the WordFrequencyCounter code
public class wfcJunitTest {

    @Test //Tests the basic functionality of the code
    public void basicFunctionalityTest() {
        String text = "Java is great. Java is popular. Java is powerful and Java is fun!";
        int N = 2;
        List<String> result = WordFrequencyCounter.getTopNWords(text, N);
        List<String> expected = Arrays.asList("is", "java"); 
        Assert.assertEquals(expected, result);
    }

    @Test //Tests the case sensitivity. "Java" vs "java"
    public void caseSensitivityTest() {
        String text = "javA jaVa jAva Java JAva jaVA";
        int N = 1;
        List<String> result = WordFrequencyCounter.getTopNWords(text, N);
        Assert.assertEquals(Arrays.asList("java"), result);
    }

    @Test //Tests whether punctuation is ignored
    public void punctuationTest() {
        String text = "Java yay! Java? Yay? Java, Yay! java YAY.";
        int N = 2;
        List<String> result = WordFrequencyCounter.getTopNWords(text, N);
        List<String> expected = Arrays.asList("java", "yay");
        Assert.assertEquals(expected, result);
    }

    @Test //Tests whether the result is returned in alphabetical order when frequency is the same
    public void alphabeticalOrderTest() {
        String text = "a b c c a b d e f";
        int N = 3;
        List<String> result = WordFrequencyCounter.getTopNWords(text, N);
        List<String> expected = Arrays.asList("a", "b", "c");
        Assert.assertEquals(expected, result);
    }   

    @Test //Tests whether empty text works
    public void emptyTextTest() {
        String text = "";
        int N = 5;
        List<String> result = WordFrequencyCounter.getTopNWords(text, N);
        Assert.assertTrue(result.isEmpty());
    }
    
    @Test //Tests for N = 0
    public void zeroNTest() {
        String text = "hello world";
        int N = 0;
        List<String> result = WordFrequencyCounter.getTopNWords(text, N);
        Assert.assertTrue(result.isEmpty());
    }
    
    @Test //Tests for N being more than number of words
    public void fewerNTest() {
        String text = "one two three";
        int N = 5;
        List<String> result = WordFrequencyCounter.getTopNWords(text, N);
        Assert.assertEquals(3, result.size());
    }
     
}
