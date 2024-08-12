package net.senai;

public class Sala {

    private String nome;
    private String materia;
    private String periodo;
    private String professor;

    public Sala(String nome, String materia, String periodo, String professor){

        this.nome = nome;
        this.materia = materia;
        this.periodo = periodo;
        this.professor = professor;

    }

    public void listarAlunos(){

    }

    @Override
    public String toString(){
        return String.format("Nome: %s\nMatéria: %s\nPeríodo: %s\nProfessor: %s\n");
    }

}
