import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakeAmmoAndWeapon {

    private Scanner sc = new Scanner(System.in);
    ShooterManager shooterManager = new ShooterManager();
    Armory armory = new Armory();
    Ammo ammo = new Ammo();
    Shooting startShooting = new Shooting();
    List<Shooter> objectsList = new ArrayList();

    public void showMenu(MainMenu mainMenu) {
        System.out.println();
        System.out.println("===========================================================================");
        System.out.println("Wybierz menu");
        System.out.println("1. Wybierz strzelca");
        System.out.println("2. Wybierz broń");
        System.out.println("3. Ilość amunicji");
        System.out.println("4. Strzelanie");
        System.out.println("5. Wstecz");

        switch (sc.nextInt()) {
            case 1:
                if (shooterManager.shooterList.size() == 0) {
                    System.out.println("Brak strzelców na liście");
                    shooterManager.showMenuOfShooter(mainMenu);
                } else {
                    shooterManager.printShooters();
                    System.out.println("Wybierz strzelca po ID");
                    sc.next();
                    sc.nextLine();
                    objectsList.add(shooterManager.chooseAShooter());
                }
                break;
            case 2:
                armory.showWeaponsFromArmory();
                System.out.println("Wybierz broń po nr. seryjnym");
                armory.chooseAWeapon();
                break;
            case 3:
                ammo.showAmmoWarehouse();
                break;
            case 4:
                startShooting.shooting();
                break;
            case 5:
                mainMenu.showMenu();
                break;
            default:
                System.err.println("Podaj poprawną wartość!");
                showMenu(mainMenu);
        }

    }

}
