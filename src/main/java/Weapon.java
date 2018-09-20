import lombok.Data;

@Data
public class Weapon {

    private GunType gunType;
    private double caliber;
    private String serialNumber;
    private int magCapacity;
    private boolean inArmory;



    public Weapon(GunType gunType, double caliber, String serialNumber, int magCapacity, boolean inArmory) {
        this.gunType = gunType;
        this.caliber = caliber;
        this.serialNumber = serialNumber;
        this.magCapacity = magCapacity;
        this.inArmory = inArmory;
    }


    @Override
    public String toString() {
        return "Weapon{" +
                "nameOfWeapon='" + gunType + '\'' +
                ", caliber=" + caliber +
                ", serialNumber='" + serialNumber + '\'' +
                ", magCapacity=" + magCapacity +
                ", inArmory=" + inArmory +
                '}';
    }

}
