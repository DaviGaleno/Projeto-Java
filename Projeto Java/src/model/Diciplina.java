package model;

public class Diciplina {

    private String nome;
    private Professor p;
    private Aluno c;

    public Diciplina(String nome){
        this.nome = nome;
    }

    public Professor getP() {
        return p;
    }

    public void setP(Professor p) {
        this.p = p;
    }

    public Aluno getC() {
        return c;
    }

    public void setC(Aluno c) {
        this.c = c;
    }

    public void associar(Professor p){
        this.p = p;
    }
    public void mostrarDiciplina(){
        System.out.println(p.getNome() + "ministrar"+ nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}