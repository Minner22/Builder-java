package components;


public class Cartridge {
    private final int maxCapacity;
    private int currentBulletCount;

    public Cartridge(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        loadCartridge(maxCapacity);
    }

    public void loadCartridge(int numberOfBullets) {
        currentBulletCount = numberOfBullets;
    }

    public void shoot() {
        if (getCurrentBulletCount() > 0) {
            currentBulletCount--;
        } else {
            System.err.println("Please load the clip first.");
        }
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getCurrentBulletCount() {
        return currentBulletCount;
    }
}
