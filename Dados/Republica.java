public class Republica{

    //Atributos
    Pessoa pessoas[];
    Despesa despesas[];

    int i = 0;
    
    //Métodos
    public void cadastrarPessoa(Pessoa p){
        pessoas[i] = p;
        i++;
    }

    public void cadastrarDespesa(Despesa d){
        despesas[i] = d;
        i++;
    }
}