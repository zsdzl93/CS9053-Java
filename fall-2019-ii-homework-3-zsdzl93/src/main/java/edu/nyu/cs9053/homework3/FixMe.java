package edu.nyu.cs9053.homework3;
import edu.nyu.cs9053.homework3.metadata.*;

/**
 * User: blangel
 */
public class FixMe {

    private final String name;

    private final String metadata;
    
    private final String defaltName = null;

    public FixMe(String name) {
        this(name, defaltName);
    }

    public FixMe(String name, String metadata) {
        this.name = name;
        this.metadata = new Processor(true).processMetadata(metadata);
    }

    public FixMe changeName(String name) {
        return new FixMe(name, metadata);
    }

    public FixMe changeName(String firstName, String lastName) {
        return new FixMe(stringFormat(firstName, lastName), metadata);
    }

    public String stringFormat(String firstName, String lastName) {
        return String.format("%s %s", firstName, lastName);
    }

    public String getName() {
        return name;
    }

}
