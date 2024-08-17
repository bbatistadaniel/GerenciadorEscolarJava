package net.senai;

import java.util.ArrayList;

public class Sala implements GetterAndSetter{

    private String nome;
    private String materia;
    private String periodo;
    private String professor;
    private ArrayList<Aluno> alunos;

    public Sala(String nome, String materia, String periodo, String professor, ArrayList<Aluno> alunos){
        this.nome = nome;
        this.materia = materia;
        this.periodo = periodo;
        this.professor = professor;
        this.alunos = alunos;
    }

    public void listarAlunos(){
        for (int i = 0; i < alunos.size(); i++){
            System.out.println(alunos.get(i).getNome());
        }
    }

    @Override
    public String toString(){
        return String.format("Nome: %s\nMatéria: %s\nPeríodo: %s\nProfessor: %s\n", this.nome, this.materia, this.periodo, this.professor);
    }


    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getMateria() {
        return materia;
    }

    public String getPeriodo() {
        return periodo;
    }

    public String getProfessor() {
        return professor;
    }

}
