package edu.nyu.cs9053.homework6;

public class Technician007 implements BombSquadTechnician {

    private final Toolbox toolbox;

    public Technician007() {
        this.toolbox = new Toolbox();
    }

    @Override
    public WireDiagram assess(Bomb bomb) throws ToolMisuseException {
        Wire[] bombWires = bomb.getWires();
        for (Wire bombWire : bombWires) {
            Object suspect = toolbox.invokeMethod(bombWire, "callingCard");
            if (suspect instanceof Wire) {
                toolbox.setField(suspect, "free", false);
            }
            try {
                if (toolbox.getColor(bombWire) == WireColor.Blue || toolbox.getColor(bombWire) == WireColor.Red) {
                    bombWire.cut();
                }
            } catch (ToolMisuseException e) {
                e.printStackTrace();
                throw new ToolMisuseException();
            }
        }
        return null;
    }
    
    @Override
    public void defuse(Bomb bomb, WireDiagram diagram) {

    }

}
