//Davy.
package DAO;

import DTO.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class FuncionarioDAO {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<FuncionarioDTO> lista = new ArrayList<>();
    
    public void CadastrarFuncionario(FuncionarioDTO funcionariodto){
        
        String sql = "insert into tabela(nome, cidade)values (?,?)";
        conn = new Conexao().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, funcionariodto.getNomeFuncionario());
            pstm.setString(2, funcionariodto.getCidadeFuncionario());
            pstm.execute();
            pstm.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "FuncionarioDAO");
        }     
    }
    
    public ArrayList<FuncionarioDTO> PesquisarFuncionario(){
        
        String sql = "select * from tabela";
        conn = new Conexao().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
            FuncionarioDTO funcionariodto = new FuncionarioDTO();
            funcionariodto.setId(rs.getInt("id"));
            funcionariodto.setNomeFuncionario(rs.getString("nome"));
            funcionariodto.setCidadeFuncionario(rs.getString("cidade"));
            
            lista.add(funcionariodto);
            }
             
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro + "Erro Pesquisar");
        }
        return lista;
    }

    public void AtualizarFuncionario(FuncionarioDTO funcionariodto){
        
        String sql = "update tabela set nome = ?, cidade = ? where id = ?";
        conn = new Conexao().conectaBD();
        
        try{
           pstm = conn.prepareStatement(sql);
           pstm.setString(1, funcionariodto.getNomeFuncionario());
           pstm.setString(2, funcionariodto.getCidadeFuncionario());
           pstm.setInt(3, funcionariodto.getId());
           pstm.executeUpdate();
           pstm.close();
           
        } catch (Exception erro){
            JOptionPane.showMessageDialog(null, erro + "Erro ao Atualizar");
        }   
    }
    
    public void DeletarFuncionario(FuncionarioDTO funcionariodto){
        
        String sql = "delete from tabela where id = ?";
        conn = new Conexao().conectaBD();
        
        try{
           pstm = conn.prepareStatement(sql);
           pstm.setInt(1, funcionariodto.getId());
           pstm.execute();
           pstm.close();
           
        } catch(Exception erro){
            JOptionPane.showMessageDialog(null, erro + "Erro ao Deletar");
        }      
    }
}



