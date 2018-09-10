public class Weapon {

    private String nameOfWeapon;
    private double caliber;
    private String serialNumber;
    private int magCapacity;
    private boolean inArmory = true;

    public Weapon(String nameOfWeapon, double caliber, String serialNumber, int magCapacity, boolean inArmory) {
        this.nameOfWeapon = nameOfWeapon;
        this.caliber = caliber;
        this.serialNumber = serialNumber;
        this.magCapacity = magCapacity;
        this.inArmory = inArmory;
    }

}
