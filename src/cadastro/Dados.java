/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro;

/**
 *
 * @author Diego
 */

public class Dados {
    
    private String NomeResponsavel;
    private String NomeCrianca;
    private String CPF;
    private String Telefone;
    private String Email;
    private String Endereco;
    private int Idade;
    private String Sexo;

    public String getNomeResponsavel() {
        return NomeResponsavel;
    }

    public void setNomeResponsavel(String NomeResponsavel) {
        this.NomeResponsavel = NomeResponsavel;
    }

    public String getNomeCrianca() {
        return NomeCrianca;
    }

    public void setNomeCrianca(String NomeCrianca) {
        this.NomeCrianca = NomeCrianca;
    }


    public Dados() {
    }

   

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
}

