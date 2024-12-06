package main;

import java.awt.EventQueue;

import main.view.PainelApresentacao;

public class AppCadastroPessoa {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					PainelApresentacao dialog = new PainelApresentacao();
					dialog.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
