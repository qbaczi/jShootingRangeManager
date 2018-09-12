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


    public String getNameOfWeapon() {
        return nameOfWeapon;
    }

    public void setNameOfWeapon(String nameOfWeapon) {
        this.nameOfWeapon = nameOfWeapon;
    }

    public double getCaliber() {
        return caliber;
    }

    public void setCaliber(double caliber) {
        this.caliber = caliber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getMagCapacity() {
        return magCapacity;
    }

    public void setMagCapacity(int magCapacity) {
        this.magCapacity = magCapacity;
    }

    public boolean isInArmory() {
        return inArmory;
    }

    public void setInArmory(boolean inArmory) {
        this.inArmory = inArmory;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "nameOfWeapon='" + nameOfWeapon + '\'' +
                ", caliber=" + caliber +
                ", serialNumber='" + serialNumber + '\'' +
                ", magCapacity=" + magCapacity +
                ", inArmory=" + inArmory +
                '}';
    }
}
