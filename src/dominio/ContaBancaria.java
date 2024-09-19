package dominio;

public class ContaBancaria extends Pessoa {
    private int numeroConta = 0;
    private int senha = 0;

    public ContaBancaria(Pessoa pessoa) {
        super(pessoa.nome, pessoa.idade);
    }

    public void abrirConta(int numeroConta, int senha) {
        if (idade < 18) {
            return;
        }
        this.numeroConta = numeroConta;
        this.senha = senha;
    }

    public void imprime() {
        super.imprime();
        if (idade < 18) {
            System.out.println("Idade insuficiente para abrir conta bancária");
            return;
        }
        System.out.println("Número Conta Corrente: " + this.numeroConta);
        System.out.println("Senha Conta Corrente: " + this.senha);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
