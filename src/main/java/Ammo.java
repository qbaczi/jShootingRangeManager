import java.util.LinkedList;

public class Ammo {

    private double caliber;
    private int quantityOfAmmo;

    LinkedList<Ammo> ammoList = new LinkedList();


   public LinkedList<Ammo> addAmmoToList(){

       ammoList.add(new Ammo(7.62, 100000));
       ammoList.add(new Ammo(5.56, 100000));
       ammoList.add(new Ammo(12.7, 100000));
       ammoList.add(new Ammo(5.45, 100000));
       ammoList.add(new Ammo(9, 100000));
       ammoList.add(new Ammo(6.5, 100000));

       return ammoList;

   }
   public void showAmmoWarehouse(){
       for (Ammo ammo : addAmmoToList()) {
           System.out.println(ammo.toString());

       }

   }



    public Ammo(double caliber, int quantityOfAmmo) {
        this.caliber = caliber;
        this.quantityOfAmmo = quantityOfAmmo;
    }

    @Override
    public String toString() {
        return "Ammo{" +
                "caliber=" + caliber +
                ", quantityOfAmmo=" + quantityOfAmmo + '}';
    }
}
