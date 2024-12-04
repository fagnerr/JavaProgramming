package registry;

import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class RegPerson {
    private static String firstName;
    private static String lastName;
    private static String gender;
    private static String dateOfBirth;
    private static RegistryDB reg;

    public static RegistryDB toRegister() {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("\nCadastrando novo usuário...");
			System.out.println("Digite o primeiro nome: ");
			firstName = sc.nextLine();
			System.out.println("Digite o sobrenome: ");
			lastName = sc.nextLine();
			System.out.println("Digite o gênero (Masculino / Feminino): ");
			gender = sc.nextLine();
			while(!gender.equalsIgnoreCase("Masculino") && !gender.equalsIgnoreCase("Feminino")) {
			    System.out.println("Formato inválido para cadastro do gênero! Por favor, escreva \"Masculino\" ou \"Feminino\".");
			    gender = sc.nextLine();
			}
			boolean validDate = false;
			while(!validDate) {
			    try {
			        System.out.println("Digite a data de nascimento no seguinte formato: DD/MM/YYYY ");
			        dateOfBirth = sc.nextLine();
			        reg = new RegistryDB(firstName, lastName, gender, dateOfBirth);
			        reg.toString();
			        
			    } catch(DateTimeParseException e) {
			        System.out.println("Formato inválido para cadastro da data.");
			        RegistryDB.setNextId(RegistryDB.getNextId() - 1);
			    }
			    validDate = true;
			}
		}
        System.out.println("Cadastro realizado com sucesso!");
        reg.toString();
        return reg;
    }
}