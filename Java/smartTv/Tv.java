package smartTv;

public class Tv {
   public Tv() {
   }

   public static void main(String[] args) {

      Comandos comandos = new Comandos();

      System.out.println("Smart-TV esta ligada? " + comandos.ligado);
      System.out.println("Volume atual: " + comandos.volume);
      System.out.println("Canal atual: " + comandos.canal);
      comandos.ligar();
      comandos.aumentarVolume();
      comandos.aumentarCanal();
      System.out.println("Smart-TV esta ligada? " + comandos.ligado);
      System.out.println("Volume atual: " + comandos.volume);
      System.out.println("Canal atual: " + comandos.canal);
      comandos.diminuirVolume();
      comandos.diminuirCanal();
      comandos.mudarCanal(13);
      System.out.println("Volume atual: " + comandos.volume);
      System.out.println("Canal atual: " + comandos.canal);
      comandos.desligar();
      System.out.println("Smart-TV est ligada? " + comandos.ligado);
   }
}