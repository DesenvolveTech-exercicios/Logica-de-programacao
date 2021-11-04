package semana_1.dia_2.exercicios.exercicio_2;

import java.util.ArrayList;
import java.util.Scanner;

import semana_1.dia_2.exercicios.exercicio_2.models.Cliente;
import semana_1.dia_2.exercicios.exercicio_2.services.Consulta;
import semana_1.dia_2.exercicios.exercicio_2.services.Menu;

public class initial {
    public static void main(String args[]){
        Consulta consulta = new Consulta();
        Menu menu = new Menu();
        ArrayList<Cliente> listClient = new ArrayList<Cliente>();
        Scanner scanner = new Scanner(System.in);
        boolean i = true;
        String CPF;
        int op = 0;
        while (i == true) {
            System.out.println(
                "Digite 1 para cadastrar clientes\n 2 Listar clientes\n3 Para buscar por CPF\n4 para o numero total\n 5 para deletar"
            );
            op = scanner.nextInt();
            switch(op){
                case 1:
                    listClient.add(menu.registerClient());
                    break;
                case 2:
                    consulta.listClients(listClient);
                    break;
                case 3:
                    System.out.print("\nDigite o CPF da busca: ");
                    CPF = scanner.nextLine();
                    System.out.println(consulta.searchByCPF(listClient, CPF));
                    break;
                case 4:
                    consulta.totalClients(listClient);
                    break;
                case 5:
                    System.out.print("\nDigite o CPF que deseja excluir: ");
                    CPF = scanner.nextLine();
                    consulta.deleteClient(listClient, CPF);
                    break;
                default:
                    System.out.println("valor incorreto.\nTente novamente");
            }   
        }
        scanner.close();
    }
}
