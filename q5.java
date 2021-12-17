import java.util.*;
public class q5 {
    static Scanner Input= new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("ENTER NUMBER(VOLTAGE):");
        int vol=Input.nextInt();

        System.out.print("ENTER NUMBER(VOLTAGE):");
        int cur=Input.nextInt();

        double res=vol/cur;
        double pwr=vol*cur;

        System.out.println("\nRESISTANCE:"+res);
        System.out.println("POWER:"+pwr);    

    }
}
