package praticando.atvAvaliativa.ingresso;

public class CamaroteInferior extends Vip{

    private String localizacao;
    
    CamaroteInferior(float valor, float adicional, String localizacao) {
        super(valor, adicional);
        this.localizacao = localizacao;
    }
    
    public String getLocalizacao(){
        return localizacao;
    }

    public void setLocalizacao(String localizacao){
        this.localizacao=localizacao;
    }

    @Override
    public float mostraValor() {
        if(getLocalizacao()=="lateral"){
            System.out.println("Lateral");
            return (super.mostraValor()*(float)0.20)+super.mostraValor();
        }
        else{
            System.out.println("Frontal");
            return (super.mostraValor()*(float)0.35)+super.mostraValor();
        }
    }

}
