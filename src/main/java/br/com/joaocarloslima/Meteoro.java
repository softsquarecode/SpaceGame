package br.com.joaocarloslima;

import java.util.Random;

import javafx.scene.image.ImageView;

public class Meteoro extends Asset {
    private Random random = new Random();
    

    public int tamanho = random.nextInt(1,8);
    public int poder = tamanho;
    

    public  Meteoro(int x, int y, int velocidade, Direcao direcao){
        super(x, y, velocidade, direcao);

        String path = "images/meteoro" + tamanho + ".png";
        ImageView imagem = new ImageView(App.class.getResource(path).toString());
        
        setImagem(imagem);
    }

    public void tomarTiro(Tiro tiro){
     setTamanho(tamanho-tiro.getPoder());
     setPoder(poder-tiro.getPoder());
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

   public int getPoder() {
       return poder;
   }
}
/*
 tamanho de 1 a 8
 */