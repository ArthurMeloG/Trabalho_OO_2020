package servicos;

//import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import cadastro.CadastroAluno;
import servicos.Icons;

public class Menu {
	public static int printMenu() {

//		ImageIcon icons = new ImageIcon("icons/unb.png");
		
		String STRopc = null;
		STRopc = (String) JOptionPane.showInputDialog(null, "Digite 1 para cadastrar um aluno \n"
				+"Digite 2 para printar os Alunos salvos \n"
				+"Digite 3 para ... \n"
				+"Digite 4 para ... \n"
				+"Digite 5 para ... \n"
				+"Digite 6 para ... \n"
				+"Digite 7 para ... \n"
				+"Digite 9 para sair do programa", "menu" , 0, Icons.icones(1) , null, "");
		

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

					STRtemp = JOptionPane.showInputDialog("Deseja cadastrar outro usuario?\n 1 = sim \n 2 = não");
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
