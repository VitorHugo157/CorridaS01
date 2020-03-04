package controller;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ThreadSapo extends Thread{
	private static final int maximoDescanço = 500;
	private static final int maximoPulo = 20;
	private static Object monitor = new Object();
	private String nome;
	private JLabel lblSapo;
	private JButton btnStartRace;
	private int distanciaPercorrida;
	private int distanciaTotal;
	private static int colocacao;
	
	public ThreadSapo(JLabel lblSapo, JButton btnStartRace, String nome, int distanciaTotal) {
		this.lblSapo = lblSapo;
		this.btnStartRace = btnStartRace;
		this.nome = nome;
		this.distanciaTotal = distanciaTotal;
	}
	
	private void pular() {
		btnStartRace.setEnabled(false);
		Rectangle pulo;
		pulo = lblSapo.getBounds();
		lblSapo.setBounds(pulo);
		pulo.x = pulo.x + (int) (Math.random() * maximoPulo);
		lblSapo.setBounds(pulo);
		try {
			int tempo = (int) (Math.random() * maximoDescanço);
			Thread.sleep(tempo);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		distanciaPercorrida += pulo.x;
		if(distanciaPercorrida > distanciaTotal) {
			distanciaPercorrida = distanciaTotal;
			pulo.x = distanciaPercorrida;
		}
	}
	
	private void cruzarLinhaDeChegada() {
		synchronized (monitor) {
			colocacao++;
			JOptionPane.showMessageDialog(null, "=> " + nome + " cruzou a linha de chegada em " +colocacao + "º lugar!");
		}
	}
	
	@Override
	public void run() {
		começar();
	}
	
	public void começar() {
		while (distanciaPercorrida < distanciaTotal) {
			pular();
		}
		cruzarLinhaDeChegada();
		btnStartRace.setEnabled(true);
	}
}
