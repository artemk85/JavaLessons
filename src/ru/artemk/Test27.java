package ru.artemk;

class NeMyasoException extends RuntimeException {
    NeMyasoException(String s) {
        super(s);
    }
}

class NeVodaException extends Exception {
    NeVodaException(String s) {
        super(s);
    }
}

class Tiger {
    void eat(String eda) {
        if (!eda.equals("myaso")) {
            throw new NeMyasoException("Tigr ne est " + eda);
        }
        System.out.println("Tigr est myaso.");
    }

    void drink(String zhidkost) throws NeVodaException {
        if (!zhidkost.equals("voda")) {
            throw new NeVodaException("Tigr ne pyet " + zhidkost);
        }
        System.out.println("Tigr pyet vodu.");
    }
}

public class Test27 {
    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        t1.eat("myaso");
        try {
            t1.drink("voda");
            try {
                t1.drink("pivo");
            }
            catch (NeVodaException e) {
                System.out.println(e.getMessage());
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("Eto inner finnaly block.");
            }
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
