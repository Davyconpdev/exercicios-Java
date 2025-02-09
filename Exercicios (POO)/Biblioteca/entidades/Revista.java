package entidades;

public class Revista extends ItemBiblioteca {
    protected String mesPublicacao;
    protected int edicao;
    
    public Revista(String titulo, int codigo,String mesPublic,int edicao){
        super(titulo,codigo);
        this.mesPublicacao = mesPublic;
        this.edicao = edicao;
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
    
    protected void SetMesPublicacao(String mesPublic){
        this.mesPublicacao = mesPublic;
    }
    public String GetMesPublicacao(){
        return mesPublicacao;
    }
    
    protected void SetEdicao(int edicao){
        this.edicao = edicao;
    }
    public int GetEdicao(){
        return edicao;
    }
    
    @Override
    public String exibirDetalhes(){
        return "\nMes da Publicacao: "+this.GetMesPublicacao()+"."+
               " Sendo a "+this.GetEdicao()+"ª edicao.";
    }
}
