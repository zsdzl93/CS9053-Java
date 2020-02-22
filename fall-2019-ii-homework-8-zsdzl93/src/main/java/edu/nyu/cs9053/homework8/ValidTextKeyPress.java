package edu.nyu.cs9053.homework8;

import java.util.Arrays;
import java.util.List;

public enum ValidTextKeyPress {
    Two(Arrays.asList('a', 'b', 'c', 'A', 'B', 'C')),

    Three(Arrays.asList('d', 'e', 'f', 'D', 'E', 'F')),

    Four(Arrays.asList('g', 'h', 'i', 'G', 'H', 'I')),

    Five(Arrays.asList('j', 'k', 'l', 'J', 'K', 'L')),

    Six(Arrays.asList('m', 'n', 'o', 'M', 'N', 'O')),

    Seven(Arrays.asList('p', 'q', 'r', 's', 'P', 'Q', 'R', 'S')),

    Eight(Arrays.asList('t', 'u', 'v', 'T', 'U', 'V')),

    Nine(Arrays.asList('w', 'x', 'y', 'z', 'W', 'X', 'Y', 'Z'));

    private final List<Character> possibleLetters;

    ValidTextKeyPress(List<Character> possibleLetters) {
        this.possibleLetters = possibleLetters;
    }

    public List getPossibleLetters() {
        return possibleLetters;
    }
}
