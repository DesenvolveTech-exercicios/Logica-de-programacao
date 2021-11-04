package semana_1.dia_2.exercicios.exercicio_2.services;

import semana_1.dia_2.exercicios.exercicio_2.models.Cliente;
import java.util.Scanner;

public class Menu {
    public Cliente registerClient(){
        String name;
        String cpf;
        String age;
        String gender;
        Scanner scan = new Scanner(System.in);
        System.out.println("\nDados do Cliente");
        System.out.print("Digite o nome: ");
        name = scan.nextLine();
        System.out.print("\nDigite o CPF: ");
        cpf = scan.nextLine();
        System.out.print("\nDigite a idade: ");
        age = scan.nextLine();
        System.out.print("\nDigite o genero(primeira letra em Maiusculo): ");
        gender = scan.nextLine();
        scan.close();
        return new Cliente(name, cpf, Integer.parseInt(age), gender);
    }
}
