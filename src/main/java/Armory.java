import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Armory {
    private Scanner sc = new Scanner(System.in);
    private List<Weapon> weaponArrayList = new ArrayList<Weapon>();//znowu linked lista, mysle ze korzystniej byloby uzyc ArrayListy (List<>)
    private Ammo ammo = new Ammo();
    Weapon choosenWepon = null;

    public void addWeapons() {
        weaponArrayList.add(new Weapon(GunType.AK47, 7.62, "BK234545", 30, true));//rodzje broni do enuma bo sie powtarzaja, tylko dodawac
        weaponArrayList.add(new Weapon(GunType.M4, 5.56, "DD346578", 30, true));// im serial number czyli zamiast pisac "AK-47" pisalbys
        weaponArrayList.add(new Weapon(GunType.MP5, 9, "VV567123", 30, true));// Guns.AK47 (gdzie Guns to enum, a AK47 to pole w enumie)
        weaponArrayList.add(new Weapon(GunType.FNFAL, 7.62, "BL7755445", 20, true));
        weaponArrayList.add(new Weapon(GunType.AK74, 5.45, "JK67391647", 30, true));
        weaponArrayList.add(new Weapon(GunType.KRISSVECTOR, 9, "KR4534678", 30, true));
        weaponArrayList.add(new Weapon(GunType.M16, 5.56, "BK234545", 30, true));
        weaponArrayList.add(new Weapon(GunType.COLT1911, 11.46, "CL68445", 7, true));
        weaponArrayList.add(new Weapon(GunType.GLOCK17, 9, "GL47865838", 17, true));
        weaponArrayList.add(new Weapon(GunType.BERYL, 5.56, "BR5401347", 30, true));
        weaponArrayList.add(new Weapon(GunType.HKG3, 7.62, "GG67433", 20, true));
        weaponArrayList.add(new Weapon(GunType.DESERTEAGLE, 0.44, "DD34298", 8, true));
        weaponArrayList.add(new Weapon(GunType.MOSSBERG500, 12, "BK234545", 8, true));

    }
    public void showMenuOfArmory(MainMenu mainMenu){
        System.out.println("Wybierz menu");
        System.out.println("1: Magazyn broni");
        System.out.println("2: Magazyn aminicji");
        System.out.println("3: Wstecz");

        switch (sc.nextInt()) {

            case 1:
                showWeaponsFromArmory();
                showMenuOfArmory(mainMenu);
                break;
            case 2:
                ammo.showAmmoWarehouse();
                showMenuOfArmory(mainMenu);
                break;
            case 3:
                mainMenu.showMenu();
                break;
            default:
                System.out.println("Wybrałeś niewspieraną opcje");

        }

    }

    public Weapon chooseAWeapon() {
        String cWep = sc.nextLine();
        for (int i = 0; i < weaponArrayList.size(); i++) {

            if (weaponArrayList.get(i).getSerialNumber().equals(cWep)) {
                choosenWepon = weaponArrayList.get(i);
                System.out.println("Broń wybrana!" + weaponArrayList.get(i).getGunType());
                weaponArrayList.get(i).setInArmory(false);

            }
        }
        return choosenWepon;
    }
    public void showWeaponsFromArmory() {
        addWeapons();
        for (int i = 0; i < weaponArrayList.size(); i++) {
            System.out.println(weaponArrayList.get(i).toString());
        }
    }

}


