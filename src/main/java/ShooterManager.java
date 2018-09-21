import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
@Data
public class ShooterManager {


    private Scanner sc = new Scanner(System.in);
    public List<Shooter> shooterList = new ArrayList<Shooter>();
    Shooter choosen = null;

    public static Shooter createShooter(Scanner sc) {

        System.out.println("Proszę podaj imię");
        String name = sc.next();
        sc.nextLine();

        System.out.println("Proszę podaj nazwisko");
        String surname = sc.nextLine();


        System.out.println("Proszę podaj wiek");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Proszę podaj numer ID");
        String idNumber = sc.nextLine();

        return new Shooter(name, surname, age, idNumber);
    }

    public void showMenuOfShooter(MainMenu mainMenu) {
        System.out.println();
        System.out.println("===========================================================================");
        System.out.println("Wybierz menu");
        System.out.println("1. Lista strzelców");
        System.out.println("2. Dodaj strzelca");
        System.out.println("3. Usuń strzelca");
        System.out.println("4. Wstecz");

        switch (sc.nextInt()) {
            case 1:
                if (shooterList.size() == 0) {
                    System.err.println("Brak strzelców na liście");
                    showMenuOfShooter(mainMenu);
                } else {
                    printShooters();
                    showMenuOfShooter(mainMenu);
                }
                break;
            case 2:
                shooterList.add(createShooter(sc));
                showMenuOfShooter(mainMenu);
                break;
            case 3:
                removeShooter();
                showMenuOfShooter(mainMenu);
                break;
            case 4:
                mainMenu.showMenu();
                break;
            default:
                System.err.println("Podaj poprawną wartość!");
                showMenuOfShooter(mainMenu);
        }
    }

    public void printShooters() {
        for (int i = 0; i < shooterList.size(); i++) {
            System.out.println(shooterList.get(i).toString());
        }
    }

    public void removeShooter() {
        System.out.println("Podaj numer id strzelca którego chcesz ununąć");
        String remove = sc.next();
        sc.nextLine();
        for (int i = 0; i < shooterList.size(); i++) {
            if (shooterList.get(i).getIdNumber().equals(remove)) {
                shooterList.remove(i);
                System.out.println("Strzelec o id " + remove + " pomyślnie usunięty");
            }
        }
    }
    public Shooter chooseAShooter(){

        for (int i = 0; i < shooterList.size(); i++) {
            if (sc.nextLine().equals(shooterList.get(i).getIdNumber())){
                choosen = shooterList.get(i);
                System.out.println("Strzelec wybrany!");
            }else {
                System.out.println("Wybierz jeszcze raz");
                chooseAShooter();
            }
        }
        return choosen;
    }

}