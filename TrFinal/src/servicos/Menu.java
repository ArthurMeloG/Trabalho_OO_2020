package servicos;

import javax.swing.JOptionPane;
import cadastro.CadastroAluno;

public class Menu {
	public static int printMenu() {
		
		String STRopc = null;
		STRopc = JOptionPane.showInputDialog("Digite 1 para cadastrar um aluno");
		int opc = Integer.parseInt(STRopc);
		
		return opc;
	}

	public static void menu(int i) {
		CadastroAluno ca = new CadastroAluno();
		String STRtemp = null;
		

		int temp = 0;
		do {
			switch (i) {
			case 1:
				JOptionPane.showMessageDialog(null, "Cadastrando Aluno");

				if (ca.cadastrarAluno() == true)
					JOptionPane.showMessageDialog(null, "Aluno cadastrado");
				else 
					JOptionPane.showMessageDialog(null, "ERRO");
				
				STRtemp = JOptionPane.showInputDialog("Deseja cadastrar outro usuario? 1 = sim 2 = não");
				temp = Integer.parseInt(STRtemp);
					break;
			

			default:
				break;
			}
		} while (temp  != 2);
		
		ca.printTest();
	}

}
