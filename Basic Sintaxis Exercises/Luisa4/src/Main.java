import java.awt.*;
import java.util.Scanner;
public class Main{
    public static boolean coprimos(int a, int b){
      return mcd.gcd(a, b) == 1;
    };
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Estimado Usuario\n");
        System.out.println("Por favor, indique un primer numero entero positivo:");
        int num1 = sc.nextInt();
        System.out.println("Por favor, indique un segundo numero entero positivo:");
        int num2 = sc.nextInt();
        if (coprimos(num1, num2))
            System.out.println(num1 + " y " + num2 + " son coprimos.\nDIVINOOOOO");
        else
            System.out.println(num1 + " y " + num2 + " NO son coprimos.\nA DIOS MANADA");
    };
};