public class Main {
    public static void main(String[] args){
        //Pessoa alex = new Pessoa();
        Aluno alex = new Aluno();
        Professor fatudo = new Professor();

        alex.setNome("Alex");
        alex.setIdade(20);
        alex.setMatricula("202102167442");
        alex.setCurso("Ciencia da Computacao");

        fatudo.setNome("Marcelo Fatudo");
        fatudo.setIdade(0);
        fatudo.setSalario(4200.50);
        fatudo.setEspecializacao("Java");

        alex.infAluno();
        fatudo.infProfessor();
    }
}
