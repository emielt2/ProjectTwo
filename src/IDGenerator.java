/**
 * Created by E on 17/12/2015.
 */
public class IDGenerator {
    static String whoisthis = "I am IDGenerator";
    static int counter = 1_000_000;
    int getNewID(){
        return ++counter;
    }
}
