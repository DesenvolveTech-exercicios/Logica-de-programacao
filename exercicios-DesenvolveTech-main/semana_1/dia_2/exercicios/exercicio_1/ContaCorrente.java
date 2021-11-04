package semana_1.dia_2.exercicios.exercicio_1;

public class ContaCorrente{
    private double saldo;
    private int nroConta;

    public ContaCorrente(int nroConta){
        this.nroConta = nroConta;
    }

    public void deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public double retirada(double valor){
        if (saldo - valor > 0) {
            saldo -= valor;
            return saldo;
        } else {
            System.out.println("não foi possivel retirar!");
            return 0.0;
        }
    }

    public double getSaldo(){
        return saldo;
    }

    public int getNroConta(){
        return nroConta;
    }
}