import java.io.File;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PatientService {
	
	private Scanner scanner;
	
	public ArrayList<Patient> getPatientListFromFile(String fileName) {
		
		ArrayList<Patient> patientList = new ArrayList<Patient>();
		
		patientList = openFile(fileName);
		
		return patientList;
	}
	
	private ArrayList<Patient> openFile(String fileName){
		ArrayList<Patient> patientList = new ArrayList<Patient>();
		try {
			scanner = new Scanner(new File(fileName));
			patientList = readFile();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return patientList;
	}
	
	private ArrayList<Patient> readFile() {
		ArrayList<Patient> patientList = new ArrayList<Patient>();
		while(scanner.hasNext()) {
			Patient patient = new Patient(Integer.parseInt(scanner.next()), scanner.next(), scanner.next(), scanner.next(), scanner.next());
			patientList.add(patient);
		}
		closeFile();
		return patientList;
	}
	
	private void closeFile() {
		scanner.close();
	}
	
	public String[] getIdListFromPatientList(ArrayList<Patient> patientList){
		String[] idList = new String[patientList.size()];
		for(int i = 0; i < patientList.size(); i++){
			idList[i] = Integer.toString(patientList.get(i).getId());
		}
		return idList;
	}

}
