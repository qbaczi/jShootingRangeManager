import java.util.Scanner;

public class ShooterManager {

    private Scanner sc = new Scanner(System.in);

    public static Shooter createShooter(Scanner sc) {


        System.out.println("Proszę podaj imię");
        String name = sc.nextLine();
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

    public void showMenuOfShooter() {
        System.out.println();
        System.out.println("===========================================================================");
        System.out.println("Wybierz menu");
        System.out.println("1. Lista strzelców");
        System.out.println("2. Dodaj strzelca");
        System.out.println("3. Wstecz");

        switch (sc.nextInt()) {
            case 1:

                break;
            case 2:
                createShooter(sc);
                break;
            case 3:
                MainMenu mainMenu = new MainMenu();
                mainMenu.showMenu();
                break;
            default:
                System.err.println("Podaj poprawną wartość!");
                showMenuOfShooter();
        }
    }

}