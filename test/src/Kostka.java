import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Kostka {

    Random random = new Random();

    boolean ponowny_rzut = false;

    public void sześć_ścian() throws InterruptedException {
        int rzut = 0;
        do {
            rzut = random.nextInt(7);
            if (rzut == 0){
                ponowny_rzut = true;
            }
        }while (ponowny_rzut);
        System.out.println("Rzucasz kością i....");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Wyrzuciłeś " + rzut + " na kości ");

    }
}
