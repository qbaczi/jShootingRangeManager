import java.util.LinkedList;

public class Ammo {

    private double caliber;
    private int quantityOfAmmo;

    LinkedList<Ammo> ammoList = new LinkedList();

   public LinkedList<Ammo> ammoToList(){

       ammoList.add(new Ammo(7.62, 100000));
       ammoList.add(new Ammo(5.56, 100000));
       ammoList.add(new Ammo(12.7, 100000));
       ammoList.add(new Ammo(5.45, 100000));
       ammoList.add(new Ammo(9, 100000));
       ammoList.add(new Ammo(6.5, 100000));

       return ammoList;

   }

    public Ammo(double caliber, int quantityOfAmmo) {
        this.caliber = caliber;
        this.quantityOfAmmo = quantityOfAmmo;
    }

   public void showAmmoWarehouse(){
       for (Ammo ammo : ammoToList()) {
           System.out.println(ammo.toString());

       }

   }

    @Override
    public String toString() {
        return "Ammo{" +
                "caliber=" + caliber +
                ", quantityOfAmmo=" + quantityOfAmmo + '}';
    }
}
