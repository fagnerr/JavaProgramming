package main.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class PainelApresentacao extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton btnEntrar = new JButton("Entrar");
	private JButton btnSair = new JButton("Sair");
	public ActionListener evento = new Eventos();
	private String action = "";

	/**
	 * Create the dialog.
	 */
	public PainelApresentacao() {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setType(Type.POPUP);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblNewLabel = new JLabel("Olá, Bem vindo ao Programa");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(72, 61, 139));
		lblNewLabel.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 25));
		lblNewLabel.setBounds(10, 11, 414, 52);
		contentPanel.add(lblNewLabel);
		{
			JLabel lblCadastroDePessoas = new JLabel("::  Cadastro de Pessoas  ::");
			lblCadastroDePessoas.setHorizontalAlignment(SwingConstants.CENTER);
			lblCadastroDePessoas.setForeground(new Color(72, 61, 139));
			lblCadastroDePessoas.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 25));
			lblCadastroDePessoas.setBounds(10, 64, 414, 52);
			contentPanel.add(lblCadastroDePessoas);
		}
		{
			JLabel lblSenaiCurso = new JLabel("SENAI - Curso Java Programming");
			lblSenaiCurso.setHorizontalAlignment(SwingConstants.CENTER);
			lblSenaiCurso.setForeground(new Color(72, 61, 139));
			lblSenaiCurso.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 20));
			lblSenaiCurso.setBounds(10, 165, 414, 52);
			contentPanel.add(lblSenaiCurso);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(255, 255, 255));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnEntrar.setForeground(new Color(255, 255, 255));
				btnEntrar.setBackground(new Color(72, 61, 139));
				buttonPane.add(getBtnEntrar());
				getRootPane().setDefaultButton(btnEntrar);

			}
			{
				btnSair.setForeground(new Color(255, 255, 255));
				btnSair.setBackground(new Color(72, 61, 139));


				buttonPane.add(getBtnSair());
			}
		}
	}
	public JButton getBtnEntrar() {
		btnEntrar.setActionCommand("Entrar");
		btnEntrar.addActionListener(evento);
		return btnEntrar;
	}
	public JButton getBtnSair() {
		btnSair.setActionCommand("Sair");
		btnSair.addActionListener(evento);
		return btnSair;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	private class Eventos implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {

			action = e.getActionCommand();

			switch(action) {
			case "Entrar":
				setVisible(false);
				JFrameApp frame = new JFrameApp();
				frame.setVisible(true);
				System.out.println("Acão do botão Entrar");
				break;

			case "Sair":
				System.out.println("Acão do botão Sair");
				System.exit(0);
				break;
			}
		}
	}
}
