package code401challenges.hashtable;

import code401challenges.hashtable.RepeatedWord;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {

    @Test
    public void firstReapeating() {
        String test = "Once upon a time, there was a brave princess who...";
        assertEquals("should be", "a", RepeatedWord.theFirstRepeatWord(test));
        System.out.println(RepeatedWord.theFirstRepeatWord(test));
    }


    @Test
    public void firstReapeatingTwoWords() {
        String test = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, " +
                "it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, " +
                "it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all " +
                "going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, " +
                "that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of " +
                "comparison only...";
        assertEquals("should be", "it", RepeatedWord.theFirstRepeatWord(test));
        System.out.println(RepeatedWord.theFirstRepeatWord(test));
    }

    @Test
    public void firstReapeatingLongWords() {
        String test = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, " +
                "and I didn’t know what I was doing in New York...";
        assertEquals("should be", "summer", RepeatedWord.theFirstRepeatWord(test));
        System.out.println(RepeatedWord.theFirstRepeatWord(test));
    }


}