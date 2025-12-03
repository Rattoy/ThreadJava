package tddTesting;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
	
	private List<Student> gp = new ArrayList<>();
	
	
	public boolean addStudent(Student st) {
		if (!searchStudent(st)) {
			return gp.add(st);
		}
		return false;
	}
	
	public boolean deleteStudent(Student st) {
		
		return gp.remove(st);
	}
	
	public boolean EditStudent(Student st, int newId , String newName , String newField) {
		for(Student et : gp) {
			if (et.equals(st)) {
				et.setField(newField);
				et.setId(newId);
				et.setName(newName);
				return true;
			}
		}
		return false;
	}
	
	public Student findStudent(int id) {
		
		for(Student et : gp) {
			if (et.getId() == id) {
				return et;
			}
		}
		return null;
	}
	
	public boolean searchStudent(Student st) {
		
		for(Student et : gp) {
			if (et.equals(st)) {
				return true;
			}
		}
		return false;
	}
	
	
	public List<Student> getStudentsGroup(){
		return gp;
	}
}
