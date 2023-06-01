package sdbms;

public interface StudentManagementSystem {
	void addStudent();
	void displayStudent();
	void displayAllStudent();
	void removeStudent();
	void removeAllStudent();
	void updateStudent();
	void countStudent();
	void sortStudent();
	void findStudentWithHighestMarks();
	void findStudentWithLowestMarks();
}

//all the methods inside interface are by default public and abstract.