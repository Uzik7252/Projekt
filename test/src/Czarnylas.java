import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Czarnylas {
    public static void Las()
    { Scanner scanner = new Scanner(System.in);
    Kostka Kostka = new Kostka();
        Gracz Karol = new Gracz();
        przeciwnik przeciwnik = new przeciwnik();
        int zdrowiebohatera = Karol.getZdrowie();
        int zdrowie = przeciwnik.getZdrowie();
        System.out.println("Po dłuższym czasie docierasz do starego dębu.");
        System.out.println("Z gałęzi starego dębu zswisa wisielec.");
        System.out.println("Odwracasz się kiedy strzała świsnęła ci obok głowy i wbiła się w stare drzewo.");
        System.out.println("Widzisz powoli podchodzącego bandyte który dobiera miecz.");
        System.out.println("Rzuca się na ciebie zanim zdążywasz dobyć tarczy. ");
        System.out.println("[POPRZEDNIA DECYZJA - BLOKOWANIE ZABLOKOWANE]");

            System.out.println("1 - ATAK");
            System.out.println("2 = BLOK [ZABLOKOWANE]");
            System.out.println("3 - LECZENIE");
            System.out.println("Twoje zdrowie: " + Karol.getZdrowie());
            System.out.println("Zdrowie przeciwnika:" + przeciwnik.getZdrowie());
    boolean przebiegwalki = true;
        do {
            int atak2 = Kostka.rzut();
            int atak = Kostka.rzut();

            Karol.setZdrowie(zdrowiebohatera);
            System.out.println("Przeciwnik uderza za :" + atak2);
            zdrowiebohatera = zdrowiebohatera - atak2;
            System.out.println("Zostało Ci:" + zdrowiebohatera );
            if (zdrowiebohatera > 0 ) {
                int choice = Integer.parseInt(scanner.next());



                switch (choice) {
                    case 1 -> {

                        System.out.println("Uderzasz wroga za: " + atak);
                        zdrowie = zdrowie - atak;
                        System.out.println("Przeciwnikowi zostało jeszcze :" + zdrowie + " zdrowia.");

                    }
                    case 2 -> {
                        System.out.println("Ta umiejętność jest zablokowana");
                    }
                    case 3 -> {
                        System.out.println("Leczysz się za 5HP!");
                        System.out.println("Obecny stan twojego zdrowia: " + zdrowiebohatera + 5);
                        zdrowiebohatera = zdrowiebohatera + 5;
                    }


                }
            }

            if (zdrowie < 0){

                System.out.println("Przeciwnik zginął, bandyci więcej nie będą nawiedzać Jarviku.");
                System.out.println("Nie wiedząc zabiłeś herszta pobliskich bandytów. Uratowałeś miasto od łupieży.");
                System.out.println("Brawo <3");

                przebiegwalki = false;

            }
            if (zdrowiebohatera <0){
                System.out.println("Gracz Zginął - Koniec Gry.");
                przebiegwalki = false;
            }
        } while(przebiegwalki);



    }

}