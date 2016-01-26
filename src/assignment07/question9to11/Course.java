package assignment07.question9to11;

public class Course {
	private String number;
	private String title;
	private int units;
	private Faculty faculty;
	
	Course(String number, String title, int units, Faculty faculty)
	{
		this.number = number;
		this.title = title;
		this.units = units;
		this.faculty = faculty;
	}

	public String getNumber() {
		return number;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
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
		Course other = (Course) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

	public int getUnits() {
		return units;
	}

	public Faculty getFaculty() {
		return faculty;
	}

}
