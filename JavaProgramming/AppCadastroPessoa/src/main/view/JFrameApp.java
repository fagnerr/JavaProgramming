package main.view;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class JFrameApp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;



	/**
	 * Create the frame.
	 */
	public JFrameApp() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		setBounds(100, 100, 748, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		setLocationRelativeTo(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		menuBar.setBounds(0, 0, 732, 22);
		contentPane.add(menuBar);

		JMenu mnNewMenu = new JMenu("Início");
		mnNewMenu.setMnemonic('I');
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Abrir arquivo");
		mnNewMenu.add(mntmNewMenuItem_1);

		JMenuItem menuItemSair = new JMenuItem("Sair");
		mnNewMenu.add(menuItemSair);
		menuItemSair.addActionListener(null);

		JMenu mnNewMenu_1 = new JMenu("Pessoas");
		mnNewMenu_1.setMnemonic('P');
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Cadastrar");
		mnNewMenu_1.add(mntmNewMenuItem_2);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Alterar");
		mnNewMenu_1.add(mntmNewMenuItem_3);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Consultar");
		mnNewMenu_1.add(mntmNewMenuItem_4);

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Excluir");
		mnNewMenu_1.add(mntmNewMenuItem_5);

		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Listar");
		mnNewMenu_1.add(mntmNewMenuItem_6);

		JMenu mnNewMenu_2 = new JMenu("Sobre");
		mnNewMenu_2.setMnemonic('S');
		menuBar.add(mnNewMenu_2);
	}
}
