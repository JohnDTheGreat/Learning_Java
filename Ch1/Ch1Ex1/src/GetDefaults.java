/**
 * Created by johndee on 4/3/16.
 */

import java.util.*;

class GetDefaults {
    int jInt;
    char jChar;
    public void printint(){
        System.out.println("This is the default integer: " + jInt);
    }
    public void printchar(){
        System.out.println("This is the default character: " + jChar);
    }
    class PrintStuff{
        public int jInside;
    }
    PrintStuff jdf = new PrintStuff();
}
