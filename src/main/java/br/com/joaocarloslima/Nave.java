package br.com.joaocarloslima;

public class Nave extends Asset{
    
    public Nave(int x, int y, int velocidade, Direcao direcao){
        super(x, y, velocidade, direcao);
    }

    public Tiro atirar(int poder){
        Tiro tiro = new Tiro(getX(),getY(),getVelocidade(),getDirecao(),poder);
        return tiro;
    }

    @Override
    public void mover() {
        super.mover();
        if(getX() <= 0 && getX() >= 590){
            int direction = (getDirecao() == Direcao.DIREITA ? 1 : -1);

            setX((getX() + direction)*getVelocidade());
        }

    }

}
