package semana_1.dia_1.exercicio_2.ExecucaoMetodos;

public class Ocorrencias {
    
    public static int nOcorrencias(int[] l, Integer el){
        int count =0;
        for(int i = 0; i < l.length; i++){
            if(l[i] == el){
                count = count + 1;
            }
        }
        return count;
    }
}
