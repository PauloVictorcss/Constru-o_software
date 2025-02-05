package funcionarios;

public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void informacaoFuncionario(){
        System.out.println("Noma: " + nome + "\nSalario: " + salario);
    }

    public void aumentarSalario(double valor){
        this.salario = salario + valor;
    }



}


package funcionarios;

public class Gerente extends Funcionario{

    private String departamento;

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void informacaoFuncionario() {
        System.out.println("Nome: " + getNome() + "\nsalario: " + getSalario() + "departamento: " + departamento);
    }
}

package funcionarios;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Jhon", 500);

        gerente.aumentarSalario(500);

        gerente.informacaoFuncionario();
    }
}
