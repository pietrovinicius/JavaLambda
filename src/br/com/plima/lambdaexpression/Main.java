package br.com.plima.lambdaexpression;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        FolhaDePagamento folhaDePagamento = new FolhaDePagamento();

        List<Funcionario> funcionarios = folhaDePagamento.getFuncionarios(
                f -> f.getSalario() >= 0F);

        funcionarios.forEach(f -> System.out.println(f.getNome()+" R$ "+f.getSalario()));
    }
}
