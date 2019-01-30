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
		Student Larry = new Student("Larry", 20023);
		Student Kobe = new Student("Kobe", 24);
		Student Siva = new Student("Siva", 24);
		Student Durant = new Student("Durant", 24);
		Student Fiona = new Student("Fiona", 24);
		Student Winni = new Student("Winni", 24);
		Student James = new Student("James", 24);
		Student Paul = new Student("Paul", 24);
		Student Wade = new Student("Wade", 24);
		Student Antetokounmpo = new Student("Antetokounmpo", 24);
		
		Course java = new Course("java");
		
		java.registerStudent(Larry);
		java.registerStudent(Kobe);
		java.registerStudent(Siva);
		java.registerStudent(Durant);
		java.registerStudent(Fiona);
		java.registerStudent(Winni);
		java.registerStudent(James);
		java.registerStudent(Paul);
		java.registerStudent(Wade);
		java.registerStudent(Antetokounmpo);
		
		System.out.println(java.isFull());
		for (Student k : java.getStudents()) {
			System.out.println("Name:" + k.name + " ID:" + k.id);
		}
		System.out.println(java.numberOfStudent);

	}

}
