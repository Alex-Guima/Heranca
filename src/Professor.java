public class Professor extends Pessoa{
    private double salario;
    private String especializacao;

    public void setSalario(double salario){
        this.salario = salario;
    }
    public void setEspecializacao(String especializacao){
        this.especializacao = especializacao;
    }

    public double getSalario(){
        return this.salario;
    }
    public String getEspecializacao(){
        return this.especializacao;
    }

    public void infProfessor(){
        System.out.printf("Nome: %s%nIdade: %d%nSalario: R$%.2f%nEspecializacao: %s%n",getNome(),getIdade(),getSalario(), getEspecializacao());
        System.out.println("---------------------------------------------------------");
    }
}
