public class Categoria {
    String descricao;
    SubCategoria cadastraSubCategoria[];
    int k;

    public void cadastraSubCategoria(SubCategoria s){
         cadastraSubCategoria[k] = s;
         k++;
    }
}
