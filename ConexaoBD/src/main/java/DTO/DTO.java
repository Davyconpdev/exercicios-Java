package DTO;

public class DTO {
    
    private String nomeProfissional, sobrenome, profissao, area_atuacao, tipo_contrato, experiencia, email;
    private Double salario;
    private int idProfissional;
    
    
    public String getNomeProfissional() {
        return nomeProfissional;
    }
    public void setNomeProfissional(String nome) {
        this.nomeProfissional = nome;
    }
    
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    public String getArea_atuacao() {
        return area_atuacao;
    }
    public void setArea_atuacao(String area) {
        this.area_atuacao = area;
    }
    
    public String getTipo_contrato() {
        return tipo_contrato;
    }
    public void setTipo_contrato(String contrato) {
        this.tipo_contrato = contrato;
    }
    
    public String getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
      
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario){
        this.salario = salario;
    }   

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getIdProfissional() {
        return idProfissional;
    }
    public void setIdProfissional(int idP) {
        this.idProfissional = idP;
    }    
}
