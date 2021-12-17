import java.util.*;
public class q3 {
   
    static Scanner Input =new Scanner (System.in);
    public static void main(String[] args) {
        
        final double pi=3.14;
        System.out.print("ENTER ANY NUMBER(RADIUS):");
        int radius =Input.nextInt();

        double area= 4.0 * pi * (Math.pow(radius,2));

        double volume= ((4.0/3.0) * pi * Math.pow(radius,3));
   
        System.out.println("\n\tDISPLAY SPHERE  AREA AND VOLUME");
        System.out.println("SPHERE AREA:"+area);
        System.out.println("SPHERE AREA:"+volume);

    }
    
}
