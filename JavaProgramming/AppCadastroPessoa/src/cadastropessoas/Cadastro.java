
package cadastropessoas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    private List<Pessoa> pessoas;
    private int proximoId;
    private final String arquivo = "C:\\Users\\LEONARDO\\Documents\\cadastro.txt"; // Caminho do arquivo

    public Cadastro() {
        pessoas = new ArrayList<>();
        carregarDados();
    }

    public void cadastrarPessoa(String nome, String sobrenome, String genero, String dataNascimento) {
        Pessoa novaPessoa = new Pessoa(proximoId++, nome, sobrenome, genero, dataNascimento);
        pessoas.add(novaPessoa);
    }

    public List<Pessoa> listar() {
        return pessoas;
    }

    public Pessoa pesquisar(int id) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getId() == id) {
                return pessoa;
            }
        }
        return null;
    }

    public void alterar(int id, String nome, String sobrenome, String genero, String dataNascimento) {
        Pessoa pessoa = pesquisar(id);
        if (pessoa != null) {
            pessoa.setNome(nome);
            pessoa.setSobrenome(sobrenome);
            pessoa.setGenero(genero);
            pessoa.setDataNascimento(dataNascimento);
            System.out.println("Cadastro alterado com sucesso!");
            gravarDados(); // Atualiza o arquivo após a alteração
        }
    }

    public void excluir(int id) {
        Pessoa pessoa = pesquisar(id);
        if (pessoa != null) {
            pessoas.remove(pessoa);
            System.out.println("Cadastro excluído com sucesso!");
            gravarDados(); // Atualiza o arquivo após a exclusão
        } else {
            System.out.println("Pessoa não encontrada.");
        }
    }

    public void gravarDados() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
            for (Pessoa pessoa : pessoas) {
                writer.write(pessoa.toString());
                writer.newLine();
            }
            // Apenas imprime a mensagem uma vez
            System.out.println("Dados gravados com sucesso em: " + arquivo);
        } catch (IOException e) {
            System.err.println("Erro ao gravar dados: " + e.getMessage());
        }
    }

    public void carregarDados() {
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(";");
                int id = Integer.parseInt(partes[0]);
                String nome = partes[1];
                String sobrenome = partes[2];
                String genero = partes[3];
                String dataNascimento = partes[4];
                cadastrarPessoa(nome, sobrenome, genero, dataNascimento);
                if (id >= proximoId) {
                    proximoId = id + 1;
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao carregar dados: " + e.getMessage());
        }
    }

    public String getCaminhoArquivo() {
        return arquivo;
    }
}
