package director;

import builders.Builder;
import components.ActionType;
import components.Cartridge;
import guns.Type;

public class Director {

    public void createPistol(Builder builder) {
        builder.setType(Type.PISTOL);
        builder.setActionType(ActionType.SEMI_AUTOMATIC);
        builder.setBarrelLength(186);
        builder.setCartridge(new Cartridge(17));
        builder.setCaliber("9x19mm");
        builder.setSilencerReady(true);
    }

    public void createRifle(Builder builder) {
        builder.setType(Type.RIFLE);
        builder.setActionType(ActionType.BOLT_ACTION);
        builder.setBarrelLength(730);
        builder.setCartridge(new Cartridge(5));
        builder.setCaliber("7.62×54mmR");
        builder.setSilencerReady(false);
    }

    public void createShotgun(Builder builder) {
        builder.setType(Type.SHOTGUN);
        builder.setActionType(ActionType.PUMP_ACTION);
        builder.setBarrelLength(470);
        builder.setCartridge(new Cartridge(6));
        builder.setCaliber("12/76");
        builder.setSilencerReady(false);
    }
}
