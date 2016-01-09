/**
 * Created by Wojtek on 2016-01-09.
 */
public class Konto {


    private int stanKonta =10;

    synchronized public int getStanKonta() {
        return stanKonta;
    }
    synchronized public void dopiszDoKonta(int kwota){

            stanKonta += kwota;
            if (stanKonta < 0) {
                throw new RuntimeException("na koncie jest debet");
            }

    }
}
