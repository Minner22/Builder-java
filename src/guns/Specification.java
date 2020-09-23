package guns;

import components.ActionType;
import components.Cartridge;

public class Specification {
    private final Type type;
    private final int barrelLength;
    private final Cartridge cartridge;
    private final String caliber;
    private final boolean silencerReady;
    private final ActionType actionType;

    public Specification(Type type, int barrelLength, Cartridge cartridge, String caliber, boolean silencerReady, ActionType actionType) {
        this.type = type;
        this.barrelLength = barrelLength;
        this.cartridge = cartridge;
        this.caliber = caliber;
        this.silencerReady = silencerReady;
        this.actionType = actionType;
    }

    public String print() {
        String spec = "";

        spec += "Type of gun:\t" + type + "\n";
        spec += "Gun action type:\t" + actionType + "\n";
        spec += "Length of barrel:\t" + barrelLength + "mm\n";
        spec += "Cartridge capacity:\t" + cartridge.getMaxCapacity() + "\n";
        spec += "Caliber:\t" + caliber + "\n";
        spec += "Silencer assembly available:\t" + silencerReady + "\n";

        return spec;
    }
}
