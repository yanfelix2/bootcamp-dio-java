public class Tv {
    boolean ligada = false;
    int canal = 0;
    int volume = 23;


    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("O canal foi aumentado para: " + canal);
    }

    public void diminuirCanal(){
        canal--;
    }

    public void ligar(){
        ligada = true;
        System.out.println("A TV foi ligada");
    }

    public void desligar(){
        ligada = false;
        System.out.println("A TV foi desligada");
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("O volume foi aumentado para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("O volume foi diminuido para: " + volume);
    }


    
}
