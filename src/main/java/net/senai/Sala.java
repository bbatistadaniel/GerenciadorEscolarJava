package net.senai;

public class Sala implements GetterAndSetter{

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
