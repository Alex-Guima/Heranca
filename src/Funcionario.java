public class Funcionario extends Pessoa{
    private String setor, funcao;

    public void setSetor(String setor){
        this.setor = setor;
    }
    public void setFuncao(String funcao){
        this.funcao = funcao;
    }

    public String getSetor(){
        return this.setor;
    }
    public String getFuncao(){
        return this.funcao;
    }

    public void infFuncionario(){
        System.out.printf("Nome: %s%nIdade: %d%nSetor: %s%nFuncao: %s%n",getNome(),getIdade(),getSetor(), getFuncao());
        System.out.println("----------------------------------------------");
    }
}
