package main.java.one.digitalinnovation.santander;

import java.util.List;

public class QueryExecution {
    
    public static void main(String[] args) {
        AlunoDAO alunoDAO = new AlunoDAO();

        List<Aluno> alunos = alunoDAO.list();

        alunos.stream().forEach(System.out::println);
    }
}
