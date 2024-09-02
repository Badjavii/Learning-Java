import java.util.Random;

public class JuegoDado {
    public static void main(String[] args) {
        play();
    }

    public static void play() {
        Random random = new Random();
        int resultado = lanzarDado(random);
        if (resultado == 1 || resultado == 3) {
            System.out.println("You ¡Win!");
        } else if (resultado == 2) {
            System.out.println("Lose");
        } else {
            System.out.println("Try again");
            play();
        }
    }

    public static int lanzarDado(Random random) {
        return random.nextInt(6) + 1;
    }
}