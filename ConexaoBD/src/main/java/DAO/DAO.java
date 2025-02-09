package DAO;

import DTO.DTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO {
    
    Connection con;
    PreparedStatement pstm;
    ResultSet resp;
    ArrayList<DTO> lista = new ArrayList<>();
       
    public void CadastrarPessoa(DTO Pdto){
        
        String sql = "INSERT INTO Profissional(nome, sobrenome, profissao, area_atuacao, tipo_contrato, experiencia, salario, email) VALUE (?,?,?,?,?,?,?,?)";
        con = new ConexaoBD().Conexaobd();
        
        try{            
            pstm = con.prepareStatement(sql);
            pstm.setString(1, Pdto.getNomeProfissional());
            pstm.setString(2, Pdto.getSobrenome());
            pstm.setString(3, Pdto.getProfissao());
            pstm.setString(4, Pdto.getArea_atuacao());
            pstm.setString(5, Pdto.getTipo_contrato());
            pstm.setString(6, Pdto.getExperiencia());
            pstm.setDouble(7, Pdto.getSalario());
            pstm.setString(8, Pdto.getEmail());
            pstm.execute();
            pstm.close();
            
        }catch(SQLException erro){            
            JOptionPane.showMessageDialog(null, erro +"DAO");            
        }
    }
        
         
    public ArrayList<DTO> VisualizarPessoa(){
        
        String sql = "SELECT * FROM Profissional";
        con = new ConexaoBD().Conexaobd();
        
        try{            
            pstm = con.prepareStatement(sql);
            resp = pstm.executeQuery();
            
            while(resp.next()){
                DTO Pdto = new DTO();
                Pdto.setIdProfissional(resp.getInt("idProfissional"));
                Pdto.setNomeProfissional(resp.getString("nome"));
                Pdto.setSobrenome(resp.getString("sobrenome"));
                Pdto.setProfissao(resp.getString("profissao"));
                Pdto.setArea_atuacao(resp.getString("area_atuacao"));
                Pdto.setTipo_contrato(resp.getString("tipo_contrato"));
                Pdto.setExperiencia(resp.getString("experiencia"));
                Pdto.setSalario(resp.getDouble("salario"));
                Pdto.setEmail(resp.getString("email"));
                lista.add(Pdto);
            }
            
        }catch(SQLException erro){            
            JOptionPane.showMessageDialog(null, erro + "Visualizar Pessoas");
        }    
        return lista;
    }
    
    
           
    public void AtualizarPessoa(DTO Pdto){
        
        String sql = "UPDATE Profissional SET nome = ?, sobrenome = ?, profissao = ?, area_atuacao = ?, tipo_contrato = ?, experiencia = ?, salario = ?, email = ? WHERE idProfissional = ?"; 
        con = new ConexaoBD().Conexaobd();
            
        try{     
            pstm = con.prepareStatement(sql);
            pstm.setString(1, Pdto.getNomeProfissional());
            pstm.setString(2, Pdto.getSobrenome());
            pstm.setString(3, Pdto.getProfissao());
            pstm.setString(4, Pdto.getArea_atuacao());
            pstm.setString(5, Pdto.getTipo_contrato());
            pstm.setString(6, Pdto.getExperiencia());
            pstm.setDouble(7, Pdto.getSalario());
            pstm.setString(8, Pdto.getEmail());
            pstm.setInt(9, Pdto.getIdProfissional());
            pstm.executeUpdate();
            pstm.close();
            
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, erro + "Atualizar os Dados Pessoais");
        }
    }
  
        
    public void DeletarPessoa(DTO Pdto){
        
        String sql = "DELETE FROM Profissional WHERE idProfissional = ?"; 
        con = new ConexaoBD().Conexaobd();
        
        try{
           pstm = con.prepareStatement(sql);
           pstm.setInt(1, Pdto.getIdProfissional());
           pstm.execute();
           pstm.close();
           
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, erro + "Deletar Dados Pessoais");
        }
    }
}
