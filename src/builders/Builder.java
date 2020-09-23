package builders;

import components.ActionType;
import components.Cartridge;
import guns.Type;

public interface Builder {

    void setType(Type type);
    void setBarrelLength(int barrelLength);
    void setCartridge(Cartridge cartridge);
    void setCaliber(String caliber);
    void setSilencerReady(boolean silencerReady);
    void setActionType(ActionType actionType);
}
