public class Despesa {
    
    //Atributos
    public String descricao, date;
    private double valor;
    private Categoria categorias[];

    int j;

    //Métodos
   public void cadastrarCategoria(Categoria c){

        categorias[j] = c;
        j++;
    }
}
