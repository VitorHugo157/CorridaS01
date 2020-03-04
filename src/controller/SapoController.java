package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
public class SapoController implements ActionListener{
	public static final int distanciaTotal = 37000;
	private JLabel lblSapo1;
	private JLabel lblSapo2;
	private JLabel lblSapo3;
	private JLabel lblSapo4;
	private JLabel lblSapo5;
	private JButton btnStartRace;
	
	public SapoController(JLabel lblSapo1, JLabel lblSapo2, JLabel lblSapo3, JLabel lblSapo4, JLabel lblSapo5, JButton btnStartRace) {
		this.lblSapo1 = lblSapo1;
		this.lblSapo2 = lblSapo2;
		this.lblSapo3 = lblSapo3;
		this.lblSapo4 = lblSapo4;
		this.lblSapo5 = lblSapo5;
		this.btnStartRace = btnStartRace;
	}
	
	private void botaoSapo() {
		Thread t1 = new ThreadSapo(lblSapo1, btnStartRace, "Sapo 1", distanciaTotal);
		Thread t2 = new ThreadSapo(lblSapo2, btnStartRace, "Sapo 2", distanciaTotal);
		Thread t3 = new ThreadSapo(lblSapo3, btnStartRace, "Sapo 3", distanciaTotal);
		Thread t4 = new ThreadSapo(lblSapo4, btnStartRace, "Sapo 4", distanciaTotal);
		Thread t5 = new ThreadSapo(lblSapo5, btnStartRace, "Sapo 5", distanciaTotal);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	botaoSapo();
	}
}
