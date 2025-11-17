package model;

import model.interfaces.Folha;

public final class Aluno extends Pessoa implements Folha {

    private int matricula;
    private double nota1,nota2,nota3,media;

    public Aluno(String nome) {
        super(nome);
    }

    public void calcularMedia(){
        media=((nota1+nota2+nota3)/3);
    }


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public void quem_sou_eu() {

    }

    @Override
    public void calculaSalario() {

    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", media=" + media +
                '}';
    }
}

