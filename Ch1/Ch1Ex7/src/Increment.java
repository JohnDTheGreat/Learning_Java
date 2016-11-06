/**
 * Created by johndee on 4/13/16.
 */
public class Increment {
    public static void main(String[] args){
        System.out.println("Before I increment with ++: " + StaticTest.i);
        StaticTest.i++;
        System.out.println("After I increment with ++: " + StaticTest.i);
        Incrementable inc = new Incrementable();
        inc.increment();
        System.out.println("After I increment with object: " + StaticTest.i);
        Incrementable.increment();
        System.out.println("After I increment with static class: " + StaticTest.i);
        StaticTest statyc = new StaticTest();
        System.out.println("New object creation with static variable from before is: " + statyc.i + " add another: " + statyc.i++
        + " static var: " + StaticTest.i + " object var: " + statyc.i);
        // The rest is exercise 8
        Incrementable inc2 = new Incrementable();
        Incrementable inc3 = new Incrementable();
        inc2.increment();
        inc2.showvalue();
        inc2.increment();
        inc3.showvalue();
        inc3.increment();
        inc3.increment();
        inc.showvalue();
        inc2.showvalue();
        inc3.showvalue();
        // The following is autoboxing exercise 9
        boolean bl = true;
        Boolean bbl = bl;
        char cr = 'a';
        Character ccr = cr;
        byte bt = 100;
        Byte bbt = bt;
        short sht = 128;
        Short ssht = sht;
        int ints = 1;
        Integer iints = ints;
        long lng = 900000000;
        Long llng = lng;
        float flt = .30f;
        Float fflt = flt;
        double dbl = .30d;
        Double ddbl = dbl;
        System.out.println("Did the autoboxing work: \n"
                + "\n boolean " + bl + " | " + bbl
                + "\n char " + cr + " | " + ccr
                + "\n byte " + bt + " | " + bbt
                + "\n short " + sht + " | " + ssht
                + "\n int " + ints + " | " + iints
                + "\n long " + lng + " | " + llng
                + "\n float " + flt + " | " + fflt
                + "\n double " + dbl + " | " + ddbl
        );
    }
}

class StaticTest {
    static int i = 30;
}

class Incrementable {
    static void increment() {StaticTest.i++;}
    static void showvalue() {System.out.println("The value of static integer is: " + StaticTest.i);}
}
