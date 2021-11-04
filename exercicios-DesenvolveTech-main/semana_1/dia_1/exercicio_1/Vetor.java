package semana_1.dia_1.exercicio_1;

public class Vetor{
    public static void main(String[] args) {
        int[] vetor = new int[20];
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = i*10;
            System.out.print(vetor[i] + " ");
        }
    }
}