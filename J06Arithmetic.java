import java.util.Scanner;

public class J06Arithmetic {
    public static void main(String [] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no: ");
        a=sc.nextInt();   
        System.out.println("Enter no: ");
        b=sc.nextInt();
        System.out.println("Addition:"+(a+b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Divison: "+(a/b));
        System.out.println("Subtraction: "+(a-b));
        System.out.println("Modulo :"+(a%b));
        
    }
    
}
