import java.util.ArrayList;
import java.util.List;

public class Gracz {

    private String imie;
    private int zdrowie;
    private int portfel;
    private List<String> ekwipunek = new ArrayList<>(5);

    public Gracz(String imie, int zdrowie, int portfel ) {
        this.imie = imie;
        this.zdrowie = zdrowie;
        this.portfel = portfel;

    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getZdrowie() {
        return zdrowie;
    }

    public void setZdrowie(int zdrowie) {
        this.zdrowie = zdrowie;
    }

    public int getPortfel() {
        return portfel;
    }

    public void setPortfel(int portfel) {
        this.portfel = portfel;
    }

    public List<String> getEkwipunek() {
        return ekwipunek;
    }

    public void setEkwipunek(List<String> ekwipunek) {
        this.ekwipunek = ekwipunek;
    }
}
