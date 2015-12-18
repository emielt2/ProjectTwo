import java.io.IOException;

/**
 * Created by E on 17/12/2015.
 */
public class WelcomeProjectTwo {
    public static void main (String args[]){
        System.out.println("ProjecTwo started!");
        IDGenerator id1 = new IDGenerator();
        IDGenerator id2 = new IDGenerator();
        System.out.println("--");
        for(int i = 0 ; i<10 ; i++){
            System.out.println("id1=" + id1.getNewID());
            System.out.println("id2=" + id2.getNewID());
        }
        try{
            IOException ioe;
        }
        finally {

        }


    }
}
