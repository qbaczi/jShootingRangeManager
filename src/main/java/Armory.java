import java.util.LinkedList;

public class Armory {


    LinkedList<Weapon> weaponLinkedList;


//    Armory armory = new Armory();

    public void addingWeapons() {
        weaponLinkedList = new LinkedList<Weapon>();

        weaponLinkedList.add(new Weapon("AK-47", 7.62, "BK234545", 30, true));
        weaponLinkedList.add(new Weapon("M-4", 5.56, "DD346578", 30, true));
        weaponLinkedList.add(new Weapon("MP-5", 9, "VV567123", 30, true));
        weaponLinkedList.add(new Weapon("FN-FAL", 7.62, "BL7755445", 20, true));
        weaponLinkedList.add(new Weapon("AK-74", 5.45, "JK67391647", 30, true));
        weaponLinkedList.add(new Weapon("KRISS-VECTOR", 9, "KR4534678", 30, true));
        weaponLinkedList.add(new Weapon("M-16", 7.62, "BK234545", 30, true));
        weaponLinkedList.add(new Weapon("AK-47", 7.62, "BK234545", 30, true));
        weaponLinkedList.add(new Weapon("AK-47", 7.62, "BK234545", 30, true));
        weaponLinkedList.add(new Weapon("AK-47", 7.62, "BK234545", 30, true));
        weaponLinkedList.add(new Weapon("AK-47", 7.62, "BK234545", 30, true));
        weaponLinkedList.add(new Weapon("AK-47", 7.62, "BK234545", 30, true));
        weaponLinkedList.add(new Weapon("AK-47", 7.62, "BK234545", 30, true));


    }



    public void showWeaponsFromArmory() {
        addingWeapons();
        for (int i = 0; i < weaponLinkedList.size(); i++) {
            System.out.println(weaponLinkedList.get(i).toString());

        }

    }
}


