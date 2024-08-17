package net.senai;

public class Dispositivo {

    private Aluno ultimoResponsavel;
    private String dataDoUltimoEmprestimo;
    private int id;
    private boolean emprestado;

    public Dispositivo(int id) {
        this.id = id;
        this.emprestado = false;
    }

    public void emprestar(Aluno responsavel, String dataDoEmprestimo){
        if (!this.emprestado){
            this.emprestado = true;
            this.ultimoResponsavel = responsavel;
            this.dataDoUltimoEmprestimo = dataDoEmprestimo;
            System.out.printf("Dispositivo %d foi emprestado para o aluno %s em %s\n", this.id, responsavel.getNome(), dataDoEmprestimo);
        }else{
            System.out.printf("Dispositivo %d já emprestado para o aluno %s\n", this.id, this.ultimoResponsavel);
        }
    }

    public void devolver(){
       if (this.emprestado){
           this.emprestado = false;
           System.out.printf("Dispositivo %d foi devolvido\n", this.id);
       }else{
           System.out.printf("Dispositivo não está em posse de nenhum aluno\n");
       }
    }

}
