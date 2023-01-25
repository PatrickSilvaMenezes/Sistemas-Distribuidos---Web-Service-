/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;

/**
 *
 * @author patri
 */
public class Disco {
    
    private int id;
    private int ano;
    private String titulo;
    private String editora;
    private String grupo_musico;
    private String estilo_musica;
   
    public Disco(){
    }
    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setGrupoMusico(String grupo_musico) {
        this.grupo_musico = grupo_musico;
    }

    public void setEstiloMusica(String estilo_musica) {
        this.estilo_musica = estilo_musica;
    }

    // getters

    public int getId() {
        return id;
    }

    public int getAno() {
        return ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditora() {
        return editora;
    }

    public String getGrupoMusico() {
        return grupo_musico;
    }

    public String getEstiloMusica() {
        return estilo_musica;
    }
    
    
}
