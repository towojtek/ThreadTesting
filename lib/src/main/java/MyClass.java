public class MyClass {

    public static void main(String args [ ]){
        Konto k = new Konto();
        Uzytkownik a = new Uzytkownik(k);
        Uzytkownik b = new Uzytkownik(k);
        Uzytkownik c = new Uzytkownik(k);
        Uzytkownik d = new Uzytkownik(k);

        new Thread(new Runnable() {
            @Override
            public void run() {
            a.run();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                b.run();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                c.run();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                d.run();
            }
        }).start();

    }
}

