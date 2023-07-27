package week2.day3;

public class Students {
	
	private String getStudentInfo(String ID) {
		return ID;
	}
	
	private void getStudentInfo(String ID, String name) {
		System.out.println("ID is "+ID);
		System.out.println("Name is "+name);
	}
	private String getStudentInfo(String name, String email, String phno) {
		System.out.println("Name:" +name);
		System.out.println("Email:" +email);
		System.out.println("Phno:" +phno);
		return email;
	
	}
	

	public static void main(String[] args) {
		Students stud=new Students();
		String id= stud.getStudentInfo("25001");
		System.out.println("ID:" +id);
		stud.getStudentInfo("25002", "Sudha");
		stud.getStudentInfo("Priya", "test@gmail.com", "9856153612");		
	}

}
