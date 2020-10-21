public class Despesa {
    
    //Atributos
    String  descricao,
            date;
    double valor;
    Categoria categorias[];

    int j;

    //Métodos
   public void cadastrarCategoria(Categoria c){

        categorias[j] = c;
        j++;
    }
}
