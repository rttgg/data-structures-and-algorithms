package code401challenges.hashtable;

import java.util.HashMap;

public class LeftJoin {

        public static HashMap<String, String[]> leftJoin(HashMap<String, String> synonymHashtable, HashMap<String, String> antonymHashtable) {
            HashMap<String, String[]> result = new HashMap<>();
            for (String key : synonymHashtable.keySet()) {
                String[] hashtableOutput = new String[2];
                hashtableOutput[0] = synonymHashtable.get(key);
                hashtableOutput[1] = antonymHashtable.containsKey(key) ? antonymHashtable.get(key) : null;
                result.put(key, hashtableOutput);
            }
            return result;
        }
    }

