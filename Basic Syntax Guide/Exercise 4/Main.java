import java.util.Scanner;
public class Main{
  public static void Fibonacci(int num){
    int next = 1;
    int prev = 0;
    int sum;
    System.out.print("1, ");
    for (int i=2; i<=num; i++){
      sum = prev + next;
      System.out.print(sum + ", ");
      prev = next;
      next = sum;
    };
  };
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Estimado Usuario\n");
    System.out.println("Por favor, indique la cantidad de numeros que quiere que se muestren en la Succesion de Fibonacci:");
    int num = sc.nextInt();
    System.out.print("\nLa succesion de Fibonacci: ");
    Fibonacci(num);
  };
};
