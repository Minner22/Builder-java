package builders;

import components.ActionType;
import components.Cartridge;
import guns.Specification;
import guns.Type;

public class SpecBuilder implements Builder {
    private Type type;
    private int barrelLength;
    private Cartridge cartridge;
    private String caliber;
    private boolean silencerReady;
    private ActionType actionType;


    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setBarrelLength(int barrelLength) {
        this.barrelLength = barrelLength;
    }

    @Override
    public void setCartridge(Cartridge cartridge) {
        this.cartridge = cartridge;
    }

    @Override
    public void setCaliber(String caliber) {
        this.caliber = caliber;
    }

    @Override
    public void setSilencerReady(boolean silencerReady) {
        this.silencerReady = silencerReady;
    }

    @Override
    public void setActionType(ActionType actionType) {
        this.actionType = actionType;
    }

    public Specification getResult() {
        return new Specification(type, barrelLength, cartridge, caliber, silencerReady, actionType);
    }
}
