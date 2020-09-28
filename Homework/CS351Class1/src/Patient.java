
public class Patient {

	int id;
	String name;
	String age;
	String disease;
	String doctor;
	
	public Patient() {
		
	}
	
	public Patient(int id, String name,String age,String disease,String doctor) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name=name;
		this.age = age;
		this.disease = disease;
		this.doctor = doctor;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	@Override
	public String toString(){
		return "Id: " + id + " Name: " + name + " Age: " + age + " Disease: " + disease + " Doctor: " + doctor;
	}
}