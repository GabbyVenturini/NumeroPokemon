import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      int numeroTotalPokemon=0;
      Scanner scanner = new Scanner(System.in);

        System.out.println("Me diga qual o numero de pokemon capturados:");
        numeroTotalPokemon = scanner.nextInt();
        for(int i=0;i<=numeroTotalPokemon;i++){
            System.out.println("pokemon: " +i);

    }
}}