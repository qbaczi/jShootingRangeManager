
import java.util.*;

public class MainMenu {

    private Scanner sc = new Scanner(System.in);
    private ShooterManager shooterManager = new ShooterManager();
    private Armory armory = new Armory();
    private TakeAmmoAndWeapon takeAmmoAndWeapon = new TakeAmmoAndWeapon();
    private Shooting shooting = new Shooting();



    public void showMenu() {
        System.out.println();
        System.out.println("===========================================================================");
        System.out.println("Wybierz menu");
        System.out.println("1. Strzelcy");
        System.out.println("2. Magazyn broni i amunicji");
        System.out.println("3. Zapotrzebowanie na strzelanie");
        System.out.println("4. Strzelanie");
        System.out.println("5. Zakończ");//jezeli elementy w menu sie nie beda zmieniac, uzyj enuma :)

        switch (sc.nextInt()) {
            case 1:
                shooterManager.showMenuOfShooter(this);//tutaj mamy swietna okazje do uzycia strategii!
                //tutaj przekaz swoj obiekt menu, przypominam slowo THIS! cos takiego shooterManager.showMenuOfShooter(this);
                break;
            case 2:
                armory.showMenuOfArmory(this);
                break;
            case 3:
                takeAmmoAndWeapon.showMenu(this);
                break;
            case 4:
                shooting.shooting();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Wybrałeś niewspieraną opcje");
        }
    }

}


