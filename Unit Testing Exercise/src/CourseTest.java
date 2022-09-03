
import static org.junit.Assert.fail;

import org.junit.Test;

public class CourseTest {

	@Test
	public void testnumAssignments() {
		Course assignments = new Course(1);
		
		int numAssignments = assignments.getNumAssignments();
		int result = numAssignments;
		
		
		if (result == 0)
			fail("Must have atleast one assignment");		
	}
	@Test
	public void testaddStudent() {
		Course student = new Course(0);
		
		boolean result = student.addStudent("Test");
		
		if (result != true)
			fail("Student was not added");
		
		if (result == false)
			fail("Student was already added");
		
		
	}
	@Test
	public void testisStudentEnrolled() {
		Course enroll = new Course(0);
		boolean result = enroll.isStudentEnrolled("Test");
		
		if (result == true)
			fail("Student not available");
	}
	@Test
	public void removeStudent() {
		Course remove = new Course(0);
		
		boolean result = remove.removeStudent("Test");
		
		if (result == true)
			fail("Failed to remove Student");
		
	}
	@Test
	public void testsetStudentAssignmentGrade() {
		Course setGrade = new Course(0);
		
		boolean result = setGrade.setStudentAssignmentGrade(1, 1, "Test");
		
		if (result == true);
			fail("Grade was not given");
		
		if (result != true)
			fail("Assignment was not given");
		if (result == false)
			fail("Student was not enrolled");
		if (result != false)
			fail("Grade is not valid");
	}
	@Test
	public void testgetStudentAssignmentGrade() {
		Course getGrade = new Course(0);
		
		int result = getGrade.getStudentAssignmentGrade(1, "Test");
		
		if (result == -1)
			fail("Illegal grade");
		if (result != -1)
			fail("Student was not enrolled");
		
	}
}
