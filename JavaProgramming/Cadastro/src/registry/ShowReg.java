package registry;

import java.util.ArrayList;
import java.util.ListIterator;

public class ShowReg {
    private static ListIterator<RegistryDB> lItr;

    public static void show(ArrayList<RegistryDB> register) {
        lItr = register.listIterator();
        System.out.println("\nCADASTRO DE USUÁRIOS");
        while(lItr.hasNext()) {
            System.out.println(lItr.next());
        }
        System.out.println("Total de usuários: " + register.size() + " novos usuários cadastrados.");
    }

    public static String print(ArrayList<RegistryDB> register) {
        String aux = "";
        lItr = register.listIterator();
        while(lItr.hasNext()) {
            aux += lItr.next().toString() + "\n";
        }
        return aux;
    }
}