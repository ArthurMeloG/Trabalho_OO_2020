public class Categoria {

    //Atributos
    String descricao;
    SubCategoria cadastraSubCategoria[];

    int k;

    //Métodos
    public void cadastraSubCategoria(SubCategoria s){

        cadastraSubCategoria[k] = s;
        k++;
    }
}
