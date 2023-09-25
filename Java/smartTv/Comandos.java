package smartTv;

public class Comandos {
    boolean ligado = false;
    int canal = 1;
    int volume = 25;

    public Comandos() {
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void aumentarVolume() {
        ++this.volume;
    }

    public void diminuirVolume() {
        --this.volume;
    }

    public void aumentarCanal() {
        ++this.canal;
    }

    public void diminuirCanal() {
        --this.canal;
    }

    public void mudarCanal(int canalEspecifico) {
        this.canal = canalEspecifico;
    }
}
