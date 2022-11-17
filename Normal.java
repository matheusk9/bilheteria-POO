package praticando.atvAvaliativa.ingresso;

public class Normal extends Ingresso {
    
    private boolean pista;

    Normal(float valor, boolean pista) {
        super(valor);
        this.pista = pista;
    }

    public boolean getAcessoPista(){
        return pista;
    }

    public void setAcessoPista(boolean pista){
        this.pista = pista;
    }

   @Override
   public float mostraValor() {
       if(pista){
           System.out.println("Com acesso à pista.");
           return (valor*(float)0.10) + valor;
       }
       else{
           System.out.println("Sem acesso à pista.");
           return valor;
       }
   }
}

