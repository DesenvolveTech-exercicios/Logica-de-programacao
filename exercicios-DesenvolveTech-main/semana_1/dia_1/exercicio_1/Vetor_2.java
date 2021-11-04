package semana_1.dia_1.exercicio_1;

public class Vetor_2 {
    public static void main(String[] args) {
        int[] num = {2,5,7,1};
        num = inverterVetor(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public static int[] inverterVetor(int num[]) {
        int temp;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < i; j++) {
                temp = num[i];
                num[i] = num[j];
                num[j] = temp;
            }
        }
        return num;
    }
}
