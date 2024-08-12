package net.senai;

public class Sala {

    private int numero;
    private String materia;
    private String periodo;
    private String professor;

    public Sala(int numero, String materia, String periodo, String professor){

        this.numero = numero;
        this.materia = materia;
        this.periodo = periodo;
        this.professor = professor;

    }

    public void listarAlunos(){

    }

    @Override
    public String toString(){
        return String.format("Número: %s\nMatéria: %s\nPeríodo: %s\nProfessor: %s\n", String.valueOf(this.numero), this.materia, this.periodo, this.professor);
    }

    public int getNumero() {
        return numero;
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
