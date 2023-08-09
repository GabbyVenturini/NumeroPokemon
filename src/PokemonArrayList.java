public class PokemonArrayList {
    public static void main(String[] args) {
        //Todo: Elabore um algoritmo que tenha um array com alguns tipos de pokemon.

        //grama, eletrico, agua, fogo.

      String[] pokemonsCapturados = {"grama", "grama", "eletrico","agua", "fogo"};

      int contagemFogo = 0;
      int contagemGrama = 0;
      int contagemEletrico = 0;
      int contagemAgua = 0;

      for(int i=0; i<pokemonsCapturados.length;i++){
          String tipo = pokemonsCapturados[i];
      switch(tipo){
          case "fogo":
              contagemFogo++;
              break;
          case "grama":
              contagemGrama++;
              break;
          case "eletrico":
              contagemEletrico++;
              break;
          case "agua":
              contagemAgua++;
              break;
          default:
              System.out.println("Nao reconhecido");
              break;
      }
      }
        System.out.println("Tipo fogo contagem:" +contagemFogo);
        System.out.println("tipo grama contagem: " +contagemGrama);
        System.out.println("Tipo eletrico contagem: " +contagemEletrico);
        System.out.println("Tipo agua contagem: " +contagemAgua);
}}
