import java.util.Scanner;

;

public class Main{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("UCAB Make by Javier Otero\n");
      System.out.println("Indicate any integer that you want to check if it is prime:");
      int num = input.nextInt();
      Primou primo = new Primou();
      if (primo.esPrimo(num))
          System.out.println("The number is prime");
      else
          System.out.println("The number is not prime");
    };
};
