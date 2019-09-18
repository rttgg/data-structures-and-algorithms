package code401challenges.hashtable;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class LeftJoinTest {

    @Test
    public void leftJoin() {
        HashMap<String, String> synonymHashtable = new HashMap<>();
        synonymHashtable.put("fond", "enamored");
        synonymHashtable.put("wrath", "anger");
        synonymHashtable.put("diligent", "employed");
        synonymHashtable.put("outfit", "garb");
        synonymHashtable.put("guide", "usher");

        HashMap<String, String> antonymHashtable = new HashMap<>();
        antonymHashtable.put("fond", "averse");
        antonymHashtable.put("wrath", "delight");
        antonymHashtable.put("diligent", "idle");
        antonymHashtable.put("guide", "follow");
        antonymHashtable.put("flow", "jam");

        String[] value1 = {"enamored", "averse"};
        String[] value2 = {"anger", "delight"};
        String[] value3 = {"employed", "idle"};
        String[] value4 = {"garb", null};
        String[] value5 = {"usher", "follow"};

        HashMap<String, String[]> newHashMap = new HashMap<>();
        newHashMap = LeftJoin.leftJoin(synonymHashtable, antonymHashtable);
        assertEquals(5, newHashMap.size());
        assertFalse(newHashMap.containsKey("flow"));
        assertArrayEquals(value1, newHashMap.get("fond"));
        assertArrayEquals(value2, newHashMap.get("wrath"));
        assertArrayEquals(value3, newHashMap.get("diligent"));
        assertArrayEquals(value4, newHashMap.get("outfit"));
        assertArrayEquals(value5, newHashMap.get("guide"));
        System.out.println(newHashMap);
    }
    }
