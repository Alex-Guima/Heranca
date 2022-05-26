public class Aluno extends Pessoa{
    private String curso, matricula;

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }

    public String getMatricula(){
        return this.matricula;
    }
    public String getCurso(){
        return this.curso;
    }

    public void infAluno(){
        System.out.printf("Nome: %s%nIdade: %d%nMatricula: %s%nCurso: %s%n",getNome(),getIdade(),getMatricula(), getCurso());
        System.out.println("----------------------------------------------");
    }
}
