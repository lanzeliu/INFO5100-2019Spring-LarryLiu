package assignment3;

public class Course {
	private String name;
	private int numberOfStudent = 0;
	private Student[] regStu = new Student[10];
	
	public Course(String name) {
		this.name = name;
	}
	
	public Student[] getStudents() {
		return regStu;
	}
	
	public boolean isFull() {
		if ( numberOfStudent < 10 ) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public void registerStudent(Student student) {
		if ( !(this.isFull()) ) {
			regStu[numberOfStudent] = student;
			numberOfStudent++;
		}
		else {
			throw new RuntimeException("This course is full.");
		}
	}

	public static void main(String[] args) {
		Student larry = new Student("larry", 20023);
		Student kobe = new Student("kobe", 24);
		Course java = new Course("java");
		java.registerStudent(larry);
		java.registerStudent(kobe);
		System.out.println(java.isFull());
		System.out.println(java.getStudents());
		System.out.println(java.numberOfStudent);

	}

}
