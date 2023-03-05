package interfacee;

import model.Student;

public interface StudentInterface 
{
	public interface StudentDaoInterface
	{
	    public boolean insertStudent(Student s);
	    public boolean delete(int roll);
	    public boolean update(int roll,String update,int ch,Student s);
	    public void showAllStudent();
	    public boolean showStudentById(int roll);

	}

	boolean update(int roll, String update, int ch, Student s);

	boolean delete(int roll);

	boolean insertStudent(Student s);

	void showAllStudent();

	boolean showStudentById(int roll);
	
}