import java.util.ArrayList;

public class Ammo {
    private double caliber;
    private int quantityOfAmmo;

    public Ammo(double caliber, int quantityOfAmmo) {//konstruktor zawsze zaraz po atrybutach
        this.caliber = caliber;
        this.quantityOfAmmo = quantityOfAmmo;
    }

    //LinkedList<Ammo> ammoList = new LinkedList();//Linked lista nie koniecznie jest najlepszym wyborem poczytaj o plusach i minusach

   public ArrayList<Ammo> ammoList = new ArrayList(){{
       add(new Ammo(7.62, 100000));//kalibry amunicji trzymałbym w enumie, ponieważ jest ich skończona ilosć rodzajów
       add(new Ammo(5.56, 100000));
       add(new Ammo(12.7, 100000));
       add(new Ammo(5.45, 100000));
       add(new Ammo(9, 100000));
       add(new Ammo(6.5, 100000));
   }};



   public void showAmmoWarehouse(){
       for (Ammo ammo : ammoList) {
           System.out.println(ammo.toString());
       }

   }

    @Override
    public String toString() {//swietne przeciazenie metody toString
        return "Ammo{" + "caliber=" + caliber + ", " + "quantityOfAmmo=" + quantityOfAmmo + '}';
    }
}
