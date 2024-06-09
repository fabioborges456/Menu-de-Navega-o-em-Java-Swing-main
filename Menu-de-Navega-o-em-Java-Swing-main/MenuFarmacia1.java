package MenuDeNavegacaoJavaSwing;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MenuFarmacia1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuFarmacia1 window = new MenuFarmacia1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuFarmacia1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JFrame frameClientes = new JFrame("Cadastro de Clientes");
        frameClientes.setSize(427, 258);
        frameClientes.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fecha apenas a janela de cadastro de clientes
        
        JPanel panelClientes = new JPanel(new GridLayout(5, 2, 10, 10)); // Exemplo de layout, pode ser ajustado conforme necessário
        panelClientes.setBackground(new Color(128, 64, 64));
        
        JLabel labelNome = new JLabel("  Nome:");
        labelNome.setFont(new Font("Tahoma", Font.BOLD, 12));
        JTextField textFieldNome = new JTextField();
  
        JLabel labelEmail = new JLabel("  Email:");
        labelEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
        JTextField textFieldEmail = new JTextField();
     
        JLabel labelTelefone = new JLabel("  Telefone:");
        labelTelefone.setHorizontalAlignment(SwingConstants.LEFT);
        labelTelefone.setFont(new Font("Tahoma", Font.BOLD, 12));
        JTextField textFieldTelefone = new JTextField();
        
        JButton buttonSalvar = new JButton("Salvar");
        buttonSalvar.setFont(new Font("Tahoma", Font.BOLD, 13));
        buttonSalvar.addActionListener(new ActionListener() {
        
        public void actionPerformed(ActionEvent e) {

                // Aqui você pode adicionar a lógica para salvar os dados do cliente

                JOptionPane.showMessageDialog(frameClientes, "Cliente salvo com sucesso!");
                frameClientes.dispose(); // Fecha a janela de cadastro de clientes após salvar
            }
        });
        
        panelClientes.add(labelNome);
        panelClientes.add(textFieldNome);
        panelClientes.add(labelEmail);
        panelClientes.add(textFieldEmail);
        panelClientes.add(labelTelefone);
        panelClientes.add(textFieldTelefone);
        panelClientes.add(buttonSalvar);

        frameClientes.getContentPane().add(panelClientes);
        frameClientes.setVisible(true);
	}
}
