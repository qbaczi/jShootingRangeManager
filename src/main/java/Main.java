import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {


        LinkedList<Shooter> shooters = new LinkedList<Shooter>();
        Shooter shooter = new Shooter("Jan","Kowalski", 32, "AET564567");
        shooters.add(shooter);
        shooters.add(shooter);
        printList(shooters);

        Armory armory = new Armory();
        armory.weaponLinkedList.add(Weapon.addWeapon());

    }

    private static void printList (LinkedList<Shooter> shooterLinkedList){
//        Iterator<Shooter> iterator = shooterLinkedList.iterator();
//        int count = 0;
//        while (iterator.hasNext()){
//            System.out.println("Shooter # "+(count+1) + shooterLinkedList);
//        }
//        System.out.println("=======================================");
    }
}
