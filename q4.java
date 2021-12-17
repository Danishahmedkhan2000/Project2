import java.util.*;
public class q4 {
    static Scanner Input=new Scanner (System.in);
    public static void main(String[] args) {
        
        
        int girls=0,boys=0;

        System.out.println("HOW MANY BOYS AND GRILS IN BATCH 1:");

        int boy=Input.nextInt();
        int girl=Input.nextInt();
        boys+=boy;
        girls+=girl;

        System.out.println("\nHOW MANY BOYS AND GRILS IN BATCH 2:");

        boy=Input.nextInt();
        girl=Input.nextInt();
        boys+=boy;
        girls+=girl;

        System.out.println("\nHOW MANY BOYS AND GRILS IN BATCH 3:");

        boy=Input.nextInt();
        girl=Input.nextInt();
        boys+=boy;
        girls+=girl;

 
        System.out.println("\nTOTAL BOYS:"+boys);
        Float avg=boys/3f;
        System.out.println("AVERAGE BOYS:"+avg);

        System.out.println("\nTOTAL GRILS:"+girls);
        Float avgs=girls/3f;
        System.out.println("AVERAGE GIRLS:"+avgs);



    }
    
}
