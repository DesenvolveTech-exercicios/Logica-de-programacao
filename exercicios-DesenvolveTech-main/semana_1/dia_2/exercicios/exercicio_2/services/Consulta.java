package semana_1.dia_2.exercicios.exercicio_2.services;

import java.util.ArrayList;

import semana_1.dia_2.exercicios.exercicio_2.models.Cliente;

public class Consulta{
    public String searchByCPF(ArrayList<Cliente> clients, String cpf){
        for (Cliente cliente : clients) {
            if (cliente.getCpf() == cpf) {
                return cliente.getName();
            }
        }
        return "Client não encontrado";
    }

    public void listClients(ArrayList<Cliente> clients){
        System.out.println("Lista de Clientes no Bar");
        for (int i = 0; i < clients.size(); i++) {
            System.out.println("Nome: " + clients.get(i).getName());
        }
    }

    public void totalClients(ArrayList<Cliente> clients){
        System.out.println("Total de clientes no bar: " + clients.size());
        double femi = 0;
        double masc = 0;
        for (Cliente cliente : clients) {
            if (cliente.getGender() == "Feminino") {
                femi++;
            }
        }
        for (Cliente cliente : clients) {
            if (cliente.getGender() == "Masculino") {
                masc++;
            }
        }
        double porcentFemi = femi/clients.size()*100;
        double porcentMasc = masc/clients.size()*100;
        System.out.println(porcentFemi + "% são mulheres");
        System.out.println(porcentMasc + "% são homens");
    }

    public void deleteClient(ArrayList<Cliente> clients, String cpf){
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getCpf() == cpf) {
                System.out.print("O cliente "+ clients.get(i).getName()+" Sera deletado\n");
                clients.remove(i);
            }
        }
        listClients(clients);
    }
}