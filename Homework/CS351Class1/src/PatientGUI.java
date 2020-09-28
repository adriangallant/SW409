import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.io.PrintWriter;

public class PatientGUI extends JFrame {

	ArrayList<Patient> plist;
	String[] idList;
	PatientService patientService;

	public PatientGUI(ArrayList<Patient> list) {
		
		patientService = new PatientService();

		plist = list;
		idList = patientService.getIdListFromPatientList(list);
		createPatientUI();

	}

	private void createPatientUI() {
		{
			JFrame jframe = new JFrame("Patient GUI");

			jframe.setLayout(null);

			JLabel pld = new JLabel("Patient's ID: ");
			pld.setBounds(10, 50, 150, 20);
			JComboBox<String> pldtxt = new JComboBox<String>(idList);
			pldtxt.setBounds(200, 50, 150, 20);

			JLabel pName = new JLabel("Name: ");
			pName.setBounds(10, 80, 150, 20);
			JTextField pNametxt = new JTextField(" ");
			pNametxt.setBounds(200, 80, 150, 20);
			
			JLabel patientAgeLabel = new JLabel("Age: ");
			patientAgeLabel.setBounds(10, 110, 150, 20);
			JTextField patientAgeTextField = new JTextField(" ");
			patientAgeTextField.setBounds(200,110,150,20);
			
			JLabel patientDiseaseLabel = new JLabel("Disease: ");
			patientDiseaseLabel.setBounds(10, 140, 150, 20);
			JTextField patientDiseaseTextField = new JTextField(" ");
			patientDiseaseTextField.setBounds(200,140,150,20);
			
			JLabel patientDoctorLabel = new JLabel("Doctor: ");
			patientDoctorLabel.setBounds(10, 170, 150, 20);
			JTextField patientDoctorTextField = new JTextField(" ");
			patientDoctorTextField.setBounds(200,170,150,20);

			;

			JButton printToFileButton = new JButton("PrintToFile");
			printToFileButton.setBounds(10, 300, 100, 20);

			JButton populateButton = new JButton("Populate Patient's Details");
			populateButton.setBounds(150, 300, 200, 20);
			
			JButton exitProgramButton = new JButton("Exit");
			exitProgramButton.setBounds(400, 300, 100, 20);

			printToFileButton.addActionListener(new ActionListener() {

				@Override

				public void actionPerformed(ActionEvent e) {

					// Get selected name from combox as shown below

					int id = Integer.parseInt((String) pldtxt.getSelectedItem());

					// go through the Player array list,

					// print the details of the selected Player to a file.
					for (Patient p : plist) {

						if (id == p.id) {

							try {
								PrintWriter fw = new PrintWriter("patient.txt");
								fw.write(p.toString());

								fw.close();
							} catch (Exception ec) {

								System.out.println(" " + ec);

							}

						}

					}
				}

			}

			);

			populateButton.addActionListener(new ActionListener() {

				@Override

				public void actionPerformed(ActionEvent e) {

					// Get selected name from combox, go through the Player array list,

					int id = Integer.parseInt((String) pldtxt.getSelectedItem());
					for (Patient p : plist) {

						if (id == p.id) {

							pNametxt.setText(p.name);
							patientAgeTextField.setText(p.age);
							patientDiseaseTextField.setText(p.disease);
							patientDoctorTextField.setText(p.doctor);
						}

					}

					// and populate the GUI with proper details

				}

			});
			
			exitProgramButton.addActionListener(new ActionListener() {
				@Override
				
				public void actionPerformed(ActionEvent e) {
					jframe.dispose();
				}
				
			});
			
			

			jframe.add(pld);
			jframe.add(pldtxt);

			jframe.add(pName);
			jframe.add(pNametxt);
			
			jframe.add(patientAgeLabel);
			jframe.add(patientAgeTextField);

			jframe.add(patientDiseaseLabel);
			jframe.add(patientDiseaseTextField);
			
			jframe.add(patientDoctorLabel);
			jframe.add(patientDoctorTextField);

			jframe.add(populateButton);

			jframe.add(printToFileButton);
			
			jframe.add(exitProgramButton);

			jframe.setSize(600, 500);

			jframe.setVisible(true);

			jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		}
	}
}