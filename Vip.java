package praticando.atvAvaliativa.ingresso;

public class Vip extends Ingresso {

    protected float adicional;

    Vip(float valor,float adicional) {
        super(valor);
        this.adicional = adicional;
    }
    
    public float getAdicional(){
        return adicional;
    }

    public void setAdicional(float adicional){
        this.adicional = adicional;
    }

    @Override
    public float mostraValor() {
        return valor+adicional;
    }
}
