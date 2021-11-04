package semana_1.dia_2.exercicios.exercicio_1.test;
import semana_1.dia_2.exercicios.exercicio_1.ContaCorrente;

public class testaContaCorrente {
    ContaCorrente contaCorrente = new ContaCorrente(981283);
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(981283);
        int conta = shouldReturnAccountNumber(contaCorrente);
        try {
            System.out.println("numero da conta: " + conta);
        } catch (Exception e) {
            System.err.println("não consegue encontrar a conta");
        }
    }

    public static int shouldReturnAccountNumber(ContaCorrente contaCorrente) {
        return contaCorrente.getNroConta();
    }
}
