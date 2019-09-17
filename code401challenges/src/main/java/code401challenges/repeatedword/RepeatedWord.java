package code401challenges.repeatedword;


import java.util.HashSet;
import java.util.Set;

public class RepeatedWord {
    public static String theFirstRepeatWord(String input){
        if(input != null){
            Set<String> words = new HashSet<String>();
            String[] splitWords = input.toLowerCase().split("\\W+");
            for(String word : splitWords){
                if(words.contains(word)){
                    return word;
                } else {
                    words.add(word);
                }
            }
            return splitWords[0];

        }
        return null;
    }


}
