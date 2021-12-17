import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        
        Scanner Input=new Scanner (System.in);
        System.out.print("ENTER NUMBER A:");
        int a =Input.nextInt();

        System.out.print("ENTER NUMBER B:");
        int b =Input.nextInt();

        System.out.println("\nENTERED NUMBER A:"+a);
        System.out.println("ENTERED NUMBER B:"+b);

        int c=a;
        a=b;
        b=c;
        System.out.println("\n\t SWAP");
        System.out.println("ENTERED NUMBER A:"+a);
        System.out.println("ENTERED NUMBER B:"+b);

  

    }
    
}
