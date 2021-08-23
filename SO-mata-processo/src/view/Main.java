package view;

import controller.KillController;
import javax.swing.JOptionPane;

public class Main {

public static void main(String[] args) {
		
		KillController kill = new KillController();
		
		int option = 0;
		
		do {
			try {
				option = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção: \n 1 - Consultar Processos \n 2 - Matar processo por PID \n 3 - Matar processo por nome \n 0 - Sair"));
			} catch (Exception error) {
				JOptionPane.showMessageDialog(null, "Obrigado pela preferência");
				break;
			}
			
			switch (option) {
				case 1:
					kill.listaProcessos();
					break;
				case 2:
					String pid = JOptionPane.showInputDialog(null, "Insira o PID");
					kill.mataPid(pid);
					break;
				case 3:
					String name = JOptionPane.showInputDialog(null, "Insira o nome do processo");
					kill.mataNome(name);
					break;
				case 0: 
					JOptionPane.showMessageDialog(null, "Obrigado pela preferência");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida");
			} 
			
		} while (option != 0);
	}
}
