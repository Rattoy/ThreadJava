package tddTesting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tddTesting.Student;
import tddTesting.StudentGroup;



public class StudentTest {
	
	
	private StudentGroup group;
    private Student studentAlice;
    private Student studentBob;


    @BeforeEach
    void setUp() {
        group = new StudentGroup();
        studentAlice = new Student(101, "Alice Smith", "Computer Science");
        studentBob = new Student(202, "Bob Johnson", "Physics");
    }


    
    @Test
    void shouldAddStudentSuccessfully() {
        // Act
        group.addStudent(studentAlice);

        // Assert
        List<Student> students = group.getStudentsGroup();
        assertEquals(1, students.size(), "size should be 1");
        assertEquals("Alice Smith", students.get(0).getName(), "Should return true.");
    }
    
    @Test
    void shouldNotAddDuplicateIdStudent() {
        // Arrange
        Student studentAliceDuplicate = new Student(101, "Alice Clone", "Arts");
        
        // Act
        group.addStudent(studentAlice);
        group.addStudent(studentAliceDuplicate); 

        // Assert
        List<Student> students = group.getStudentsGroup();
        assertEquals(1, students.size(), "duplicated student should be added.");
        assertEquals("Alice Smith", students.get(0).getName(), "Student should no be changed.");
    }

    
    @Test
    void shouldDeleteStudentSuccessfully() {
        // Arrange
        group.addStudent(studentAlice);
        group.addStudent(studentBob);

        // Act
        boolean wasDeleted = group.deleteStudent(studentAlice); 

        // Assert
        assertTrue(wasDeleted, "should be able to delete a student");
        assertEquals(1, group.getStudentsGroup().size(), "list should return 1.");
        assertNull(group.findStudent(101), "Alice Should be founded");
    }

    @Test
    void shouldReturnFalseWhenDeletingNonExistentStudent() {
        // Arrange
        group.addStudent(studentAlice);

        // Act
        boolean wasDeleted = group.deleteStudent(studentBob); 

        // Assert
        assertFalse(wasDeleted, "should return false");
        assertEquals(1, group.getStudentsGroup().size(), "1");
    }
    
    @Test
    void shouldEditStudentFieldsSuccessfully() {
        // Arrange
        group.addStudent(studentAlice); 
        
        // Act
        boolean wasEdited = group.EditStudent(studentAlice, 20, "Alicia Smith", "Cyber Security");

        // Assert
        Student editedStudent = group.findStudent(20);
        assertTrue(wasEdited, "Editing should return true");
        assertNotNull(editedStudent, "Edited student is still exists.");
        assertEquals("Alicia Smith", editedStudent.getName(), "Name got edit");
        assertEquals("Cyber Security", editedStudent.getField(), "Field got edit");
        
    }
    
    @Test
    void shouldReturnFalseWhenEditingNonExistentStudent() {
        // Arrange
        group.addStudent(studentAlice);
        
        // Act
        boolean wasEdited = group.EditStudent(studentBob, 3 ,  "No Name", "No Field"); 

        // Assert
        assertFalse(wasEdited, "Should return false for non existing student");
        
        assertEquals("Alice Smith", group.findStudent(101).getName());
    }
	

}
