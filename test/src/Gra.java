

import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Gra {
    public static void  gierka()
            throws InterruptedException
    { Scanner scanner = new Scanner(System.in);
        System.out.println("ZACZYNAMY");
        System.out.println("Budzisz się po długim śnie w czarnym lesie.");
        System.out.println("Po swojej lewej widzisz swój stary miecz a po prawej drewnianą tarczę.");
        System.out.println("Podnosisz się z ziemi, obtrzepujesz swoją kolczugę.");
        System.out.println("Podnosisz swój rynsztunek. I zerkasz na wschodzące słońce.");
        System.out.println("W przeciwnym kierunku widnieje na horyzoncie miasto. Jarvik.");
        System.out.println("Do miasta wiedzie jedna scieżką przez środek lasu.");
        System.out.println(" 1 - Droga przez las.");
        int choice = Integer.parseInt(scanner.next());
        switch (choice) {
            case 1 -> {
                System.out.println("Wybierasz drogę przez Czarnylas. Nie bez powodu tak nazywany.");
                System.out.println("Szybko pomimo wschodzącego słońca w lesie zrobiło się ciemno.");
                System.out.println("Wyciągasz więc pochodnię którą rozpalasz aby rozświetlała ci drogę.");
                System.out.println("W związku z czym swoją tarczę zakładasz na plecy. [ZABLOKOWANE BLOKOWANIE]");
                Czarnylas.Las();

            }
            case 2 -> {
                System.out.println("Postanawiasz zostać w swoim wygodnym miejscu i nie ruszać się z miejsca.");
                System.out.println("świat przecież uratuje się sam.");




            }
            default -> System.out.println("Błąd");

        }



    }
}