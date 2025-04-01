public class Funcionario extends Pessoa{
  private Double salario;
  private Cargo cargo;

  public Funcionario (String nome, Double salario, Cargo cargo) {
    super(nome);
    this.salario = salario;
    this.cargo = cargo;
  }

  public boolean mudarSalario(double salario){
    if(salario < this.salario){
      System.out.println("Não pode diminuir o salario.");
      return false;
    } else {
        String nome = this.getNome();
 
        System.out.println("Salario de " + nome + " alterado para R$:" + salario);
        return true;
    }
  }
}
