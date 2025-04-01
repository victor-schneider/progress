public class Hospede extends Pessoa {
  private String endereco;
  private String documento;

  public Hospede (String nome, String endereco, String documento) {
    super(nome);
    this.endereco = endereco;
    this.documento = documento;
  }

  @Override
  public String toString(){
    String nome = this.getNome();
    return nome;
  }
}
