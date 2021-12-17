import java.util.Scanner;
 class q1 {
    public static void main(String[] args) {
        
        String empname;
        int empno,PT=100,CCA=240;
        float basic;
        double DA,HRA,PF,total;

        Scanner Input= new Scanner(System.in); 

        System.out.print("ENTER EMPLOLYEE NAME:");
        empname=Input.nextLine();

        System.out.print("ENTER EMPLOLYEE NUMBER:");
        empno=Input.nextInt();


        System.out.print("ENTER BASIC NUMBER:");
        basic=Input.nextInt();

        

        DA=((basic * 50) / 100);
        HRA=basic * 25F / 100;
        PF= basic * 10/100;
        total=(DA+HRA+CCA)-(PF+PT);

        System.out.println("GROSS SALARY:"+total);

        Input.close();
    








    }

}
