package registry;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class OptionsMenu {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<RegistryDB> register = new ArrayList<>();
    private static String answer;

    public static void choseOption() throws IOException {
        do {
            System.out.println();
            System.out.println("Que operação deseja realizar?");
            System.out.println();
            System.out.println("[ CADASTRAR ] uma nova pessoa");
            System.out.println("[  LISTAR   ] as pessoas cadastradas");
            System.out.println("[ PESQUISAR ] uma pessoa no cadastro");
            System.out.println("[  ALTERAR  ] um item do cadastro");
            System.out.println("[  EXCLUIR  ] um item do cadastro");
            System.out.println("[  GRAVAR   ] as alterações");
            System.out.println("[   SAIR    ] do pragrama");

            answer = sc.next().toUpperCase();

            switch(answer) {
                case "CADASTRAR" -> register.add(RegPerson.toRegister());
                case "LISTAR" -> ShowReg.show(register);
                case "GRAVAR" -> ReadRec.writer(register,"src/file.txt");
            }
        } while(!answer.equals("SAIR"));
        System.out.println("Programa finalizado! Obrigado, volte sempre.");
    }
}