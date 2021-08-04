package main.java.one.digitalinnovation.santander;

import java.util.List;

public class QueryExecution {
    
    public static void main(String[] args) {
        
        AlunoDAO alunoDAO = new AlunoDAO();

        List<Aluno> alunos = alunoDAO.list();
        alunos.stream().forEach(System.out::println);

        /*Aluno alunoById = alunoDAO.getById(10);
        System.out.println(alunoById);*/

        /*Aluno alunoToCreate = new Aluno("cicrano", 18, "PR");
        alunoDAO.create(alunoToCreate);*/

        /*alunoDAO.delete(1);*/
        
        /*Aluno alunoToUpdate = alunoDAO.getById(2);
        alunoToUpdate.setNome("beltrano");
        alunoToUpdate.setIdade(69);
        alunoToUpdate.setEstado("RS");
        alunoDAO.update(alunoToUpdate);*/
    }
}
