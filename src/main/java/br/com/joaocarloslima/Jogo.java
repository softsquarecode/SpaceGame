package br.com.joaocarloslima;
import java.util.List;
import java.util.Random;
public class Jogo {
    List<Asset> assets;
    Nave nave = new Nave(280, 400, 10, Direcao.DIREITA);

    private int pontos;
    private int nivel = 1;

    public Tiro atirar(){
        Tiro tiro = new Tiro(nave.getX(), nave.getY(), nave.getVelocidade(), nave.getDirecao(),nivel);
        assets.add(tiro);
        return tiro;
    };
    public Meteoro criarMeteoro(){
        Random random = new Random();
        int randomPosX = random.nextInt(0,640);
        int randomPosY = random.nextInt(-640,-300);
        int velocidade = nivel;

        Meteoro meteoro = new Meteoro(randomPosX,randomPosY,velocidade,Direcao.BAIXO);
        assets.add(meteoro);
        return meteoro;
    };
    public void pontuar(){
        if(pontos <= 4){
            pontos++;
        }
    }
    public int getPontos() {
        return pontos;
    }
    public int getNivel() {
        return nivel;
    }
    public Nave getNave() {
        return nave;
    }

}
