
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException{
        try {
            Gra Gra = new Gra();
            Scanner scan = new Scanner(System.in);
            Kostka Kostka = new Kostka();


                System.out.println("Jeśli chcesz zacząć grę wciśnij '1', Jeśli chcesz wyjść, wcisnij '2'");
                int choice = Integer.parseInt(scan.next());
                switch (choice) {
                    case 1 -> {
                        System.out.println("START");
                        Gra.gierka() ;
                    }
                    case 2 -> {
                        System.out.println("WYJDŹ");
                        return;

                    }
                    default -> {
                        System.out.println(Kostka.rzut());
                        System.out.println("Błąd");
                    }
                }



        } catch (Exception exception) {
            System.out.println("Podałeś błędne dane");
        }


    }
}