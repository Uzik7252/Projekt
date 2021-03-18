
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Gra Gra = new Gra();


            System.out.println("Witaj w naszej grze, aby przejść dalej wpisz 'DALEJ'");
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            if (s == "DALEJ") ;
            {
                System.out.println("Jeśli chcesz zacząć grę wciśnij '1', Jeśli chcesz wyjść, wcisnij '2'");
                int choice = Integer.parseInt(scan.next());
                switch (choice) {
                    case 1 -> {
                        System.out.println("START");
                        Gra.gierka() ;
                    }
                    case 2 -> {
                        System.out.println("WYJDŹ");
                    }
                    default -> System.out.println("Błąd");
                }
            }


        } catch (Exception exception) {
            System.out.println("Podałeś błędne dane");
        }


    }
}