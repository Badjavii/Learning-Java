import java.util.Scanner;

;

public class Main{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("UCAB Elaborado por Javier Otero\n");
      System.out.println("Indique cualquier numero entero que quiera comprobar si es PRIMO:");
      int num = input.nextInt();
      Primou primo = new Primou();
      if (primo.esPrimo(num))
          System.out.println("EL NUMERO ES PRIMO. DIVINOOO");
      else
          System.out.println("EL NUMERO NO ES PRIMO, MANADA >:(");
    };
};
