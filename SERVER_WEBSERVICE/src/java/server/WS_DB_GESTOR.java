package server;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author patri
 */
@WebService(serviceName = "TrabalhoWebService_Server")
public class WS_DB_GESTOR {

    ArrayList<Disco> discos = new ArrayList<Disco>();
    
    
    @WebMethod(operationName = "inserirAssociado")
    public Boolean inserirAssociado(@WebParam(name = "id") int id, @WebParam(name = "nome") String nome,
                                    @WebParam(name = "morada") String morada, @WebParam(name = "telefone") int telefone,
                                    @WebParam(name = "email") String email, @WebParam(name = "data_nascimento") String data_nascimento){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro no driver");
        }
        
        String query = "INSERT INTO associado (id, nome, morada, telefone, email, data_nascimento)"
                       + "Values ("+id+",'"+nome+"','"+morada+"',"+telefone+",'"+email+"','"+data_nascimento+"')";
        
        Connection ligacao;
        
        try {
            ligacao = DriverManager.getConnection("jdbc:mysql://127.0.0.1/nostalgico?user=sd&password=123456");
            Statement stmt;
            stmt = ligacao.createStatement();
            
            boolean result = stmt.execute(query);
            
            if(result== true)
                return true;

        } catch (SQLException ex) {
            Logger.getLogger(WS_DB_GESTOR.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

        return true;
    }

    @WebMethod(operationName = "removerAssociado")
    public Boolean removerAssociado(@WebParam(name = "id") int id) {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro no driver");
        }

        try {
            Connection ligacao;
            ligacao = DriverManager.getConnection("jdbc:mysql://127.0.0.1/nostalgico?user=sd&password=123456");
            Statement stmt;
            stmt = ligacao.createStatement();
            String query = "delete from associado where associado.id =" + id;

            int rowsaffected = stmt.executeUpdate(query);
            System.out.println("Rows affected: "+rowsaffected);

            if(rowsaffected == 1)
                return true;
            } 
        catch (SQLException ex) {
            Logger.getLogger(WS_DB_GESTOR.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }

    @WebMethod(operationName = "inserirDisco")
    public Boolean inserirDisco(@WebParam(name = "id") int id, @WebParam(name = "titulo") String titulo,
                                @WebParam(name = "editora") String editora, @WebParam(name = "grupo_musico") String grupo_musico,
                                @WebParam(name = "ano") int ano, @WebParam(name = "estilo_musica") String estilo_musica
        ) {
             
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro no driver");
        }
        
        String query = "INSERT INTO disco (id, titulo, editora, grupo_musico, ano, estilo_musica)"
                       + "Values ("+id+",'"+titulo+"','"+editora+"','"+grupo_musico+"',"+ano+",'"+estilo_musica+"')";
        
        Connection ligacao;
        
        try {
            ligacao = DriverManager.getConnection("jdbc:mysql://127.0.0.1/nostalgico?user=sd&password=123456");
            Statement stmt;
            stmt = ligacao.createStatement();
            
            boolean result = stmt.execute(query);
            
            if(result== true)
                return true;

        } catch (SQLException ex) {
            Logger.getLogger(WS_DB_GESTOR.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

        return true;
    }

    @WebMethod(operationName = "removerDisco")
    public Boolean removerDisco(@WebParam(name = "id") int id) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro no driver");
        }

        try {
            Connection ligacao;
            ligacao = DriverManager.getConnection("jdbc:mysql://127.0.0.1/nostalgico?user=sd&password=123456");
            Statement stmt;
            stmt = ligacao.createStatement();
            String query = "delete from disco where disco.id =" + id;

            int rowsaffected = stmt.executeUpdate(query);
            System.out.println("Rows affected: "+rowsaffected);

            if(rowsaffected == 1)
                return true;
            } 
        catch (SQLException ex) {
            Logger.getLogger(WS_DB_GESTOR.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }

    @WebMethod(operationName = "pesquisaDiscoTitulo")
    public ArrayList<Disco> pesquisaDiscoTitulo(@WebParam(name = "titulo") String titulo) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro no driver");
        }
        
        try{
            
            Connection ligacao;
            ligacao = DriverManager.getConnection("jdbc:mysql://127.0.0.1/nostalgico?user=sd&password=123456");
            Statement stmt;
            stmt = ligacao.createStatement();
            String query = "SELECT * from disco where titulo= '"+titulo +"'";
        
            ResultSet result = stmt.executeQuery(query);
            
            discos.clear();
        
            while(result.next()){
                Disco disc = new Disco();
                disc.setId(result.getInt("id"));
                disc.setTitulo(result.getString("titulo"));
                disc.setEditora(result.getString("editora"));
                disc.setGrupoMusico(result.getString("grupo_musico"));
                disc.setAno(result.getInt("ano"));
                disc.setEstiloMusica(result.getString("estilo_musica"));
                discos.add(disc);
            }
        }
        catch(SQLException ex){
            Logger.getLogger(WS_DB_GESTOR.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        return discos;
    }
    
    @WebMethod(operationName = "pesquisaDiscoGrupoMusico")
    public ArrayList<Disco> pesquisaDiscoGrupoMusico(@WebParam(name = "grupo_musico") String grupo_musico) {
       try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro no driver");
        }
       
       try{
            
            Connection ligacao;
            ligacao = DriverManager.getConnection("jdbc:mysql://127.0.0.1/nostalgico?user=sd&password=123456");
            Statement stmt;
            stmt = ligacao.createStatement();
            String query = "SELECT * from disco where grupo_musico= '"+grupo_musico +"'";
        
            ResultSet result = stmt.executeQuery(query);
            
            discos.clear();
        
            while(result.next()){
                Disco disc = new Disco();
                disc.setId(result.getInt("id"));
                disc.setTitulo(result.getString("titulo"));
                disc.setEditora(result.getString("editora"));
                disc.setGrupoMusico(result.getString("grupo_musico"));
                disc.setAno(result.getInt("ano"));
                disc.setEstiloMusica(result.getString("estilo_musica"));
                discos.add(disc);
            }
        }
        catch(SQLException ex){
            Logger.getLogger(WS_DB_GESTOR.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return discos;
    }

    @WebMethod(operationName = "pesquisaDiscoEstiloMusica")
    public ArrayList<Disco> pesquisaDIscoEstiloMusica(@WebParam(name = "estilo_musica") String estilo_musica) {
       try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro no driver");
        }
        
       try{
            
            Connection ligacao;
            ligacao = DriverManager.getConnection("jdbc:mysql://127.0.0.1/nostalgico?user=sd&password=123456");
            Statement stmt;
            stmt = ligacao.createStatement();
            String query = "SELECT * from disco where estilo_musica= '"+estilo_musica +"'";
        
            ResultSet result = stmt.executeQuery(query);
            
            discos.clear();
        
            while(result.next()){
                Disco disc = new Disco();
                disc.setId(result.getInt("id"));
                disc.setTitulo(result.getString("titulo"));
                disc.setEditora(result.getString("editora"));
                disc.setGrupoMusico(result.getString("grupo_musico"));
                disc.setAno(result.getInt("ano"));
                disc.setEstiloMusica(result.getString("estilo_musica"));
                discos.add(disc);
            }
        }
        catch(SQLException ex){
            Logger.getLogger(WS_DB_GESTOR.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return discos;
    }

    @WebMethod(operationName = "alugaDisco")
    public Boolean alugaDisco(@WebParam(name = "id_associado") int id_associado,
                              @WebParam(name = "id_disco") int id_disco,
                              @WebParam(name = "data_aluguer") String data_aluguer,
                              @WebParam(name = "data_max_devolucao") String data_max_devolucao
    ) {
        
        try {
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Erro no driver");
            }
            Connection ligacao;
            ligacao = DriverManager.getConnection("jdbc:mysql://127.0.0.1/nostalgico?user=sd&password=123456");
            ligacao.setAutoCommit(false);
           try{ 
                String query1;
                query1 = "INSERT INTO aluguer (id_associado, id_disco, data_aluguer, data_max_devolucao) Values(?, ?, ?, ?)";
                // quando se passa ? como valor é porque os valores serao setados via setters depois de preparado a query

                PreparedStatement pstmt1 = ligacao.prepareStatement(query1);
                pstmt1.setInt(1, id_associado);
                pstmt1.setInt(2, id_disco);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                
                java.util.Date dateAluguer = null;
                try {
                    dateAluguer = sdf.parse(data_aluguer);
                } catch (ParseException ex) {
                    Logger.getLogger(WS_DB_GESTOR.class.getName()).log(Level.SEVERE, null, ex);
                }
                java.sql.Date sqlDateAluguer = new java.sql.Date(dateAluguer.getTime());
                pstmt1.setDate(3, sqlDateAluguer);
                
                java.util.Date dateDevolucao = null;
                try {
                    dateDevolucao = sdf.parse(data_max_devolucao);
                } catch (ParseException ex) {
                    Logger.getLogger(WS_DB_GESTOR.class.getName()).log(Level.SEVERE, null, ex);
                }
                java.sql.Date sqlDateDevolucao = new java.sql.Date(dateDevolucao.getTime());
                pstmt1.setDate(4, sqlDateDevolucao);
                
                pstmt1.executeUpdate();
                
                String query2 = "CREATE TRIGGER IF NOT EXISTS alugaDisco"
                        + " AFTER INSERT ON aluguer"
                        + " FOR EACH ROW"
                        + " BEGIN"
                        + " DELETE FROM disco WHERE disco.id = NEW.id_disco;"
                        + " END;";
                
                Statement stmt = ligacao.createStatement();
                stmt.executeUpdate(query2);
                ligacao.commit();
           }
           catch (SQLException ex) {
             Logger.getLogger(WS_DB_GESTOR.class.getName()).log(Level.SEVERE, null, ex);
             return false;
           } 
           return true;
        }catch (SQLException ex) {
            Logger.getLogger(WS_DB_GESTOR.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    @WebMethod(operationName = "devolveDisco")
    public Boolean devolveDisco(@WebParam(name = "id_associado") int id_associado,
                              @WebParam(name = "id_disco") int id_disco,
                              @WebParam(name = "data_aluguer") String data_aluguer,
                              @WebParam(name = "data_devolucao") String data_devolucao,
                              @WebParam(name = "data_max_devolucao") String data_max_devolucao                           
    ) {
        try{
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Erro no driver");
            }
            Connection ligacao;
            ligacao = DriverManager.getConnection("jdbc:mysql://127.0.0.1/nostalgico?user=sd&password=123456");
            ligacao.setAutoCommit(false);   
         try{ 

                //PreparedStatement statement = ligacao.prepareStatement(procedureCalculaMulta);
                String inserirHistorico;
                inserirHistorico = "INSERT INTO historico (id_associado, id_disco, data_aluguer, data_devolucao) Values(?, ?, ?, ?)";

                    // quando se passa ? como valor é porque os valores serao setados via setters depois de preparado a query                
                     PreparedStatement pstmt1 = ligacao.prepareStatement(inserirHistorico);
                     pstmt1.setInt(1, id_associado);
                     pstmt1.setInt(2, id_disco);

                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    java.util.Date dateAluguer = null;
                     try {
                         dateAluguer = sdf.parse(data_aluguer);
                     } catch (ParseException ex) {
                         Logger.getLogger(WS_DB_GESTOR.class.getName()).log(Level.SEVERE, null, ex);
                     }
                    java.sql.Date sqlDateAluguer = new java.sql.Date(dateAluguer.getTime());
                    pstmt1.setDate(3, sqlDateAluguer);

                    java.util.Date dateDevolucao = null;
                     try {
                         dateDevolucao = sdf.parse(data_devolucao);
                     } catch (ParseException ex) {
                         Logger.getLogger(WS_DB_GESTOR.class.getName()).log(Level.SEVERE, null, ex);
                     }
                    java.sql.Date sqlDateDevolucao = new java.sql.Date(dateDevolucao.getTime());
                    try {
                        pstmt1.setDate(4, sqlDateDevolucao);
                    } catch (SQLException ex) {
                        Logger.getLogger(WS_DB_GESTOR.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    pstmt1.executeUpdate();

                   int multa;
                    String query = "SELECT DATEDIFF('"+data_devolucao+"', '"+data_max_devolucao+"')";
                    PreparedStatement pstmt = ligacao.prepareStatement(query);
                    ResultSet rs = pstmt.executeQuery();
                    if (rs.next()) {
                        multa = rs.getInt(1);
                        if(multa>0)
                            System.out.println("Disco devolvido com sucesso mas com adição de multa atribuída ao associado de id "+id_associado+" pelo atraso na devolução"
                        + " do disco de id "+id_disco+ " é: " + "€ "+multa+",00");
                        else
                            System.out.println("Disco devolvido com sucesso sem adição de multas!");
                    }
  
                String triggerDeletarAluguer;
                    triggerDeletarAluguer = "CREATE TRIGGER IF NOT EXISTS devolveDisco"
                    +" AFTER INSERT ON historico "
                    + "FOR EACH ROW "
                    +" BEGIN" 
                    +" DELETE FROM aluguer WHERE (id_disco = NEW.id_disco and id_associado = NEW.id_associado);"
                    +" END;";

                    Statement stmt = ligacao.createStatement();
                    stmt.execute(triggerDeletarAluguer);                       

                     ligacao.commit(); // confirma a transação
         }catch (SQLException ex) {
             Logger.getLogger(WS_DB_GESTOR.class.getName()).log(Level.SEVERE, null, ex);
             return false;
           } 
           return true;
        }catch (SQLException ex) {
            Logger.getLogger(WS_DB_GESTOR.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
    
    
    
    
    
    
    
    
    
    
