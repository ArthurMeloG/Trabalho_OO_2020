public class Calcula extends Republica {

    //Atributos
    String escolhaRegra;
    Republica dadosRepublica = new Republica();

    //Metodos
    public double calculaTotal(){
        double total = 0;
        for(i = 0; i <= dadosRepublica.i; i++ ){
             total = dadosRepublica.pessoas[i].totalRendimentos +  total;
        }
        return total;
    }
    
    private double regraCalculaIgual(){
        double total;
        return total;
    }

    private double regraCalculaProp(){
        double total;
        return total;
    }
}
