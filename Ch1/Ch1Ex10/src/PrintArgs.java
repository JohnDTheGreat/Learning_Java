/**
 * Created by johndee on 4/18/16.
 */
public class PrintArgs {
    public static void print(String output){
        System.out.println(output);
    }

    public static void main (String[] args){
        for (int c = 0 ; c < args.length; c++){
            print("args[" + c + "] " + args[c]);
        }
    }
}
