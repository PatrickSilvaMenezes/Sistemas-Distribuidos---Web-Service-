package cliente.webservice;

import java.util.ArrayList;
import java.util.Scanner;
import server.Disco;

/**
 *
 * @author patri
 */
public class CLIENTEWEBSERVICE {


    public static void main(String[] args) {
          int option = 0, id_associado = 0, id_disco= 0, telefone = 0, ano=0;
        // dados associado
        String nome, titulo, morada, email, data_nascimento;
        // dados disco
        String grupo_musico, estilo_musica, editora;
        // dados aluguer e devolucao
        String data_aluguer, data_max_devolucao, data_devolucao;
        Boolean result;
        
        ArrayList<Disco> discos = new ArrayList<Disco>();
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        

        while(option!=10){
           
                System.out.println("==================Bem vindo ao sistema de aluguel de discos==================");
                System.out.println("[1]- Inserir Associado"); //ok
                System.out.println("[2]- Inserir Disco"); // ok
                System.out.println("[3]- Remover Associado"); // ok
                System.out.println("[4]- Remover Disco");// ok
                System.out.println("[5]- Alugar Disco"); // ok
                System.out.println("[6]- Devolver Disco"); // to-do
                System.out.println("[7]- Pesquisar Disco por título"); // ok
                System.out.println("[8]- Pesquisar Disco por estilo de música"); // ok
                System.out.println("[9]- Pesquisar Disco por grupo musical"); // ok            
                System.out.println("[10]- sair do sistema");
                
                System.out.println("Escolha uma opção do painel do sistema de aluguel de discos: ");
                option = read.nextInt();
                read.nextLine();
                switch(option){
                    
                    // inserir associado
                    case 1:
                        System.out.println("Insira o valor do id do associado: ");
                        id_associado = read.nextInt();
                        read.nextLine();
                        System.out.println("Insira o nome do associado: ");
                        nome = read.nextLine();
                        System.out.println("Insira a morada do associado: ");
                        morada = read.nextLine();
                        System.out.println("Insira o telefone do associado: ");
                        telefone = read.nextInt();
                        read.nextLine();
                        System.out.println("Insira o email do associado: ");
                        email = read.nextLine();
                        System.out.println("Insira a data de nascimento do associado: ");
                        data_nascimento = read.nextLine();
                        
                        result = inserirAssociado(id_associado, nome, morada, telefone, email, data_nascimento);
                        
                        if(result==true)
                            System.out.println("Associado inserido com sucesso!");
                        break;
                    // inserir disco
                    case 2:
                        System.out.println("Insira o valor do id do disco: ");
                        id_disco = read.nextInt();
                        read.nextLine();
                        System.out.println("Insira o titulo do disco: ");
                        titulo = read.nextLine();
                        System.out.println("Insira a editora do disco: ");
                        editora = read.nextLine();
                        System.out.println("Insira o grupo musico do disco: ");
                        grupo_musico = read.nextLine();
                        System.out.println("Insira o ano do disco: ");
                        ano = read.nextInt();
                        read.nextLine();
                        System.out.println("Insira o estilo de musica do disco: ");
                        estilo_musica = read.nextLine();
                        
                        result = inserirDisco(id_disco, titulo, editora, grupo_musico, ano, estilo_musica);
                        if(result==true)
                            System.out.println("Disco inserido com sucesso!");
                        break;
                    // remove associado
                    case 3:
                        System.out.println("Insira o id do associado para remover o associado do sistema: ");
                        id_associado = read.nextInt();
                        result = removerAssociado(id_associado);
                        if(result==true)
                            System.out.println("Associado removido com sucesso!");
                        break;
                    // remove disco
                    case 4:
                        System.out.println("Insira o id do disco para remover o disco do sistema: ");
                        id_disco = read.nextInt();
                        result = removerDisco(id_disco);
                        if(result==true)
                            System.out.println("Disco removido com sucesso!");
                        break;
                    // alugar disco 
                    case 5:
                        System.out.println("Insira o valor do id do associado: ");
                        id_associado = read.nextInt();
                        System.out.println("Insira o valor do id do disco: ");
                        id_disco = read.nextInt();
                        read.nextLine();
                        System.out.println("Insira a data que o disco foi alugado: ");
                        data_aluguer = read.nextLine();
                        System.out.println("Insira a data máxima de devolução do disco: ");
                        data_max_devolucao = read.nextLine();
                        result = alugaDisco(id_associado, id_disco, data_aluguer, data_max_devolucao);
                        if(result==true)
                            System.out.println("Disco alugado no dia " + data_aluguer+" com sucesso!");
                        
                        break;
                    // devolver disco
                    case 6:
                         System.out.println("Insira o valor do id do associado: ");
                        id_associado = read.nextInt();
                        System.out.println("Insira o valor do id do disco: ");
                        id_disco = read.nextInt();
                        read.nextLine();
                        System.out.println("Insira a data que o disco foi alugado: ");
                        data_aluguer = read.nextLine();
                        System.out.println("Insira a data de devolução do disco: ");
                        data_devolucao = read.nextLine();
                        System.out.println("Insira a data máxima de devolução do disco: ");
                        data_max_devolucao = read.nextLine();
                        result = devolveDisco(id_associado, id_disco, data_aluguer, data_devolucao, 
                      data_max_devolucao);
                        if(result==true)
                            System.out.println("Disco devolvido no dia " + data_devolucao+" com sucesso!");
                        
                        break;

                    case 7:
                        System.out.println("Insira o titulo do disco para pesquisar o disco com esse titulo: ");
                        titulo = read.nextLine();
                       

                       discos = (ArrayList<Disco>) pesquisaDiscoTitulo(titulo);

                        for(Disco disco : discos) {
                            System.out.println("ID: " + disco.getId());
                            System.out.println("Titulo: " + disco.getTitulo());
                            System.out.println("Editora: " + disco.getEditora());
                            System.out.println("Grupo Musico: " + disco.getGrupoMusico());
                            System.out.println("Ano: " + disco.getAno());
                            System.out.println("Estilo Musica: " + disco.getEstiloMusica());
                        }

                        break;
                        
                    case 8:
                        System.out.println("Insira o estilo de musica para pesquisar os discos desse estilo: ");
                        estilo_musica = read.nextLine();
                       

                        discos = (ArrayList<Disco>) pesquisaDiscoEstiloMusica(estilo_musica);

                        for(Disco disco : discos) {
                            System.out.println("ID: " + disco.getId());
                            System.out.println("Titulo: " + disco.getTitulo());
                            System.out.println("Editora: " + disco.getEditora());
                            System.out.println("Grupo Musico: " + disco.getGrupoMusico());
                            System.out.println("Ano: " + disco.getAno());
                            System.out.println("Estilo Musica: " + disco.getEstiloMusica());
                        }
                        break;
                    case 9:
                        System.out.println("Insira o grupo musico para pesquisar os discos desse grupo musico: ");
                        grupo_musico = read.nextLine();
                       

                        discos = (ArrayList<Disco>) pesquisaDiscoGrupoMusico(grupo_musico);

                        for(Disco disco : discos) {
                            System.out.println("ID: " + disco.getId());
                            System.out.println("Titulo: " + disco.getTitulo());
                            System.out.println("Editora: " + disco.getEditora());
                            System.out.println("Grupo Musico: " + disco.getGrupoMusico());
                            System.out.println("Ano: " + disco.getAno());
                            System.out.println("Estilo Musica: " + disco.getEstiloMusica());
                        }
                        
                        break;
                    case 10:
                        System.out.println("Obrigado por usar nosso sistema de aluguel de discos, até a próxima!");
                        break;
                    default:
                        System.out.println("Opção inválida!!!");
                }
              
       
    }
    }

   


