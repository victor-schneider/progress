package br.univali.aula04;

public class Tarefa {

    private String nome;
    private String descricao;
    private Usuario responsavel;
    private String dataCriacao;
    private String dataAtualizacao;
    private Status status;
    private Usuario observadores;

    public Tarefa(String nome, String descricao, Usuario responsavel, String dataCriacao, Status status) {
        this.nome = nome;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.dataCriacao = dataCriacao;
        this.dataAtualizacao = dataCriacao;
        this.status = status;
    }

    

    public boolean alterarStatus(Usuario usuario, Status status) {
        if (!usuario.equals(this.responsavel)) {
            System.out.println("Usuario nao permitido");
            return false;
        }
        this.status = status;
        System.out.println("Status alterado para " + this.status.toString());
        return true;
    }

    public boolean adicionarObservador(Usuario usuario, Usuario observador){
        if(!usuario.equals(this.responsavel)) {
            System.out.println("Usuario nao permitido");
            return false;
        }
        this.observadores = observador;
        System.out.println("Observador adicionado: " + this.observadores.toString());
        return true;
    }

    public void apresentarTarefa(Usuario usuario) {
        if(usuario.equals(this.responsavel) || usuario.equals(this.observadores)) {
            System.out.println("Usuario não permitido!");
            return;
        } else{
            System.out.println("Nome: " + this.nome + "\n" + "Responsável: " + this.responsavel + "\n" + "Status atual: " + this.status);
            return;
        }
    }

    public Status getStatus() {
        return status;
    }
}
