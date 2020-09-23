package guns;

import components.ActionType;
import components.Cartridge;

public class Gun {

    private final Type type;
    private final int barrelLength;
    private final Cartridge cartridge;
    private final String caliber;
    private final boolean silencerReady;
    private final ActionType actionType;

    public Gun(Type type, int barrelLength, Cartridge cartridge, String caliber, boolean silencerReady, ActionType actionType) {
        this.type = type;
        this.barrelLength = barrelLength;
        this.cartridge = cartridge;
        this.caliber = caliber;
        this.silencerReady = silencerReady;
        this.actionType = actionType;
    }


    public void shoot() { cartridge.shoot(); }

    public void load() { cartridge.loadCartridge(cartridge.getMaxCapacity()); }

    public Type getType() { return type; }

    public int getBarrelLength() { return barrelLength; }

    public Cartridge getCartridge() { return cartridge; }

    public boolean isSilencerReady() { return silencerReady; }

    public ActionType getActionType() { return actionType; }

    public String getCaliber() { return caliber; }
}
