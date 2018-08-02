package collection.basic.list;

public class Student implements Comparable<Student> {
	private String name;

//Constructor
	public Student(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student name=" + name;
	}
	//hashcode and equals method together used to compare objects
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int compareTo(Student stu) {
		int compare = name.compareTo(stu.name);
		return compare;
	}
}
