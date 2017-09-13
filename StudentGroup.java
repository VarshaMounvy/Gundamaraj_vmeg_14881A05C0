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
		if(index < 0 || index >=students.length)
		{
			throw new Exception("IllegalArgumentException");
		}
		else
		{
			s.students=students;
		}
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(students == null)
		{
			throw new Exception("IllegalArgumentException");
		}
		else
		{
		s.setStudent=students;
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		  if(index < 0 || index >=students.length)
		  {
			  throw new Exception("IllegalArgumentException");
		  }
		  else
		  {
			  s.getStudent=students;
		  }
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(students == null)
		{
			throw new Exception("IllegalArgumentException");
		}
		elseif(index < 0 || index >=students.length)
		{
			throw new Exception("IllegalArgumentException");
		}
		else
		{
			s.setStudent=students;
		}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student == null)
		{
			throw new Exception("IllegalArgumentException");
		}
		else
		{
			s.addFirstOfStudent=students
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student == null)
		{
			throw new Exception("IllegalArgumentException");
		}
		else
		{
			s.addLastOfStudent=students
		}
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(student == null)
		{
			throw new Exception("IllegalArgumentException");
		}
	elseif(index < 0 || index >=students.length)
	      {
			  throw new Exception("IllegalArgumentException");
		  }
		  else
		  {
			  s.addStudent=students;
		  }
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(index < 0 || index >=students.length)
		{
			throw new Exception("IllegalArgumentException");
		}
		else
		{
			s.removeStudent=students;
		}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if(student == null)
		{
			throw new Exception("IllegalArgumentException");
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(index < 0 || index >=students.length)
		{
			throw new Exception("IllegalArgumentException");
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		if(student == null)
		{
			throw new Exception("IllegalArgumentException");
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if(index < 0 || index >=students.length)
		{
			throw new Exception("IllegalArgumentException");
		}
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		if(student == null)
		{
			throw new Exception("IllegalArgumentException");
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		int i;
		String value[];
		for(i=0;i<students.length;i++)
		{
			value[i]=students[i];
			student[i]=students[i+1];
			return value;
		
		
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		if(date == null)
		{
			throw new Exception("IllegalArgumentException");
		}
		else
		{
			s.BithDate=Date date;
		}
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		if(firstDate == null || lastDate == null)
		{
			throw new Exception("IllegalArgumentException");
		}
		elseif()
		{
			s.firstDate=Date firstDate;
		}
		else
		{
			s1.lastDate=Date lastDate;
		}
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		if(date == null)
		{
			throw new Exception("IllegalArgumentException");
		}
		else
		{
			s.NearBirthDate=Date date;
		}
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		if(indexOfStudent == null)
		{
			throw new Exception("IllegalArgumentException");
		}
		else
		{
			s.indexOfStudent=Student;
		}
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
		if(student == null)
		{
			throw new Exception("IllegalArgumentException");
		}
		else
		{
			s.NextStudent=Student student;
		}
		return null;
	}
}
