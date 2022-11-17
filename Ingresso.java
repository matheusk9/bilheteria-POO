package praticando.atvAvaliativa.ingresso;

public class Ingresso {
    protected float valor;

    Ingresso(float valor){
        this.valor = valor;
    }

    public float getValor(){
        return valor;
    }

    public void setValor(float valor){
        this.valor= valor;
    }

    public float mostraValor(){
        return valor;
    }
}
