package br.com.plima.lambdaexpression;

public class Funcionario {

    private String nome;
    private float salario;

    public Funcionario(float salario, String nome) {
        this.salario = salario;
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
