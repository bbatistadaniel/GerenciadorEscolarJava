package net.senai;

public class Escola {
    private Sala[] salas;
    public Escola(Sala[] salas){
        this.salas = salas;
    }
    public static void listarSalas(Escola escola){
        for (int i = 0; i < escola.salas.length; i++){
            System.out.printf("Nome: %s\n    Professor: %s\n    Período: %s\n    Matéria: %s\n\n", escola.salas[i].getNome(), escola.salas[i].getProfessor(), escola.salas[i].getPeriodo(), escola.salas[i].getMateria());
        }
    }
}
