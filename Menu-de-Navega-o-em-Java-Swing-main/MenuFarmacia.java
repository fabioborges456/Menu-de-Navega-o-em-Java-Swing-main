package MenuDeNavegacaoJavaSwing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class MenuFarmacia extends JFrame {
 

	private static final long serialVersionUID = 3974869392199691266L;

public MenuFarmacia() {

        setTitle("Sistema de Farmácia");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu cadastrosMenu = new JMenu("Cadastros");
        menuBar.add(cadastrosMenu);

        JMenuItem clientesItem = new JMenuItem("Clientes");
        cadastrosMenu.add(clientesItem);
        clientesItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exibirFormularioClientes();
            }
        });


        JMenuItem produtosItem = new JMenuItem("Produtos");
        cadastrosMenu.add(produtosItem);

        JMenuItem fornecedoresItem = new JMenuItem("Fornecedores");
        cadastrosMenu.add(fornecedoresItem);

        JMenuItem funcionariosItem = new JMenuItem("Funcionários");
        cadastrosMenu.add(funcionariosItem);

        // Outros itens e subitens do menu seguem a mesma lógica

        
        JMenuItem sairItem = new JMenuItem("Sair");
        sairItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

   

        menuBar.add(Box.createHorizontalGlue()); // Para alinhar o item "Sair" à direita
        menuBar.add(sairItem);
    }
    
    private void exibirFormularioClientes() {

    	JFrame frameClientes = new JFrame("Cadastro de Clientes");
        frameClientes.setSize(400, 300);
        frameClientes.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fecha apenas a janela de cadastro de clientes
        
        JPanel panelClientes = new JPanel(new GridLayout(5, 2, 10, 10)); // Exemplo de layout, pode ser ajustado conforme necessário
        
        JLabel labelNome = new JLabel("Nome:");
        JTextField textFieldNome = new JTextField();
  
        JLabel labelEmail = new JLabel("Email:");
        JTextField textFieldEmail = new JTextField();
     
        JLabel labelTelefone = new JLabel("Telefone:");
        JTextField textFieldTelefone = new JTextField();
        
        JButton buttonSalvar = new JButton("Salvar");
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

        frameClientes.add(panelClientes);
        frameClientes.setVisible(true);
    }

   public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MenuFarmacia().setVisible(true);
            }
        });
    }
}