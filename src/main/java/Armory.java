import java.util.LinkedList;

public class Armory {

    private LinkedList<Weapon> weaponLinkedList = new LinkedList<Weapon>();//znowu linked lista, mysle ze korzystniej byloby uzyc ArrayListy (List<>)

    public void addWeapons() {
        weaponLinkedList.add(new Weapon("AK-47", 7.62, "BK234545", 30, true));//rodzje broni do enuma bo sie powtarzaja, tylko dodawac
        weaponLinkedList.add(new Weapon("M-4", 5.56, "DD346578", 30, true));// im serial number czyli zamiast pisac "AK-47" pisalbys
        weaponLinkedList.add(new Weapon("MP-5", 9, "VV567123", 30, true));// Guns.AK47 (gdzie Guns to enum, a AK47 to pole w enumie)
        weaponLinkedList.add(new Weapon("FN-FAL", 7.62, "BL7755445", 20, true));
        weaponLinkedList.add(new Weapon("AK-74", 5.45, "JK67391647", 30, true));
        weaponLinkedList.add(new Weapon("KRISS-VECTOR", 9, "KR4534678", 30, true));
        weaponLinkedList.add(new Weapon("M-16", 5.56, "BK234545", 30, true));
        weaponLinkedList.add(new Weapon("Colt 1911", 11.46, "CL68445", 7, true));
        weaponLinkedList.add(new Weapon("Glock 17", 9, "GL47865838", 17, true));
        weaponLinkedList.add(new Weapon("Beryl", 5.56, "BR5401347", 30, true));
        weaponLinkedList.add(new Weapon("H&K G3", 7.62, "GG67433", 20, true));
        weaponLinkedList.add(new Weapon("Desert Eagle", 0.44, "DD34298", 8, true));
        weaponLinkedList.add(new Weapon("Mossberg 500", 12, "BK234545", 8, true));

    }

    public void showWeaponsFromArmory() {
        addWeapons();
        for (int i = 0; i < weaponLinkedList.size(); i++) {
            System.out.println(weaponLinkedList.get(i).toString());
        }
    }
}


