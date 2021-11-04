package semana_1.dia_1.exercicio_2.ExecucaoMetodos;

public class Repitidos{
    public static boolean hasRepeat(int[] l){
        boolean state = false;
        for (int i = 0; i < l.length; i++) {
            for (int j = 0; j < i; j++) {
                if(l[i] == l[j]){
                    state = true;
                }            
            }
        }
        return state;
    }

    public static int nroRepeat(int[] l){
        int num = 0;
        for (int i = 0; i < l.length; i++) {
            for (int j = 0; j < i; j++) {
                if(l[i] == l[j]){
                    num = l[i];
                }            
            }
        }
        return num;
    }

    public static int[] listRepeat(int[] l){
        int[] num = new int[l.length];
        int cout = 0;
        for (int i = 0; i < l.length; i++) {
            for (int j = 0; j < i; j++) {
                if(l[i] == l[j]){
                    num[cout] = l[i];
                    System.out.print(num[cout] + " ");
                    cout++;
                }            
            }
        }
        
        return num;
    }

    public static int[] union(int[] l1, int[] l2){
        int[] num = new int[(l1.length + l2.length)];
        int cout = 0;
        for (int i = 0; i < l1.length; i++) {
            num[cout] = l1[i];
            System.out.print(num[cout] + " ");
            cout++;
        }
        for (int i = 0; i < l2.length; i++) {
            num[cout] = l2[i];
            System.out.print(num[cout] + " ");
            cout++;
        }
        System.out.print("\n");
        return num;
    }

    public static int[] intersect(int[] l1, int[] l2){
        int[] num = new int[100];
        for(int i =0; i < l1.length ; i++){
            for(int x = 0 ; x < l2.length ;x++){
                if(l1[i] == l2[x]){
                    num[i] = l1[i];
                    System.out.print(num[i] + " ");
                }
            }   
        }
        return num;
    }

    public static int[] difference(int[] l1, int[] l2){
        int[] num = new int[l1.length + l2.length];
        return num;
    }

}