package edu.nyu.cs9053.homework6;

/**
 * User: blangel
 * Date: 10/11/17
 * Time: 7:59 AM
 */
public interface BombSquadTechnician {

    WireDiagram assess(Bomb bomb) throws ToolMisuseException;

    void defuse(Bomb bomb, WireDiagram diagram);

}
