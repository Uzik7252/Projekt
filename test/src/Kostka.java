import java.util.Random;

public class Kostka {

    Random random = new Random();

    public int rzut() {
        int rzut = random.nextInt(6)+1;
        return rzut;
    }
}

