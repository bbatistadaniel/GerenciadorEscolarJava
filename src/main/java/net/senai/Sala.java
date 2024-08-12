package net.senai;

public class Sala {

    private int nome;
    private String materia;
    private String periodo;
    private String professor;

    public Sala(int numero, String materia, String periodo, String professor){

        this.nome = numero;
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

    public int getNome() {
        return nome;
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
