import builders.Gunsmith;
import builders.SpecBuilder;
import director.Director;
import guns.Gun;
import guns.Specification;

public class Client {

    public static void main(String[] args) {

        Director director = new Director();

        Gunsmith gunsmith = new Gunsmith();
        director.createPistol(gunsmith);
        Gun gun = gunsmith.getResult();
        System.out.println("Gun caliber is: " + gun.getCaliber());

        SpecBuilder specBuilder = new SpecBuilder();
        director.createShotgun(specBuilder);
        Specification specification = specBuilder.getResult();
        System.out.println("Gun specification:\n" + specification.print());
    }
}
