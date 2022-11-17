package praticando.atvAvaliativa.ingresso;

public class CamaroteSuperior extends Vip{

    private char classe;

    CamaroteSuperior(float valor, float adicional, char classe) {
        super(valor, adicional);
        this.classe=classe;
    }
    
    public char getClasse(){
        return classe;
    }

    public void setClasse(char classe){
        this.classe=classe;
    }

    @Override
    public float mostraValor() {
        if(getClasse()=='B'){
            System.out.println("Acesso ao camarote classe B.");
            return (super.mostraValor()*(float)0.50)+super.mostraValor();
        }
        else{
            System.out.println("Acesso ao camarote classe A.");
            return (super.mostraValor()*(float)0.75)+super.mostraValor();
        }
    }

}
