

import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Gra {
    public static void  gierka()
            throws InterruptedException
    { Scanner scanner = new Scanner(System.in);
        System.out.println("ZACZYNAMY");
        System.out.println("Budzisz się po długim śnie w czarnym lesie.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Po swojej lewej widzisz swój stary miecz a po prawej drewnianą tarczę.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Podnosisz się z ziemi, obtrzepujesz swoją kolczugę.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Podnosisz swój rynsztunek. I zerkasz na wschodzące słońce.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("W przeciwnym kierunku widnieje na horyzoncie miasto. Jarvik.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Do miasta wiodą dwie drogi - jedna scieżką przez środek lasu, druga polami wzdłuż niego.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Którą drogę obierasz? 1 - Droga przez las. 2 - Droga wzdłuż lasu");
        int choice = Integer.parseInt(scanner.next());
        switch (choice) {
            case 1 -> {
                System.out.println("Wybierasz drogę przez Czarnylas. Nie bez powodu tak nazywany.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Szybko pomimo wschodzącego słońca w lesie zrobiło się ciemno.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Wyciągasz więc pochodnię którą rozpalasz aby rozświetlała ci drogę.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("W związku z czym swoją tarczę zakładasz na plecy. [ZABLOKOWANE BLOKOWANIE]");
                TimeUnit.SECONDS.sleep(2);

            }
            case 2 -> {
                System.out.println("Wybierasz drogę wzdłuż Czarnylasu. Nie bez powodu tak nazywany.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Odchodzisz kawałek od dala lasu. Wschodzące słońce muska cię po twarzy.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Czujesz spokój. Nic ci nie zagraża. Udajesz się w kierunku Jarviku.");


            }
        }



    }
}