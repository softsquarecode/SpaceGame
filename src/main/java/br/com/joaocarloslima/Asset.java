package br.com.joaocarloslima;

import javafx.scene.image.ImageView;

public abstract class Asset {
    private int x;
    private int y;
    private int velocidade;
    private ImageView imagem;
    private Direcao direcao;

    public Asset(int x, int y, int velocidade, Direcao direcao){

    }

    public void mover(){

    }

    public boolean colidiuCom(Asset asset){
        return x < asset.getX() + 50 && x + 50 > asset.getX() && y < asset.getY() + 50 && y + 50 > asset.getY();
    }

    public Direcao getDirecao() {
        return direcao;
    }
    public ImageView getImagem() {
        return imagem;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }
    public void setImagem(ImageView imagem) {
        this.imagem = imagem;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

}
