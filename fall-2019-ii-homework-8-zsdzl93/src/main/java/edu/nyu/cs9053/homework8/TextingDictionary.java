package edu.nyu.cs9053.homework8;

import java.util.ArrayList;
import java.util.List;

public class TextingDictionary {

    private static final List<String> dictionary = new ArrayList<>(10);

    private boolean isWordValid(String word) {
        if (word == null || word.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be null or empty");
        }

        for (int i=0; i<word.length(); ++i) {
             try {
                if (!Character.isLetter(word.charAt(i))) {
                    throw new IllegalArgumentException("contains non-letter: " + word);
                }
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(e);
            }
        }
        return true;
    }

    public void insert(String word) {
        if (isWordValid(word)) {
            dictionary.add(word);
        }
    }

    public List<String> search(List<ValidTextKeyPress> prefixes) {
        List<String> listOfWords = new ArrayList<>();

        for (String word : dictionary) {
            for (int i=0; i<prefixes.size(); ++i) {
                if (!prefixes.get(i).getPossibleLetters().contains(word.charAt(i))) {
                    break;
                }
                if (i == prefixes.size() - 1) {
                    listOfWords.add(word);
                }
            }
        }
        return listOfWords;
    }

}
