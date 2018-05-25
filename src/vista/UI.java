package vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

public class UI extends JFrame {

	public JPanel contentPane;
	protected JButton btnF;
	protected JButton btnBuscar;
	protected JTextField txtUbicacion;
	protected JTextArea textArea;

	/**
	 * Create the frame.
	 */
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel lblLectorDeMusica = new JLabel("Lector de musica");
		GridBagConstraints gbc_lblLectorDeMusica = new GridBagConstraints();
		gbc_lblLectorDeMusica.gridwidth = 2;
		gbc_lblLectorDeMusica.insets = new Insets(0, 0, 5, 0);
		gbc_lblLectorDeMusica.gridx = 0;
		gbc_lblLectorDeMusica.gridy = 0;
		contentPane.add(lblLectorDeMusica, gbc_lblLectorDeMusica);

		JPanel panelConfiguracion = new JPanel();
		GridBagConstraints gbc_panelConfiguracion = new GridBagConstraints();
		gbc_panelConfiguracion.insets = new Insets(0, 5, 2, 10);
		gbc_panelConfiguracion.fill = GridBagConstraints.BOTH;
		gbc_panelConfiguracion.gridx = 0;
		gbc_panelConfiguracion.gridy = 1;
		contentPane.add(panelConfiguracion, gbc_panelConfiguracion);
		GridBagLayout gbl_panelConfiguracion = new GridBagLayout();
		gbl_panelConfiguracion.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_panelConfiguracion.rowHeights = new int[] { 0, 0, 0, 0, 0 };
		gbl_panelConfiguracion.columnWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_panelConfiguracion.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		panelConfiguracion.setLayout(gbl_panelConfiguracion);

		JLabel lblUbicacin = new JLabel("Ubicaci\u00F3n:");
		GridBagConstraints gbc_lblUbicacin = new GridBagConstraints();
		gbc_lblUbicacin.insets = new Insets(0, 0, 5, 5);
		gbc_lblUbicacin.gridx = 0;
		gbc_lblUbicacin.gridy = 0;
		panelConfiguracion.add(lblUbicacin, gbc_lblUbicacin);

		txtUbicacion = new JTextField();
		GridBagConstraints gbc_txtUbicacion = new GridBagConstraints();
		gbc_txtUbicacion.gridwidth = 2;
		gbc_txtUbicacion.insets = new Insets(0, 0, 5, 5);
		gbc_txtUbicacion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUbicacion.gridx = 0;
		gbc_txtUbicacion.gridy = 1;
		panelConfiguracion.add(txtUbicacion, gbc_txtUbicacion);
		txtUbicacion.setColumns(10);

		btnF = new JButton("F");
		GridBagConstraints gbc_btnF = new GridBagConstraints();
		gbc_btnF.insets = new Insets(0, 0, 5, 0);
		gbc_btnF.gridx = 2;
		gbc_btnF.gridy = 1;
		panelConfiguracion.add(btnF, gbc_btnF);

		JLabel lblFormato = new JLabel("Formato:");
		GridBagConstraints gbc_lblFormato = new GridBagConstraints();
		gbc_lblFormato.insets = new Insets(0, 0, 5, 5);
		gbc_lblFormato.gridx = 0;
		gbc_lblFormato.gridy = 2;
		panelConfiguracion.add(lblFormato, gbc_lblFormato);

		JPanel panelFormato = new JPanel();
		GridBagConstraints gbc_panelFormato = new GridBagConstraints();
		gbc_panelFormato.gridwidth = 3;
		gbc_panelFormato.insets = new Insets(0, 0, 0, 5);
		gbc_panelFormato.fill = GridBagConstraints.BOTH;
		gbc_panelFormato.gridx = 0;
		gbc_panelFormato.gridy = 3;
		panelConfiguracion.add(panelFormato, gbc_panelFormato);
		panelFormato.setLayout(new GridLayout(5, 0, 0, 0));

		JCheckBox chckbxmp = new JCheckBox(".mp3");
		chckbxmp.setEnabled(false);
		chckbxmp.setSelected(true);
		panelFormato.add(chckbxmp);

		JCheckBox chckbxmamp = new JCheckBox(".m4a/.mp4");
		chckbxmamp.setEnabled(false);
		chckbxmamp.setSelected(true);
		panelFormato.add(chckbxmamp);

		JCheckBox chckbxogg = new JCheckBox(".ogg");
		chckbxogg.setEnabled(false);
		chckbxogg.setSelected(true);
		panelFormato.add(chckbxogg);

		JCheckBox chckbxflac = new JCheckBox(".flac");
		chckbxflac.setEnabled(false);
		chckbxflac.setSelected(true);
		panelFormato.add(chckbxflac);

		JCheckBox chckbxwav = new JCheckBox(".wav");
		chckbxwav.setEnabled(false);
		chckbxwav.setSelected(true);
		panelFormato.add(chckbxwav);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridheight = 2;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 1;
		contentPane.add(scrollPane, gbc_scrollPane);

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		btnBuscar = new JButton("Buscar");
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.insets = new Insets(0, 0, 0, 5);
		gbc_btnBuscar.gridx = 0;
		gbc_btnBuscar.gridy = 2;
		contentPane.add(btnBuscar, gbc_btnBuscar);
	}

}
