import java.util.Date;

public class main {

    public static void main(String[] args) {
     Apple a = new Apple();
     a.stykpris = 2;
     a.holdbarhed = new Date(1608768000);
     a.smidud();
     a.moden = true;
     a.coolDown();

     Peas p = new Peas();
     p.stykpris = 0.1;
     p.holdbarhed = new Date(1608768000);
     p.freeze();

    Banana b = new Banana();
    b.stykpris = 5;
    b.holdbarhed = new Date(1608768000);
    b.smidud();
    b.moden = true;
    b.coolDown();
    }
}
