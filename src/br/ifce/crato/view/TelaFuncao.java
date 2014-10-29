package br.ifce.crato.view;

import java.awt.Rectangle;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

import br.ifce.crato.actions.FuncaoAction;
import br.ifce.crato.beans.Funcao;

public class TelaFuncao extends JFrame {

	private TelaFuncao telaFuncao = null;
	private TelaFuncionarios telaFuncionario = null;
	private FuncaoAction funcaoAction = null;
	private Vector<Funcao> funcoes = null;  //  @jve:decl-index=0:
	private Funcao funcaoAntigo = null;
	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JList jListFuncoesFuncoes = null;
	private JScrollPane jScrollPane = null;
	private JLabel jlFuncaoFuncao = null;
	private JTextField jtfDescricaoFuncao = null;
	private JButton jbCadastrarFuncao = null;
	private JButton jbPesquisarFuncao = null;
	private JButton jbSalvarFuncao = null;
	private JButton jbApagarFuncao = null;
	private JButton jbEditaFuncao = null;

	/**
	 * This is the default constructor
	 */
	public TelaFuncao() {
		super();
		funcaoAction = new FuncaoAction();
		funcoes = funcaoAction.pesquisar();
		initialize();
	}
	public TelaFuncao(TelaFuncionarios t) {
		super();
		funcaoAction = new FuncaoAction();
		funcoes = funcaoAction.pesquisar();
		telaFuncao = this;
		telaFuncionario = t;
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (UnsupportedLookAndFeelException e) {
		    JOptionPane.showMessageDialog(this, "Verificar se a máquina virtual do Java é igual ou superior a versão 6.0.");
		} catch (ClassNotFoundException e) {
		    // handle exception
		} catch (InstantiationException e) {
		    // handle exception
		} catch (IllegalAccessException e) {
		    // handle exception
		}
		this.setTitle("Editar Função");
		this.setSize(365, 286);
		this.setContentPane(getJContentPane());		
		this.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				telaFuncao.setVisible(false);
				telaFuncionario.atualizarCombobox();
			}
		});
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jlFuncaoFuncao = new JLabel();
			jlFuncaoFuncao.setBounds(new Rectangle(15, 15, 76, 31));
			jlFuncaoFuncao.setText("Descrição:");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getJScrollPane(), null);
			jContentPane.add(jlFuncaoFuncao, null);
			jContentPane.add(getJtfDescricaoFuncao(), null);
			jContentPane.add(getJbCadastrarFuncao(), null);
			jContentPane.add(getJbPesquisarFuncao(), null);
			jContentPane.add(getJbSalvarFuncao(), null);
			jContentPane.add(getJbApagarFuncao(), null);
			jContentPane.add(getJbEditaFuncao(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jListFuncoesFuncoes	
	 * 	
	 * @return javax.swing.JList	
	 */
	private JList getJListFuncoesFuncoes() {
		if(jListFuncoesFuncoes== null)
			jListFuncoesFuncoes= new JList();
		try {
			funcoes = funcaoAction.pesquisar();
			jListFuncoesFuncoes.setListData(funcoes);
			jListFuncoesFuncoes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		} catch (java.lang.Throwable e) {
			// TODO: Something
		}
		return jListFuncoesFuncoes;

	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			try {
				jScrollPane = new JScrollPane();
				jScrollPane.setBounds(new Rectangle(15, 120, 226, 106));
				jScrollPane.setViewportView(getJListFuncoesFuncoes());
			} catch (java.lang.Throwable e) {
				// TODO: Something
			}
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jtfDescricaoFuncao	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJtfDescricaoFuncao() {
		if (jtfDescricaoFuncao == null) {
			try {
				jtfDescricaoFuncao = new JTextField();
				jtfDescricaoFuncao.setBounds(new Rectangle(105, 15, 226, 31));
			} catch (java.lang.Throwable e) {
				// TODO: Something
			}
		}
		return jtfDescricaoFuncao;
	}

	/**
	 * This method initializes jbCadastrarFuncao	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJbCadastrarFuncao() {
		if (jbCadastrarFuncao == null) {
			try {
				jbCadastrarFuncao = new JButton();
				jbCadastrarFuncao.setBounds(new Rectangle(15, 60, 91, 31));
				jbCadastrarFuncao.setText("Cadastrar");
				jbCadastrarFuncao.addMouseListener(new java.awt.event.MouseAdapter() {
					public void mouseClicked(java.awt.event.MouseEvent e) {
						try{
							Funcao f = new Funcao();
							f.setDescricao(jtfDescricaoFuncao.getText());
							if(funcaoAction.inserir(f))
								JOptionPane.showMessageDialog(null, "Função "+f.getDescricao() + " cadastrada com sucesso.");	
							atualizarTelas();
							limparCamposFuncao();
							telaFuncionario.atualizarCombobox();
							jbSalvarFuncao.setEnabled(false);
						}catch (Exception e1) {
							JOptionPane.showMessageDialog(null, "Erro ao inserir valores em Funçãoo." );
						}

					}
				});
			} catch (java.lang.Throwable e) {
				// TODO: Something
			}
		}
		return jbCadastrarFuncao;
	}

	/**
	 * This method initializes jbPesquisarFuncao	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJbPesquisarFuncao() {
		if (jbPesquisarFuncao == null) {
			try {
				jbPesquisarFuncao = new JButton();
				jbPesquisarFuncao.setBounds(new Rectangle(120, 60, 106, 31));
				jbPesquisarFuncao.setText("Pesquisar");
				jbPesquisarFuncao.addMouseListener(new java.awt.event.MouseAdapter() {
					public void mouseClicked(java.awt.event.MouseEvent e) {
						Funcao f = new Funcao();
						f.setDescricao(jtfDescricaoFuncao.getText());
						funcoes = funcaoAction.pesquisar(f);
						Vector<String> sFuncoes = new Vector<String>();
						for (Funcao funcao : funcoes){ 
							sFuncoes.add(funcao.getDescricao());
						}
						jListFuncoesFuncoes.setListData(sFuncoes);
						jListFuncoesFuncoes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
						limparCamposFuncao();
						jbSalvarFuncao.setEnabled(false);
					}
				});
			} catch (java.lang.Throwable e) {
				// TODO: Something
			}
		}
		return jbPesquisarFuncao;
	}

	/**
	 * This method initializes jbSalvarFuncao	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJbSalvarFuncao() {
		if (jbSalvarFuncao == null) {
			try {
				jbSalvarFuncao = new JButton();
				jbSalvarFuncao.setBounds(new Rectangle(240, 60, 91, 31));
				jbSalvarFuncao.setText("Salvar");
				jbSalvarFuncao.setEnabled(false);
				jbSalvarFuncao.addMouseListener(new java.awt.event.MouseAdapter() {
					public void mouseClicked(java.awt.event.MouseEvent e) {
						if(jbSalvarFuncao.isEnabled()){
							Funcao novo = new Funcao();
							novo.setDescricao(getJtfDescricaoFuncao().getText());
							if(funcaoAction.alterar(funcaoAntigo, novo))
								JOptionPane.showMessageDialog(null, "Função "+novo.getDescricao() + " atualizada com sucesso.");	
							atualizarTelas();
							limparCamposFuncao();
							telaFuncionario.atualizarCombobox();
							jbSalvarFuncao.setEnabled(false);
						}
					}
				});
			} catch (java.lang.Throwable e) {
				// TODO: Something
			}
		}
		return jbSalvarFuncao;
	}

	/**
	 * This method initializes jbApagarFuncao	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJbApagarFuncao() {
		if (jbApagarFuncao == null) {
			try {
				jbApagarFuncao = new JButton();
				jbApagarFuncao.setBounds(new Rectangle(255, 150, 76, 31));
				jbApagarFuncao.setText("Apaga");
				jbApagarFuncao.addMouseListener(new java.awt.event.MouseAdapter() {
					public void mouseClicked(java.awt.event.MouseEvent e) {
						int index = jListFuncoesFuncoes.getSelectedIndex();
						if(index != -1){
							Funcao funcao = funcoes.get(index);
							int confirmacao = JOptionPane.showConfirmDialog(null, "Confirma a exclusão da Função: " + funcao.getDescricao()+" ?") ; 
							if(confirmacao == 0)
								funcaoAction.deletar(funcao);
							atualizarTelas();
							limparCamposFuncao();
							telaFuncionario.atualizarCombobox();
							jbSalvarFuncao.setEnabled(false);
						}
					}
				});
			} catch (java.lang.Throwable e) {
				// TODO: Something
			}
		}
		return jbApagarFuncao;
	}

	/**
	 * This method initializes jbEditaFuncao	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJbEditaFuncao() {
		if (jbEditaFuncao == null) {
			try {
				jbEditaFuncao = new JButton();
				jbEditaFuncao.setBounds(new Rectangle(255, 195, 76, 31));
				jbEditaFuncao.setText("Editar");
				jbEditaFuncao.addMouseListener(new java.awt.event.MouseAdapter() {
					public void mouseClicked(java.awt.event.MouseEvent e) {
						int index = jListFuncoesFuncoes.getSelectedIndex();
						if(index != -1){
							funcaoAntigo = funcoes.get(index);
							jtfDescricaoFuncao.setText(funcaoAntigo.getDescricao());
							jbSalvarFuncao.setEnabled(true);
						}
					}
				});
			} catch (java.lang.Throwable e) {
				// TODO: Something
			}
		}
		return jbEditaFuncao;
	}
	private void atualizarTelas() {
		getJListFuncoesFuncoes();
		
	}
	private void limparCamposFuncao() {
		jtfDescricaoFuncao.setText("");
		
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
