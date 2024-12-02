package crud;

import java.sql.Date;
import java.util.Scanner;

public class FilmView {
	/*private FilmController filmController;
	
	public FilmView(FilmController filmController) {
		this.filmController = filmController;
	}*/
	
	public void displayMenu() {
		MySQLConnection db = new MySQLConnection();
		
		try {
			if(!db.getConnection()) {
				System.out.println("Erro ao conectar com o banco de dados!");
				return;
			}
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		FilmDAO filmDAO = new FilmDAO(db);
		
		FilmController filmController = new FilmController(filmDAO);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\nMenu:");
			System.out.println("0 - Sair do Programa");
			System.out.println("1 - Cadastrar Filme");
			System.out.println("2 - Listar Filmes");
			System.out.println("3 - Atualizar Cadastro");
			System.out.println("4 - Deletar Filme");

			System.out.println("Digite sua opção: ");
			int option = sc.nextInt();
			sc.nextLine();
			
			switch(option) {
				case 0 -> {
					System.out.println("Programa finalizado!");
					sc.close();
					db.closeConnection();
					System.exit(0);
				}
				case 1 -> {
					System.out.println("Digite o código do filme: ");
					String codigo = sc.nextLine();
					
					System.out.println("Digite o título do filme: ");
					String titulo = sc.nextLine();
					
					System.out.println("Digite o gênero do filme: ");
					String genero = sc.nextLine();
					
					System.out.println("Digite a produtora do filme: ");
					String produtora = sc.nextLine();
					
					System.out.println("Digite a data da compra do filme:");
					Date dataCompra = Date.valueOf(sc.nextLine());
					
					FilmModel filme = new FilmModel(codigo, titulo, genero, produtora, dataCompra);
					
					filmController.createFilm(filme);
				}
				case 2 -> {
					filmController.readFilm();
				}
				case 3 -> {
					System.out.println("Digite o código do filme: ");
					String codigo = sc.nextLine();
					
					System.out.println("Digite o título do filme: ");
					String titulo = sc.nextLine();
					
					System.out.println("Digite o gênero do filme: ");
					String genero = sc.nextLine();
					
					System.out.println("Digite a produtora do filme: ");
					String produtora = sc.nextLine();
					
					System.out.println("Digite a data da compra do filme:");
					Date dataCompra = Date.valueOf(sc.nextLine());
					
					FilmModel filme = new FilmModel(codigo, titulo, genero, produtora, dataCompra);
					
					filmController.updateFilm(filme);
				}
				case 4 -> {
					System.out.println("Digite o código do filme que deseja deletar: ");
					String codigo = sc.nextLine();
					
					filmController.deleteFilm(codigo);
				}
				default -> System.out.println("Opção inválida. Tente novamente!");
			}
		}
	}
}