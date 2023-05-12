/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastroDeAlunos;
/**
 *
 * @author Eric
 */
public class Aluno extends Usuario {
    
    private String disciplina;

    public Aluno(String nome, String sobrenome, String cpf, String disciplina){
        super(nome, sobrenome, cpf);
        this.disciplina = disciplina;
    }
    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
    public String getDisciplina(){
        return disciplina;
    }
        
}
