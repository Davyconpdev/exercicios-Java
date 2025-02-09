package entidades;

public class Livro extends ItemBiblioteca {
    protected String autor;
    protected int numPaginas;
    
    public Livro(String titulo, int codigo,String autor,int paginas){
        super(titulo,codigo);
        this.autor = autor;
        this.numPaginas = paginas;
    }
    
    @Override
    protected void SetTitulo(String titulo){
        this.titulo = titulo;
    }
    @Override
    public String GetTitulo(){
        return titulo;
    }
 
    @Override
    protected void SetCodigo(int codigo){
        this.codigo = codigo;
    }
    @Override
    public int GetCodigo(){
        return codigo;
    }
    
    protected void SetAutor(String autor){
        this.autor = autor;
    }
    public String GetAutor(){
        return autor;
    }
    
    public void SetNumPaginas(int paginas){
        this.numPaginas = paginas;
    }
    public int GetNumPaginas(){
        return numPaginas;
    }
    
    @Override
    public String exibirDetalhes(){
        return "\nAutor: "+this.GetAutor()+"."+
               "\nO Livro contem "+this.GetNumPaginas()+" paginas.";
    }
}
