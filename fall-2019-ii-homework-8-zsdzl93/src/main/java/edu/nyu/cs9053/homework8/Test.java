package edu.nyu.cs9053.homework8;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        TextingDictionary dictionary = new TextingDictionary();

        dictionary.insert("Brian");
        dictionary.insert("brain");
        dictionary.insert("braid");
        dictionary.insert("br@!d");

        List<String> result = dictionary.search(Arrays.asList(ValidTextKeyPress.Two, ValidTextKeyPress.Seven));

        for (String word : result) {
            System.out.println(word);
        }
    }
}
