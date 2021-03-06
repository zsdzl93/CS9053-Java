package edu.nyu.cs9053.homework3.oo;
import edu.nyu.cs9053.homework3.oo.*;
import java.io.PrintStream;

public class AsciiArt {
    
    public static void main(String[] args) {
        PrintStream prtStream = new PrintStream(System.out);
        
        private final char[][][] asciiArt = new char[36][10][20];
        asciiArt[0] = new char[][] {
            {' ',' ',' ',' ',' ',' ',' ',' ',' ','0','0','0',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ','0',' ',' ',' ','0',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','0',' ',' ',' ',' ',' ','0',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','0',' ',' ',' ',' ','0','0',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','0',' ',' ',' ','0',' ','0',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','0',' ',' ','0',' ',' ','0',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','0',' ','0',' ',' ',' ','0',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','0','0',' ',' ',' ',' ','0',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ','0',' ',' ',' ','0',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ','0','0','0',' ',' ',' ',' ',' ',' ',' ',' '},
        };
        
        asciiArt[1] = new char[][] {
            {' ',' ',' ',' ',' ',' ',' ',' ',' ','1','1',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','1',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','1',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','1',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','1',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','1',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','1',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','1',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','1',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','1','1','1','1','1','1','1',' ',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[2] = new char[][] {
            {' ',' ',' ',' ',' ',' ',' ','2','2','2','2','2','2',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','2',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','2',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','2',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','2',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','2','2','2','2','2','2',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','2',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','2',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','2',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','2','2','2','2','2','2',' ',' ',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[3] = new char[][] {
            {' ',' ',' ',' ',' ',' ',' ','3','3','3','3','3','3',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','3',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','3',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','3',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ','3','3','3','3',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','3',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','3',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','3',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','3',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','3','3','3','3','3','3',' ',' ',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[4] = new char[][] {
            {' ',' ',' ',' ',' ',' ',' ','4',' ',' ',' ',' ','4',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','4',' ',' ',' ',' ','4',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','4',' ',' ',' ',' ','4',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','4',' ',' ',' ',' ','4',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','4',' ',' ',' ',' ','4',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','4','4','4','4','4','4',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','4',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','4',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','4',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','4',' ',' ',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[5] = new char[][] {
            {' ',' ',' ',' ',' ',' ',' ','5','5','5','5','5','5',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','5',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','5',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','5',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','5','5','5','5','5','5',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','5',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','5',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','5',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','5',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','5','5','5','5','5','5',' ',' ',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[6] = new char[][] {
            {' ',' ',' ',' ',' ',' ',' ','6','6','6','6','6','6',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','6',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','6',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','6',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','6','6','6','6','6','6',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','6',' ',' ',' ',' ','6',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','6',' ',' ',' ',' ','6',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','6',' ',' ',' ',' ','6',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','6',' ',' ',' ',' ','6',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','6','6','6','6','6','6',' ',' ',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[7] = new char[][] {
            {' ',' ',' ',' ',' ',' ',' ','7','7','7','7','7','7',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','7',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','7',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','7',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','7',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','7',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','7',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','7',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','7',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','7',' ',' ',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[8] = new char[][] {
            {' ',' ',' ',' ',' ',' ',' ','8','8','8','8','8','8',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','8',' ',' ',' ',' ','8',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','8',' ',' ',' ',' ','8',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','8',' ',' ',' ',' ','8',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','8','8','8','8','8','8',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','8',' ',' ',' ',' ','8',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','8',' ',' ',' ',' ','8',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','8',' ',' ',' ',' ','8',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','8',' ',' ',' ',' ','8',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','8','8','8','8','8','8',' ',' ',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[9] = new char[][] {
            {' ',' ',' ',' ',' ',' ',' ','9','9','9','9','9','9',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','9',' ',' ',' ',' ','9',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','9',' ',' ',' ',' ','9',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','9',' ',' ',' ',' ','9',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','9','9','9','9','9','9',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','9',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','9',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','9',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','9',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','9','9','9','9','9','9',' ',' ',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[10] = new char[][] {
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','A',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ','A',' ','A',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ','A',' ',' ',' ','A',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','A',' ',' ',' ',' ',' ','A',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','A',' ',' ',' ',' ',' ',' ',' ','A',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','A','A','A','A','A','A','A','A','A',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','A',' ',' ',' ',' ',' ',' ',' ','A',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','A',' ',' ',' ',' ',' ',' ',' ','A',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','A',' ',' ',' ',' ',' ',' ',' ','A',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','A',' ',' ',' ',' ',' ',' ',' ','A',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[11] = new char[][] {
            {' ',' ',' ',' ',' ',' ',' ','B','B','B','B',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','B',' ',' ',' ','B','B',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','B',' ',' ',' ',' ',' ','B',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','B',' ',' ',' ','B','B',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','B','B','B','B',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','B',' ',' ',' ','B','B',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','B',' ',' ',' ',' ',' ','B',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','B',' ',' ',' ',' ',' ','B',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','B',' ',' ',' ','B','B',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','B','B','B','B',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[12] = new char[][] {
            {' ',' ',' ',' ',' ',' ',' ',' ',' ','C','C','C',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ','C',' ',' ',' ','C',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','C',' ',' ',' ',' ',' ','C',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','C',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','C',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','C',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','C',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','C',' ',' ',' ',' ',' ','C',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ','C',' ',' ',' ','C',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ','C','C','C',' ',' ',' ',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[13] = new char[][] {
            {' ',' ',' ',' ',' ',' ',' ','D','D','D','D',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','D',' ',' ',' ','D','D',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','D',' ',' ',' ',' ',' ','D','D',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','D',' ',' ',' ',' ',' ',' ',' ','D',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','D',' ',' ',' ',' ',' ',' ',' ','D',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','D',' ',' ',' ',' ',' ',' ',' ','D',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','D',' ',' ',' ',' ',' ',' ',' ','D',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','D',' ',' ',' ',' ',' ','D','D',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','D',' ',' ',' ','D','D',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','D','D','D','D',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[14] = new char[][] {
            {' ',' ',' ',' ',' ',' ','E','E','E','E','E','E','E','E',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','E',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','E',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','E',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','E','E','E','E','E','E',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','E',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','E',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','E',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','E',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','E','E','E','E','E','E','E','E',' ',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[15] = new char[][] {
            {' ',' ',' ',' ',' ',' ','F','F','F','F','F','F','F','F',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','F',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','F',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','F',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','F','F','F','F','F','F',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','F',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','F',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','F',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','F',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','F',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[16] = new char[][] {
            {' ',' ',' ',' ',' ',' ',' ',' ','G','G','G',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','G',' ',' ',' ','G','G',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','G',' ',' ',' ',' ',' ',' ','G',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','G',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','G',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','G',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','G',' ',' ',' ',' ','G','G','G',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','G',' ',' ',' ',' ',' ',' ','G',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','G',' ',' ',' ',' ',' ','G',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ','G','G','G','G','G','G',' ',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[17] = new char[][] {
            {' ',' ',' ',' ',' ','H','H','H',' ',' ',' ',' ','H','H','H',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','H',' ',' ',' ',' ',' ',' ','H',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','H',' ',' ',' ',' ',' ',' ','H',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','H',' ',' ',' ',' ',' ',' ','H',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','H','H','H','H','H','H','H','H',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','H',' ',' ',' ',' ',' ',' ','H',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','H',' ',' ',' ',' ',' ',' ','H',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','H',' ',' ',' ',' ',' ',' ','H',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','H',' ',' ',' ',' ',' ',' ','H',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','H','H','H',' ',' ',' ',' ','H','H','H',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[18] = new char[][] {
            {' ',' ',' ',' ',' ',' ',' ','I','I','I','I','I','I','I',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','I',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','I',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','I',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','I',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','I',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','I',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','I',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','I',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','I','I','I','I','I','I','I',' ',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[19] = new char[][] {
            {' ',' ',' ',' ',' ',' ','J','J','J','J','J','J','J','J',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','J',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','J',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','J',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','J',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','J',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','J',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ','J',' ',' ',' ',' ',' ','J',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','J',' ',' ',' ','J',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','J','J','J',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[20] = new char[][] {
            {' ',' ',' ',' ',' ',' ','K',' ',' ',' ',' ','K',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','K',' ',' ',' ',' ','K',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','K',' ',' ',' ','K',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','K',' ',' ','K',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','K','K','K',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','K',' ',' ','K','K',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','K',' ',' ',' ',' ','K',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','K',' ',' ',' ',' ',' ','K',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','K',' ',' ',' ',' ',' ',' ','K',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','K',' ',' ',' ',' ',' ',' ','K',' ',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[21] = new char[][] {
            {' ',' ',' ',' ',' ','L','L','L',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','L',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','L',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','L',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','L',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','L',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','L',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','L',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','L',' ',' ',' ',' ',' ',' ','L',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','L','L','L','L','L','L','L','L','L',' ',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[22] = new char[][] {
            {' ',' ',' ',' ',' ','M',' ',' ',' ',' ',' ',' ',' ',' ','M',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','M','M',' ',' ',' ',' ',' ',' ','M','M',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','M',' ','M',' ',' ',' ',' ','M',' ','M',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','M',' ',' ','M',' ',' ','M',' ',' ','M',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','M',' ',' ',' ','M','M',' ',' ',' ','M',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','M',' ',' ',' ',' ',' ',' ',' ',' ','M',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','M',' ',' ',' ',' ',' ',' ',' ',' ','M',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','M',' ',' ',' ',' ',' ',' ',' ',' ','M',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','M',' ',' ',' ',' ',' ',' ',' ',' ','M',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','M',' ',' ',' ',' ',' ',' ',' ',' ','M',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[23] = new char[][] {
            {' ',' ',' ',' ',' ','N',' ',' ',' ',' ',' ',' ',' ',' ','N',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','N','N',' ',' ',' ',' ',' ',' ',' ','N',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','N',' ','N',' ',' ',' ',' ',' ',' ','N',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','N',' ',' ','N',' ',' ',' ',' ',' ','N',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','N',' ',' ',' ','N',' ',' ',' ',' ','N',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','N',' ',' ',' ',' ','N',' ',' ',' ','N',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','N',' ',' ',' ',' ',' ','N',' ',' ','N',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','N',' ',' ',' ',' ',' ',' ','N',' ','N',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','N',' ',' ',' ',' ',' ',' ',' ','N','N',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','N',' ',' ',' ',' ',' ',' ',' ',' ','N',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[24] = new char[][] {
            {' ',' ',' ',' ',' ',' ',' ',' ',' ','O','O','O',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','O','O',' ',' ',' ','O','O',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','O',' ',' ',' ',' ',' ',' ',' ','O',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','O',' ',' ',' ',' ',' ',' ',' ',' ',' ','O',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','O',' ',' ',' ',' ',' ',' ',' ',' ',' ','O',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','O',' ',' ',' ',' ',' ',' ',' ',' ',' ','O',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','O',' ',' ',' ',' ',' ',' ',' ',' ',' ','O',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','O',' ',' ',' ',' ',' ',' ',' ','O',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','O','O',' ',' ',' ','O','O',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ','O','O','O',' ',' ',' ',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[25] = new char[][] {
            {' ',' ',' ',' ',' ',' ','P','P','P','P',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','P',' ',' ',' ','P','P',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','P',' ',' ',' ',' ',' ','P',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','P',' ',' ',' ',' ',' ','P',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','P',' ',' ',' ','P','P',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','P','P','P','P',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','P',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','P',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','P',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','P',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[26] = new char[][] {
            {' ',' ',' ',' ',' ',' ',' ',' ',' ','Q','Q','Q',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','Q','Q',' ',' ',' ','Q','Q',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','Q',' ',' ',' ',' ',' ',' ',' ','Q',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','Q',' ',' ',' ',' ',' ',' ',' ',' ',' ','Q',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','Q',' ',' ',' ',' ',' ',' ',' ',' ',' ','Q',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','Q',' ',' ',' ',' ',' ',' ',' ',' ',' ','Q',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','Q',' ',' ',' ',' ',' ',' ',' ',' ',' ','Q',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','Q',' ',' ',' ',' ','Q',' ',' ','Q',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','Q','Q',' ',' ',' ','Q','Q',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ','Q','Q','Q',' ',' ','Q',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[27] = new char[][] {
            {' ',' ',' ',' ',' ',' ','R','R','R','R',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','R',' ',' ',' ','R','R',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','R',' ',' ',' ',' ',' ','R',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','R',' ',' ',' ',' ',' ','R',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','R',' ',' ',' ','R','R',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','R','R','R','R',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','R','R',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','R',' ','R','R',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','R',' ',' ',' ','R','R',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','R',' ',' ',' ',' ',' ','R',' ',' ',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[28] = new char[][] {
            {' ',' ',' ',' ',' ',' ',' ',' ',' ','S','S','S',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','S','S',' ',' ',' ','S','S',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','S',' ',' ',' ',' ',' ',' ',' ','S',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','S','S',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ','S','S','S',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','S','S',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','S',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','S',' ',' ',' ',' ',' ',' ',' ','S',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','S','S',' ',' ',' ','S','S',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ','S','S','S',' ',' ',' ',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[29] = new char[][] {
            {' ',' ',' ',' ',' ','T','T','T','T','T','T','T','T','T','T','T',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','T',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','T',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','T',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','T',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','T',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','T',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','T',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','T',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','T',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[30] = new char[][] {
            {' ',' ',' ',' ',' ',' ','U',' ',' ',' ',' ',' ',' ',' ','U',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','U',' ',' ',' ',' ',' ',' ',' ','U',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','U',' ',' ',' ',' ',' ',' ',' ','U',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','U',' ',' ',' ',' ',' ',' ',' ','U',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','U',' ',' ',' ',' ',' ',' ',' ','U',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','U',' ',' ',' ',' ',' ',' ',' ','U',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','U',' ',' ',' ',' ',' ',' ',' ','U',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','U',' ',' ',' ',' ',' ',' ',' ','U',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','U','U',' ',' ',' ','U','U',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ','U','U','U',' ',' ',' ',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[31] = new char[][] {
            {' ',' ',' ',' ','V',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','V',' ',' ',' '},
            {' ',' ',' ',' ','V',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','V',' ',' ',' '},
            {' ',' ',' ',' ','V',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','V',' ',' ',' '},
            {' ',' ',' ',' ',' ','V',' ',' ',' ',' ',' ',' ',' ',' ',' ','V',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','V',' ',' ',' ',' ',' ',' ',' ',' ',' ','V',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','V',' ',' ',' ',' ',' ',' ',' ','V',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','V',' ',' ',' ',' ',' ','V',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ','V',' ',' ',' ','V',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ','V',' ','V',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','V',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[32] = new char[][] {
            {' ',' ',' ',' ','W',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','W',' ',' ',' '},
            {' ',' ',' ',' ','W',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','W',' ',' ',' '},
            {' ',' ',' ',' ','W',' ',' ',' ',' ',' ','W',' ',' ',' ',' ',' ','W',' ',' ',' '},
            {' ',' ',' ',' ',' ','W',' ',' ',' ','W',' ','W',' ',' ',' ','W',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','W',' ',' ',' ','W',' ','W',' ',' ',' ','W',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','W',' ',' ',' ','W',' ','W',' ',' ',' ','W',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','W',' ','W',' ',' ',' ','W',' ','W',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','W',' ','W',' ',' ',' ','W',' ','W',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','W',' ','W',' ',' ',' ','W',' ','W',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','W',' ',' ',' ',' ',' ','W',' ',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[33] = new char[][] {
            {' ',' ',' ',' ',' ','X',' ',' ',' ',' ',' ',' ',' ',' ',' ','X',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','X',' ',' ',' ',' ',' ',' ',' ','X',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','X',' ',' ',' ',' ',' ','X',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ','X',' ',' ',' ','X',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','X',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ','X',' ','X',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ','X',' ',' ',' ','X',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','X',' ',' ',' ',' ',' ','X',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','X',' ',' ',' ',' ',' ',' ',' ','X',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','X',' ',' ',' ',' ',' ',' ',' ',' ',' ','X',' ',' ',' ',' '},
        };
        
        
        asciiArt[34] = new char[][] {
            {' ',' ',' ',' ',' ','Y',' ',' ',' ',' ',' ',' ',' ',' ',' ','Y',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','Y',' ',' ',' ',' ',' ',' ',' ','Y',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','Y',' ',' ',' ',' ',' ','Y',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ','Y',' ',' ',' ','Y',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ','Y',' ','Y',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','Y',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','Y',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','Y',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','Y',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','Y',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        };
        
        
        asciiArt[35] = new char[][] {
            {' ',' ',' ',' ',' ','Z','Z','Z','Z','Z','Z','Z','Z','Z','Z',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','Z',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','Z',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','Z',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','Z',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ','Z',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ','Z',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ','Z',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','Z',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ','Z','Z','Z','Z','Z','Z','Z','Z','Z','Z',' ',' ',' ',' ',' '},
        };
        
        if (args.length == 1 && args[0].length() == 1) {
            int indexOfArray = args[0].charAt(0)-'0';
            if(indexOfArray >= 0 && indexOfArray < 10) {
                
            }
            else if(indexOfArray >= 17 && indexOfArray < 43) {
                indexOfArray -= 7;
            }
            else {
                System.out.println("unknown character");
                return;
            }
            
            Letter letter = new Letter(asciiArt[indexOfArray], prtStream);
            letter.print();
        }
        else {
            System.out.println("invalid argument");
        }
        
    }
    
}