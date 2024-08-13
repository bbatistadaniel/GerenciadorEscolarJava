package net.senai;

public class Aluno implements GetterAndSetter{
    private String nome;
    private String dataDeNascimento;
    private String email;
    private String endereco;
    private double[] notas;
    private double media;
    private Sala salaPertencente;
    public Aluno(String nome, String dataDeNascimento, String email, String endereco, Sala salaPertencente){
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.email = email;
        this.endereco = endereco;
        this.notas = new double[]{0, 0, 0, 0};
        this.media = 0;
        this.salaPertencente = salaPertencente;
    }
    public void atribuirSala(Sala salaNova){
        if (salaNova != this.salaPertencente){
            this.salaPertencente = salaNova;
            System.out.printf("Aluno %s foi transferido da sala %s para a sala %s com sucesso.\n", this.nome, salaPertencente, salaNova);
        }else{
            System.out.printf("Aluno %s já faz parte da sala %s.\n", this.nome, this.salaPertencente);
        }
    }
    public static String detalhes(Aluno aluno){
       return String.format("%s\n    Data de Nascimento: %s\n    E-mail: %s\n    Endereço: %s\n    Notas:\n        1°Bimestre: %.1f\n        2°Bimestre: %.1f\n        3°Bimestre: %.1f\n        4°Bimestre: %.1f\n    Média: %.1f\n    Sala Pertencente: %s\n\n",
               aluno.nome, aluno.dataDeNascimento, aluno.email, aluno.endereco, aluno.notas[0], aluno.notas[1], aluno.notas[2], aluno.notas[3], aluno.getMedia(), aluno.salaPertencente.getNome());
    }
    @Override
    public String getNome() {
        return this.nome;
    }
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    public double getMedia() {
        for (int i = 0; i < this.notas.length; i++){
            media += this.notas[i];
        }
        return media /= this.notas.length;
    }
    public void setMedia() {
        this.media = getMedia();
    }
}
