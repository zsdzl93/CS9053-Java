package edu.nyu.cs9053.homework3.oo;
import java.io.PrintStream;

public class Letter {
    
    public final PrintStream prtStream;
    public final char[][] asciiArt;
    
    public Letter(char[][] asciiArt, PrintStream prtStream) {
        this.asciiArt = asciiArt;
        this.prtStream = prtStream;
    }
    
    public void print() {
        for(int i=0; i<10; ++i) {
            for(int j = 0; j<20; ++j) {
                prtStream.print(asciiArt[i][j]);
            }
            prtStream.println();
        }
    }
    
}