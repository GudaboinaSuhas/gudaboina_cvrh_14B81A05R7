import java.util.ArrayList;
import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
//		return null;
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		for(int i=0;i<students.length;i++)
		{
			this.students[i].setId(students[i].getId());
			this.students[i].setFullName(students[i].getFullName());
			this.students[i].setBirthDate(students[i].getBirthDate());
			this.students[i].setAvgMark(students[i].getAvgMark());
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		for(int i=0;i<students.length;i++)
		{
			if(i==index)
			{
				return students[i];
			}
		}
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		this.students[index]=student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(this.students==null)
			throw new IllegalArgumentException();
		else
		{
			for(int i=students.length;i>0;i--)
			{
				students[i]=students[i-1];	
			}
			students[0]=student;
		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		int index=students.length;
		students[index]=student;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		students[index]=student;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		ArrayList<Student> al=new ArrayList<Student>();
		for(int i=0;i<students.length;i++)
		{
			if(i==index)
				continue;
			al.add(students[i]);
		}
		this.students=null;
//		StudentGroup(al.size());
		Student[] students = al.toArray(new Student[al.size()]);
		al.clear();
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		ArrayList<Student> al=new ArrayList<Student>();
		for(int i=0;i<students.length;i++)
		{
			if(this.students[i].getFullName()==student.getFullName())
				continue;
			al.add(students[i]);
		}
		this.students=null;
		Student[] students = al.toArray(new Student[al.size()]);
		al.clear();
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		ArrayList<Student> al=new ArrayList<Student>();
		for(int i=0;i<index+1;i++)
		{
			al.add(students[i]);
		}
		this.students=null;
		Student[] students = al.toArray(new Student[al.size()]);
		al.clear();
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		ArrayList<Student> al=new ArrayList<Student>();
		for(int i=0;i<students.length;i++)
		{
			if(students[i]==student)
				break;
			al.add(students[i]);
		}
		this.students=null;
		Student[] students = al.toArray(new Student[al.size()]);
		al.clear();
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		ArrayList<Student> al=new ArrayList<Student>();
		for(int i=index+1;i<students.length;i++)
		{
			al.add(students[i]);
		}
		this.students=null;
		Student[] students = al.toArray(new Student[al.size()]);
		al.clear();
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		ArrayList<Student> al=new ArrayList<Student>();
		for(int i=0;i<students.length;i++)
		{
			if(students[i]==student)
			{
				al.add(students[i]);
				break;
			}
			al.add(students[i]);
		}
		this.students=null;
		Student[] students = al.toArray(new Student[al.size()]);
		al.clear();
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
