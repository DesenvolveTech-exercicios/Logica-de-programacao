package semana_1.dia_1.exercicio_2;

import semana_1.dia_1.exercicio_2.ExecucaoMetodos.*;

public class Metodos {
    public static void main(String[] args) {
        //Método que retorna quantas ocorrências de um elemento estão na lista
        int[] test = {2,21,3,4,2,6,5,2,8};
        System.out.println(Ocorrencias.nOcorrencias(test, 2));

        //Método que retorna true se l tem elementos repetidos
        System.out.println(Repitidos.hasRepeat(test));

        //Método que retorna o número de elementos repetidos em l
        System.out.println(Repitidos.nroRepeat(test));

        //Método que retorna uma lista de elementos repetidos de l
        int[] test_2 = {3,4,3,1,5,4,7,9,8,6,5,10,11,23,11,10};
        Repitidos.listRepeat(test_2);

        //Método que retorna a união de l1 e l2
        Repitidos.union(test, test_2);

        //Método que retorna a intersecção de l1 e l2
        Repitidos.intersect(test, test_2);

        // Método que retorna a diferença entre l1 e l2
        Repitidos.difference(test, test_2);
    } 
}
