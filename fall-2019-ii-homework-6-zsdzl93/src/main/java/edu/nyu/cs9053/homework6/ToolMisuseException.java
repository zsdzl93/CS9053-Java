package edu.nyu.cs9053.homework6;

/**
 * User: blangel
 * Date: 10/11/17
 * Time: 11:12 AM
 */
@SuppressWarnings("serial")
public class ToolMisuseException extends Exception {
    public ToolMisuseException() {
        System.out.print("Tool misused");
    }
}
