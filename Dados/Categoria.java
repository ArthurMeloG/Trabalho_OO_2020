public class Categoria {

    //Atributos
    String descricao;
    SubCategoria subcategorias[];

    int k;

    //Métodos
    public void cadastrarSubCategoria(SubCategoria s){

        subcategorias[k] = s;
        k++;
    }
}
