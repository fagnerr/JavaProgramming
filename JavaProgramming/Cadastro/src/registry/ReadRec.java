package registry;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ReadRec {
    public static void reader(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = "";
        int counter = 0;
        System.out.println("\nCADASTRO GERAL DE USUÁRIOS");
        while(true) {
            if(line != null) {
                System.out.println(line);
                counter ++;
            } else {
                break;
            }
            line = br.readLine();
        }
        System.out.println("\nTotal de usuários: " + (counter - 1) + " usuários cadastrados.");
        RegistryDB.setNextId(counter);
        br.close();
    }

    public static void writer(ArrayList<RegistryDB> register, String path) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
        String line = ShowReg.print(register);
        bw.write(line);
        bw.close();
    }
}