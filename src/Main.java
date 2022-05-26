public class Main {
    public static void main(String[] args){
        //Pessoa alex = new Pessoa();
        Aluno alex = new Aluno();
        Professor fatudo = new Professor();
        Funcionario func1 = new Funcionario();

        alex.setNome("Alex");
        alex.setIdade(20);
        alex.setMatricula("202102167442");
        alex.setCurso("Ciencia da Computacao");

        fatudo.setNome("Marcelo Fatudo");
        fatudo.setIdade(0);
        fatudo.setSalario(4200.50);
        fatudo.setEspecializacao("Java");

        func1.setNome("Funcionario 1");
        func1.setIdade(35);
        func1.setSetor("RH");
        func1.setFuncao("Gerente");

        alex.infAluno();
        fatudo.infProfessor();
        func1.infFuncionario();
    }
}
