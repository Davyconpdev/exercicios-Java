package entidades;

public abstract class ItemBiblioteca {
    String titulo;
    protected int codigo;
    
    public ItemBiblioteca(String titulo, int codigo) {
        this.titulo = titulo;
        this.codigo = codigo;
    }
    
    protected void SetTitulo(String titulo){
        this.titulo = titulo;
    }
    public String GetTitulo(){
        return titulo;
    }
    
    protected void SetCodigo(int codigo){
        this.codigo = codigo;
    }
    public int GetCodigo(){
        return codigo;
    }
    
    public void ExibirInfoBasica(){
        System.out.printf("\nTitulo da Literatura: %s.  Codigo da Literatura: %d.",this.GetTitulo(),this.GetCodigo());
    }
    
    public String exibirDetalhes(){
        return "";
    }
}
