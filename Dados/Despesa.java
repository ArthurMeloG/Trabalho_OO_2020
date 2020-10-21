public class Despesa {
    
    //Atributos
    String  descricao,
            date;
    Double valor;
    Categoria categoria[];

    int j;

    //Métodos
   public void cadastraCategoria(Categoria c){

        categoria[j] = c;
        j++;
    }
}
