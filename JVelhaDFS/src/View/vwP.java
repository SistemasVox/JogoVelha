package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.BadLocationException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vwP extends JFrame {

	private JPanel contentPane;
	private JButton bm, bh;
	private JButton btnImpossvel;
	private JButton btnMdio;
	private JButton btnFcil;
	private int h = 0, m = 0;
	private int matriz [] = new  int[9];
	private JButton botoes [] = new  JButton[9];
	private ArrayList<Integer> casasDispo = new ArrayList<Integer>();
	private int vez = 0;
	private String vezS = "X";
	private JButton btnJA;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vwP frame = new vwP();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public vwP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 505);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblV = new JLabel("V: 1.0");
		lblV.setHorizontalAlignment(SwingConstants.RIGHT);
		lblV.setBounds(671, 0, 46, 14);
		contentPane.add(lblV);
		
		botoes[0] = new JButton("X");
		botoes[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				matriz[0] = whoX();
				botoes [0].setText(vezS);
				vez ++;
				trocarVez();
				jogarAle();
			}
		});
		botoes[0].setFont(new Font("Tahoma", Font.BOLD, 44));
		botoes[0].setBounds(10, 141, 100, 100);
		contentPane.add(botoes[0]);
		
		botoes[1] = new JButton("X");
		botoes[1].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				matriz[1] = whoX();
				botoes [1].setText(vezS);	
				vez ++;
				trocarVez();
				jogarAle();
			}
		});
		botoes[1].setBounds(120, 141, 100, 100);
		botoes[1].setFont(new Font("Tahoma", Font.BOLD, 44));
		contentPane.add(botoes[1]);
		
		botoes[2] = new JButton("X");
		botoes[2].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				matriz[2] = whoX();
				botoes [2].setText(vezS);	
				vez ++;
				trocarVez();
				jogarAle();
			}
		});
		botoes[2].setBounds(230, 141, 100, 100);
		botoes[2].setFont(new Font("Tahoma", Font.BOLD, 44));
		contentPane.add(botoes[2]);
		
		botoes[3] = new JButton("X");
		botoes[3].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				matriz[3] = whoX();
				botoes [3].setText(vezS);	
				vez ++;
				trocarVez();
				jogarAle();
			}
		});
		botoes[3].setBounds(10, 252, 100, 100);
		botoes[3].setFont(new Font("Tahoma", Font.BOLD, 44));
		contentPane.add(botoes[3]);
		
		botoes[4] = new JButton("X");
		botoes[4].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				matriz[4] = whoX();
				botoes [4].setText(vezS);
				vez ++;
				trocarVez();
				jogarAle();
			}
		});
		botoes[4].setBounds(120, 252, 100, 100);
		botoes[4].setFont(new Font("Tahoma", Font.BOLD, 44));
		contentPane.add(botoes[4]);
		
		botoes[5] = new JButton("X");
		botoes[5].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				matriz[5] = whoX();
				botoes [5].setText(vezS);	
				vez ++;
				trocarVez();
				jogarAle();
			}
		});
		botoes[5].setFont(new Font("Tahoma", Font.BOLD, 44));
		botoes[5].setBounds(230, 252, 100, 100);
		contentPane.add(botoes[5]);
		
		botoes[6] = new JButton("X");
		botoes[6].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				matriz[6] = whoX();
				botoes [6].setText(vezS);	
				vez ++;
				trocarVez();
				jogarAle();
			}
		});
		botoes[6].setFont(new Font("Tahoma", Font.BOLD, 44));
		botoes[6].setBounds(10, 363, 100, 100);
		contentPane.add(botoes[6]);
		
		botoes[7] = new JButton("X");
		botoes[7].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				matriz[7] = whoX();
				botoes [7].setText(vezS);	
				vez ++;
				trocarVez();
				jogarAle();
			}
		});
		botoes[7].setFont(new Font("Tahoma", Font.BOLD, 44));
		botoes[7].setBounds(120, 363, 100, 100);
		contentPane.add(botoes[7]);
		
		botoes[8] = new JButton("X");
		botoes[8].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				matriz[8] = whoX();
				botoes [8].setText(vezS);		
				vez ++;
				trocarVez();
				jogarAle();
			}
		});
		botoes[8].setFont(new Font("Tahoma", Font.BOLD, 44));
		botoes[8].setBounds(230, 363, 100, 100);
		contentPane.add(botoes[8]);
		
		JTextArea txtrJogoDaVelha = new JTextArea();
		txtrJogoDaVelha.setBackground(UIManager.getColor("Button.background"));
		txtrJogoDaVelha.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtrJogoDaVelha.setEditable(false);
		txtrJogoDaVelha.setText("Jogo da Velha\r\nDepth-First Search - DFS");
		txtrJogoDaVelha.setBounds(10, 45, 320, 85);
		centerText(txtrJogoDaVelha);
	
		contentPane.add(txtrJogoDaVelha);
		
		JLabel lblModos = new JLabel("Modos:");
		lblModos.setEnabled(false);
		lblModos.setHorizontalAlignment(SwingConstants.CENTER);
		lblModos.setFont(new Font("Vijaya", Font.BOLD | Font.ITALIC, 24));
		lblModos.setBounds(398, 203, 319, 41);
		contentPane.add(lblModos);
		
		btnImpossvel = new JButton("Imposs\u00EDvel.");
		btnImpossvel.setEnabled(false);
		btnImpossvel.setBounds(596, 237, 121, 23);
		contentPane.add(btnImpossvel);
		
		btnMdio = new JButton("M\u00E9dio.");
		btnMdio.setEnabled(false);
		btnMdio.setBounds(497, 237, 89, 23);
		contentPane.add(btnMdio);
		
		btnFcil = new JButton("F\u00E1cil.");
		btnFcil.setBounds(398, 237, 89, 23);
		contentPane.add(btnFcil);
		
		JLabel lblSistemasVox = new JLabel("Sistemas VOX");
		lblSistemasVox.setHorizontalAlignment(SwingConstants.CENTER);
		lblSistemasVox.setFont(new Font("Vijaya", Font.BOLD | Font.ITALIC, 40));
		lblSistemasVox.setBounds(10, 0, 707, 41);
		contentPane.add(lblSistemasVox);
		
		JLabel lblPlacar = new JLabel("Placar:");
		lblPlacar.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlacar.setFont(new Font("Vijaya", Font.BOLD | Font.ITALIC, 24));
		lblPlacar.setBounds(398, 271, 319, 41);
		contentPane.add(lblPlacar);
		
		JLabel lblMquina = new JLabel("M\u00E1quina");
		lblMquina.setHorizontalAlignment(SwingConstants.CENTER);
		lblMquina.setFont(new Font("Vijaya", Font.BOLD | Font.ITALIC, 24));
		lblMquina.setBounds(398, 323, 160, 41);
		contentPane.add(lblMquina);
		
		JLabel lblHumano = new JLabel("Humano");
		lblHumano.setHorizontalAlignment(SwingConstants.CENTER);
		lblHumano.setFont(new Font("Vijaya", Font.BOLD | Font.ITALIC, 24));
		lblHumano.setBounds(557, 323, 160, 41);
		contentPane.add(lblHumano);
		
		bm = new JButton(String.valueOf(m));
		bm.setFont(new Font("Tahoma", Font.BOLD, 44));
		bm.setBounds(429, 363, 100, 100);
		contentPane.add(bm);
		
		bh = new JButton(String.valueOf(h));
		bh.setFont(new Font("Tahoma", Font.BOLD, 44));
		bh.setBounds(585, 363, 100, 100);
		contentPane.add(bh);
		
		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reiniciar();
			}
		});
		btnReiniciar.setBounds(529, 141, 89, 23);
		contentPane.add(btnReiniciar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setEnabled(false);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnSair.setBounds(628, 141, 89, 23);
		contentPane.add(btnSair);
		
		btnJA = new JButton("Jogar P/Mim");
		btnJA.setEnabled(false);
		btnJA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogarAle();
			}
		});
		btnJA.setBounds(398, 141, 121, 23);
		contentPane.add(btnJA);
	}

	protected void jogarAle() {
		atualizarCasasDisp();
		if (casasDispo.size() == 1) {
			btnJA.setEnabled(false);
		}
		int n = (int)Math.round(Math.random() * (casasDispo.size()-1)); 		
		matriz[casasDispo.get(n)] = whoX();
		botoes [casasDispo.get(n)].setText(vezS);
		vez ++;
		trocarVez();
		verificarGanhador();
	
	}

	private void verificarGanhador() {
		int soma;
		
		soma = matriz[0] + matriz[1] + matriz[2];
		if (soma == 3) {
			JOptionPane.showMessageDialog(null, "X, venceu.");
			btnJA.setEnabled(false);
		}else if (soma == -3) {
			JOptionPane.showMessageDialog(null, "O, venceu.");
			btnJA.setEnabled(false);
		}
		soma = matriz[0] + matriz[3] + matriz[6];
		if (soma == 3) {
			JOptionPane.showMessageDialog(null, "X, venceu.");
			btnJA.setEnabled(false);
		}else if (soma == -3) {
			JOptionPane.showMessageDialog(null, "O, venceu.");
			btnJA.setEnabled(false);
		}
		soma = matriz[0] + matriz[4] + matriz[8];
		if (soma == 3) {
			JOptionPane.showMessageDialog(null, "X, venceu.");
			btnJA.setEnabled(false);
		}else if (soma == -3) {
			JOptionPane.showMessageDialog(null, "O, venceu.");
			btnJA.setEnabled(false);
		}
		soma = matriz[1] + matriz[4] + matriz[7];
		if (soma == 3) {
			JOptionPane.showMessageDialog(null, "X, venceu.");
			btnJA.setEnabled(false);
		}else if (soma == -3) {
			JOptionPane.showMessageDialog(null, "O, venceu.");
			btnJA.setEnabled(false);
		}
		soma = matriz[2] + matriz[4] + matriz[6];
		if (soma == 3) {
			JOptionPane.showMessageDialog(null, "X, venceu.");
			btnJA.setEnabled(false);
		}else if (soma == -3) {
			JOptionPane.showMessageDialog(null, "O, venceu.");
			btnJA.setEnabled(false);
		}
		soma = matriz[2] + matriz[5] + matriz[8];
		if (soma == 3) {
			JOptionPane.showMessageDialog(null, "X, venceu.");
			btnJA.setEnabled(false);
		}else if (soma == -3) {
			JOptionPane.showMessageDialog(null, "O, venceu.");
			btnJA.setEnabled(false);
		}
		soma = matriz[3] + matriz[4] + matriz[5];
		if (soma == 3) {
			JOptionPane.showMessageDialog(null, "X, venceu.");
			btnJA.setEnabled(false);
		}else if (soma == -3) {
			JOptionPane.showMessageDialog(null, "O, venceu.");
			btnJA.setEnabled(false);
		}
		soma = matriz[6] + matriz[7] + matriz[8];
		if (soma == 3) {
			JOptionPane.showMessageDialog(null, "X, venceu.");
			btnJA.setEnabled(false);
		}else if (soma == -3) {
			JOptionPane.showMessageDialog(null, "O, venceu.");
			btnJA.setEnabled(false);
		}
	}

	private void trocarVez() {
		if (vez % 2 == 0) {
			vezS = "X";
		}else {
			vezS = "O";
		}
				
	}

	private int whoX() {
		if (vezS.equals("X")) {
			return 1;
		}
		return -1;
	}

	private void atualizarCasasDisp() {
		casasDispo.clear();
		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i] == 0) {
				casasDispo.add(i);
			}
		}	
		
	}

	protected void reiniciar() {
		for (int i = 0; i < botoes.length; i++) {
			botoes[i].setText("");
			matriz[i] = 0;
		}
		vez = 0;
		vezS = "X";
		btnJA.setEnabled(true);
		
	}

	public static void centerText (JTextArea ta)
	{
	    BufferedImage fake1 = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
	    Graphics2D fake2 = fake1.createGraphics();
	    FontMetrics fm = fake2.getFontMetrics(ta.getFont());

	    int lines = ta.getLineCount();
	    ArrayList<String> list = new ArrayList<>();
	    try
	    {
	        for (int i = 0; i < lines; i++)
	        {
	            int start = ta.getLineStartOffset(i);
	            int end = ta.getLineEndOffset(i);

	            String line = ta.getText(start, end - start).replace("\n","");
	            list.add (line.trim());
	        }
	    }
	    catch (BadLocationException e)
	    {
	        System.out.println(e);
	    }
	    alignLines (list, fm, ta);
	}

	private static void alignLines (ArrayList<String> list, FontMetrics fm, JTextArea ta)
	{
	    String leading = "      ";
	    int longest = -1;
	    for (String s : list)
	    {
	        if (fm.stringWidth(s) > longest)
	            longest = fm.stringWidth(s);
	    }
	    for (int n=0; n<list.size(); n++)
	    {
	        String s = list.get(n);
	        if (fm.stringWidth(s) >= longest)
	            continue;
	        while (fm.stringWidth(s) < longest)
	            s = ' '+s+' ';
	        list.set(n, s);
	    }
	    StringBuilder sb = new StringBuilder();
	    for (String s : list)
	    {
	        sb.append(leading).append(s).append('\n');
	    }
	    ta.setText (sb.toString());
	}
}
