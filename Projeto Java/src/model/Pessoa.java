package model;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private int cpf;

    public Pessoa(String nome) {
    }

    public Pessoa(int idade) {
    }



    public abstract void quem_sou_eu();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade + '\'' +
                ", cpf=" + cpf +
                '}';
    }
}