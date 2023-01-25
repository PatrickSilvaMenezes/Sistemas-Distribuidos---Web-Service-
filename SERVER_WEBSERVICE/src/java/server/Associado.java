/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;

/**
 *
 * @author patri
 */
public class Associado {
    
   private int id;
   private int telefone;
   private String nome;
   private String email;
   private String data_nascimento;

   // Constructor
   public Associado() {
    }
   
    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataNascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    
    // getters

    public int getId() {
        return id;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getDataNascimento() {
        return data_nascimento;
    }
    
    
}
