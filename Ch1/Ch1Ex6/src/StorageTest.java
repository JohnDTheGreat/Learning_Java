/**
 * Created by johndee on 4/13/16.
 */
public class StorageTest {
    int storage(String s){
        return s.length() * 2;
    }
    public static void main(String[] args){
        StorageTest stg = new StorageTest();
        System.out.println("This is how much space you need to store johndee: " + stg.storage("johndee") + " bytes");
    }
}
