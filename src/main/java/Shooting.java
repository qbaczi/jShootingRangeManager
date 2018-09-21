public class Shooting {
    ShooterManager shooterManager = new ShooterManager();
    Armory armory = new Armory();

    public void shooting() {
        System.out.println("Teraz strzela " + shooterManager.choosen);
        System.out.println("Strzelec wybrał " + armory.choosenWepon);
    }
}
