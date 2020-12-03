package servicos;

import javax.swing.JOptionPane;
import cadastro.CadastroAluno;

public class Menu {
	public static int printMenu() {

		String STRopc = null;
		STRopc = JOptionPane.showInputDialog("Digite 1 para cadastrar um aluno \n"
											+"Digite 2 para printar os Alunos salvos \n"
											+"Digite 9 para sair do programa");
		int opc = Integer.parseInt(STRopc);

		return opc;
	}

	public static void menu() {
		CadastroAluno ca = new CadastroAluno();
		String STRtemp = null;

		int temp = 0;
		int menu = 0;
		do {
			int i = printMenu();
			switch (i) {
			
			case 1:
				do {
					JOptionPane.showMessageDialog(null, "Cadastrando Aluno");

					if (ca.cadastrarAluno() == true)
						JOptionPane.showMessageDialog(null, "Aluno cadastrado");
					else
						JOptionPane.showMessageDialog(null, "ERRO");

					STRtemp = JOptionPane.showInputDialog("Deseja cadastrar outro usuario? 1 = sim 2 = não");
					temp = Integer.parseInt(STRtemp);
					
				} while (temp != 2);

				break;
			case 2:
				ca.printLista();
				break;
				
			case 9:
				menu = 9;

			default:
				break;
			}
		} while (menu != 9);

		
	}

}
