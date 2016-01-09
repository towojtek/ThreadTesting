/**
 * Created by Wojtek on 2016-01-09.
 */
public class Uzytkownik implements Runnable {

    Konto konto;
    public Uzytkownik(Konto k){
        konto=k;
    }



    @Override
    public void run() {
        while (true){
//            synchronized (konto) {
                if (konto.getStanKonta() >= 10) {
                    //pozyczka
                    konto.dopiszDoKonta(-10);
                    //uzywamy pieniedzy i oddajemy
                    konto.dopiszDoKonta(10);
                }
//            }
        }
    }




}
