package praticando.atvAvaliativa.ingresso;

import javax.swing.JOptionPane;


public class Bilheteria {
    public static void main(String[] args) {
        
        Ingresso ingresso = new Ingresso(40);
        Normal normal = new Normal(100,true);
        Vip vip = new Vip(100,20);
        CamaroteInferior inferior = new CamaroteInferior(180,20,"lateral");
        CamaroteSuperior superior = new CamaroteSuperior(250, 20,'B');

        String[] opcoes = {"INGRESSO","NORMAL","VIP","CAMAROTE INFERIOR","CAMAROTE SUPERIOR"};
        String seletor = (String) JOptionPane.showInputDialog(null, "Escolha o ingresso", "INGRESSOS DISPONIVEIS",  
                JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        
        
        switch (seletor) {
            case "INGRESSO":
                System.out.println("Valor: R$"+ingresso.mostraValor());
                break;
            case "NORMAL":
                System.out.println("Valor: R$"+normal.mostraValor());
                break;
            case "VIP":
                System.out.println("Valor: R$"+vip.mostraValor());
                break;
            case "CAMAROTE INFERIOR":
                System.out.println("Valor: R$"+inferior.mostraValor());
                break;
            case "CAMAROTE SUPERIOR":
                System.out.println("Valor: R$"+superior.mostraValor());
                break;
            default:
                break;
        }
    }
}
