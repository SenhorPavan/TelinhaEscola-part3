package escolaS;

public class Funcionario extends Pessoa {

    public Funcionario(String codigo, double salario, String nome, String cpf, String endereco) {
        super(nome, cpf, endereco);
        this.codigo = codigo;
        this.salario = salario;
    }

    public String codigo;
    public double salario;

}
