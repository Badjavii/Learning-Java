import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Buenos dias, estimado usuario\n");
        System.out.println("Ingrese un numero como base: ");
        int base = sc.nextInt();
        System.out.println("Ingrese un numero como exponente: ");
        int expo = sc.nextInt();
        int operacion = 1;
        for (int i = 1; i <= expo; i++){
            for (int p = 1; p <= i; p++)
                operacion *= base;
            System.out.println(base+ "^" + i + " = " + operacion);
            operacion = 1;
        };
        System.out.println("\nHELLO WORLD EN JAVA\nDIVINO MI REYYY");
    };
};