/**
 * Created by johndee on 4/3/16.
 */
public class DefaultInit {
    public static void main(String[] args){
        GetDefaults gdf = new GetDefaults();
        gdf.printchar();
        gdf.printint();
        // The following is for excersise 4 and 5
        gdf.jInt = 1;
        gdf.jChar = 'a';
        gdf.printchar();
        gdf.printint();
        gdf.jdf.jInside = 10;
        System.out.println("This is the integer inside the integer inside the sub object: " + gdf.jdf.jInside);
    }
}
