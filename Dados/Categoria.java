public class Categoria {

    //Atributos
    public String descricao;
    private SubCategoria subcategorias[];

    int k;

    //Métodos
    public void cadastrarSubCategoria(SubCategoria s){

        subcategorias[k] = s;
        k++;
    }
}