    private static Boolean inserirAssociado(int id, java.lang.String nome, java.lang.String morada, int telefone, java.lang.String email, java.lang.String dataNascimento) {
        server.TrabalhoWebServiceServer service = new server.TrabalhoWebServiceServer();
        server.WSDBGESTOR port = service.getWSDBGESTORPort();
        return port.inserirAssociado(id, nome, morada, telefone, email, dataNascimento);
    }

    private static Boolean removerAssociado(int id) {
        server.TrabalhoWebServiceServer service = new server.TrabalhoWebServiceServer();
        server.WSDBGESTOR port = service.getWSDBGESTORPort();
        return port.removerAssociado(id);
    }

    private static Boolean inserirDisco(int id, java.lang.String titulo, java.lang.String editora, java.lang.String grupoMusico, int ano, java.lang.String estiloMusica) {
        server.TrabalhoWebServiceServer service = new server.TrabalhoWebServiceServer();
        server.WSDBGESTOR port = service.getWSDBGESTORPort();
        return port.inserirDisco(id, titulo, editora, grupoMusico, ano, estiloMusica);
    }

    private static Boolean removerDisco(int id) {
        server.TrabalhoWebServiceServer service = new server.TrabalhoWebServiceServer();
        server.WSDBGESTOR port = service.getWSDBGESTORPort();
        return port.removerDisco(id);
    }

    private static java.util.List<server.Disco> pesquisaDiscoEstiloMusica(java.lang.String estiloMusica) {
        server.TrabalhoWebServiceServer service = new server.TrabalhoWebServiceServer();
        server.WSDBGESTOR port = service.getWSDBGESTORPort();
        return port.pesquisaDiscoEstiloMusica(estiloMusica);
    }

    private static java.util.List<server.Disco> pesquisaDiscoGrupoMusico(java.lang.String grupoMusico) {
        server.TrabalhoWebServiceServer service = new server.TrabalhoWebServiceServer();
        server.WSDBGESTOR port = service.getWSDBGESTORPort();
        return port.pesquisaDiscoGrupoMusico(grupoMusico);
    }

    private static java.util.List<server.Disco> pesquisaDiscoTitulo(java.lang.String titulo) {
        server.TrabalhoWebServiceServer service = new server.TrabalhoWebServiceServer();
        server.WSDBGESTOR port = service.getWSDBGESTORPort();
        return port.pesquisaDiscoTitulo(titulo);
    }

    private static Boolean alugaDisco(int idAssociado, int idDisco, java.lang.String dataAluguer, java.lang.String dataMaxDevolucao) {
        cliente_trabalhows.WebServiceTrabalho service = new cliente_trabalhows.WebServiceTrabalho();
        cliente_trabalhows.WSDBGestor port = service.getWSDBGestorPort();
        return port.alugaDisco(idAssociado, idDisco, dataAluguer, dataMaxDevolucao);
    }

    private static Boolean devolveDisco(int idAssociado, int idDisco, java.lang.String dataAluguer, java.lang.String dataDevolucao, java.lang.String dataMaxDevolucao) {
        server.TrabalhoWebServiceServer service = new server.TrabalhoWebServiceServer();
        server.WSDBGESTOR port = service.getWSDBGESTORPort();
        return port.devolveDisco(idAssociado, idDisco, dataAluguer, dataDevolucao, dataMaxDevolucao);
    }
    
}