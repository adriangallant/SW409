import java.util.ArrayList;

public class TestPatient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a =10;
//		String s="bbb";
//		int[] numArray = new int[10];
//		ArrayList<Patient> alist = new ArrayList<>();
		
		//instead of hard coding, replace hard code with file, each patient object should have at least 5 parameters
		//[id,name, disease, age, doctor]
		// patient id text box should be replaced with a dropdown displaying all patient id's
		//add exit button
		
		PatientService patientService = new PatientService();
		ArrayList<Patient> alist = patientService.getPatientListFromFile("/Applications/workspace-spring-tool-suite-4-4.7.2.RELEASE/CS351Class1/src/patientList.txt");
		
		PatientGUI pg = new PatientGUI(alist);

	}
	
	
//	1. Download  Patient , PatientGUI and TestPatient classes   --DONE
//	2. Make it running and make sure that it creates the output file with Patient oblect. --DONE
//	3. Modify the project as  mentioned below
//
//	   a. Read Patient's data from file instead of  hard coding as shown below --DONE
//
//	Patient p1 = new Patient(1,"aaa");
//
//	alist.add(p1);
//
//	b. Patient's object should have at least 5. 
//	c. Replace the Patient's id textbox with drop down.
//	d. Add Exit button.

}